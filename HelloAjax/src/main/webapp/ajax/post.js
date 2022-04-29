/**
 * post.js
 */

document.addEventListener('DOMContentLoaded', init);

//리스트
function init() {
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json');
	xhtp.send();
	xhtp.onload = function() {
		let data = JSON.parse(xhtp.responseText);
		console.log(data);
		let tbodyList = document.getElementById('list');

		data.forEach(function(elem) {
			let newTr = makeTr(elem);
			tbodyList.appendChild(newTr);
		})

	}//end of onload
	
	let modBtn= document.querySelector('input[type=button]');
	modBtn.addEventListener('click',function(){
		let no = document.querySelector('input[name=sno]').value;
		let name = document.querySelector('input[name=sname]').value;
		let eScore = document.querySelector('input[name=eScore]').value;
		let kScore = document.querySelector('input[name=kScore]').value;
		
		let xhtp = new XMLHttpRequest();
		xhtp.open('get',`modStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`);
		xhtp.send();
		xhtp.onload = function (){
			
		
		
			let result = JSON.parse(xhtp.responseText);
			console.log(result);
			if (result.retCode == 'OK'){
				//결과값으로 받은값을 =>새로운 tr
				let obj = {
					studentNo:result.studNo,
					studentName:result.studName,
					engScore:result.engScore,
					korScore:result.korScore
				}
				let newTr = makeTr(obj);
				let oldTr = document.getElementById(result.studNo);
				console.log(newTr);
				console.log(oldTr);
				document.getElementById('list').replaceChild(newTr,oldTr);//새로운 tr =>이전 tr대체
			}else {
				alert('변경 중 오류');
				
			}
		
		}
		
	})
}//end of init()


//변경처리
function modStudent (){
	
	
}


//한건 추가
function addStudent(e) {
	e.preventDefault();
	//console.log(e);

	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;


	let xhtp = new XMLHttpRequest();
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`);
	xhtp.send();
	xhtp.onload = function() {
		//console.log(xhtp.responseText);//{"retCode":"Success"}
		let result = JSON.parse(xhtp.responseText);//{"retCode":"Fail"}
		if (result.retCode == 'Success') {
			//리스트 새로운 값 추가
			successCallBack2(result);//{retCode:?,stuNO:?,studName:?,escore:?,kscore:?}

		} else if (result.retCode == 'Fail') {
			// 처리중 에러가 발생.
			failCallBack();
		}

	}//end of function()

}//end of addStudent(e)

function makeTr(student) {
	tr = document.createElement('tr');
	tr.setAttribute('id', student.studentNo);//라인삭제 id => getElementById(id).remove();
	for (let field in student) {
		let td = document.createElement('td');
		td.innerHTML = student[field];
		tr.appendChild(td);
	}
	//console.log(tr);

	//삭제버튼 생성
	let delBtn = document.createElement('button');
	delBtn.innerHTML = '삭제';

	//이벤트 등록
	delBtn.addEventListener('click', function() {
		//삭제 (id 파악 => ajax호출) :this => 이벤트 대상 엘리먼트
		let id = this.parentElement.parentElement.firstChild.innerHTML;
		//console.log(id);
		let xhtp = new XMLHttpRequest();
		xhtp.open('get', 'delStudentServlet?delId=' + id);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			console.log(result);
			if (result.retCode == 'OK') {
				alert(result.retVal + '번이 삭제되었습니다');

			} else if (result.retCode == 'NG') {
				alert(result.retVal + '데이터삭제에 실패했습니다');

			}

		}
	})

	let td = document.createElement('td');
	td.appendChild(delBtn);
	tr.appendChild(td);

	return tr;

}//end of makeTr(student)

function successCallBack2(retObj) {
	console.log(retObj);
	let retobj = {
		sno: retObj.studNo,
		sname: retObj.studName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}
	let row = makeTr(retobj);
	document.getElementById('list').appendChild(row);

}//end of successCallBack2()

function successCallBack() {
	//사용자 입력값을 id='list' 하위 추가
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;

	let obj = {
		sno: no,
		sname: name,
		engScore: eng,
		korScore: kor
	}
	let row = makeTr(obj);
	document.getElementById('list').appendChild(row);
}

function failCallBack() {
	alert('처리 중 에러발생');
}