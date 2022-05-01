'use strict';
let url = `https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=284&returnType=JSON&serviceKey=7Sc8y2o8nwjnhgHwF0dsrcVVWU926dK93ykFkBrMD1j8KTlf5VsGfzYsLsto0%2FswWjgumRugmOCM0qzWiHoo7Q%3D%3D`;
let xhtp = new XMLHttpRequest();
let fields = ['id', 'facilityName', 'address', 'phoneNumber', 'updatedAt']

xhtp.open('get', url)
xhtp.send()
xhtp.onload = function () {
    let result = JSON.parse(xhtp.responseText)
    init(result);
    let searchBtn = document.getElementById('search')
    let fields = ['id', 'facilityName', 'address', 'phoneNumber', 'updatedAt']
    searchBtn.addEventListener('click', function (e) {
        e.preventDefault();
        makeTr(result);
    })
}

let xhtp2 = new XMLHttpRequest();
xhtp2.open('get','../coronaServlet.json')
xhtp2.send();
xhtp2.onload = function(){
	
	
}


function makeTr(obj){
    let searchDt = document.getElementById('searchData').value;
    let tbody = document.getElementById('tbody')
    tbody.remove();
    let table = document.getElementById('table')
    tbody = document.createElement('tbody')
    tbody.setAttribute('id', 'tbody')
    table.appendChild(tbody)
    
    let filterAry = obj.data.filter(function(elem){ // 필터사용법
        console.log(elem.sido.indexOf(searchDt))
       return elem.sido.indexOf(searchDt) !=-1
        // 매개변수값이 없으면 -1반환
    })
    console.log(filterAry);
    filterAry.forEach(function (elem) {
        // if (elem.sido == searchDt) {      =>검색값에 입력값이 포함되면 다 검색되게 만들어보자
        //     let tr = document.createElement('tr');
        //     tbody.appendChild(tr);
        //     fields.forEach(function (val) {
        //         let td = document.createElement('td');
        //         td.innerHTML = elem[val];
        //         tr.appendChild(td)
        //     })
        // }
        let tr = document.createElement('tr');
        tbody.appendChild(tr)
        fields.forEach(function(val){
            let td = document.createElement('td');
            if (val == 'address'){
                let aTag = document.createElement('a')
                aTag.setAttribute('href',`daumApi.html?x=${center.lat}&y=${center.lng}`)
                aTag.innerHTML = elem[val];
                td.appendChild(aTag);
            }
            td.innerHTML = elem[val];
            tr.appendChild(td)

        })
    });
}

function init(jsonData) {
    console.log(jsonData)
    let tbody = document.getElementById('tbody')
    jsonData.data.forEach(function (element) {
        if (element.sido == '서울특별시') {
            let tr = document.createElement('tr');
            tbody.appendChild(tr);
            fields.forEach(function (val) {
                let td = document.createElement('td')
                td.innerHTML = element[val];
                tr.appendChild(td);
            })
        }
    })
}
        



    







