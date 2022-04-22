//object.js
let member1 = {
  fullName : 'Hong',
  age : 20,
  score : 80
};
let member2 = {
  fullName : 'Hwang',
  age : 22,
  score : 88
}
let member3 = {
  fullName : 'Park',
  age : 25,
  score : 92
}
//{key : value} = map type
member1.fullName = '홍';
// console.log(member1.fullName);
// console.log(member3.age);
// console.log(typeof member3);

const members = [member1,member2,member3];
//홍의 나이는 20이고 점수는 80입니다
document.write('<ul>')
for (let i = 0; i<members.length;i++){
  console.log(members[i].fullName +'의 나이는 '
  +members[i].age+'이고 점수는 '
  +members[i].score+'입니다')
  
  document.write(`<li>${members[i].fullName},
  ${members[i].age},
  ${members[i].score}</li>`)
}
document.write('</ul>');
document.write('<h3>hong</h>');
let welcome = `안녕하세요.<br>

                반갑습니다.`;
document.write(welcome)
