//reference.js

const names = ['조수연','황진수','권가희','이유빈'];

for(let i=0;i<names.length; i++) {
  console.log((i+1)+'번째 이름 :'+names[i]);
}

//enhanced for. for (String name : names)
for (let name of names) {
  console.log(name);
}

const numbers = [23,44,38,12,56];
for (let num of numbers) {
  if(num>40){
    console.log(num);
  }
}
const inputs = [];
var sum =0;
var avg =0;
for (let i = 0; i<numbers.length;i++){
  var inputVal = prompt('값을 입력하세요');

  inputs[i]=parseInt(inputVal);
  sum = sum + inputs[i];
  avg = sum/numbers.length;
  console.log(typeof inputVal, inputVal);
  console.log(inputs[i]);
}
console.log('합계 : '+sum);
console.log('평균 : '+avg);

//합계를 구하는, 평균