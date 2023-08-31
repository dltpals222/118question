//* 임시변수 사용
let a = 1;
let b = 2;

console.log("변경 전 a = " + a);
console.log("변경 전 b = " + b);

let c = a;
let d = b;

console.log("c = " + c);
console.log("d = " + d);

a = d;
b = c;

console.log("변경 후 a = " + a);
console.log("변경 후 b = " + b);
console.log("c = " + c);
console.log("d = " + d);

//* 배열 디스트럭처링(destructuring)

let x = 10;
let y = 20;

console.log("변경 전 x = " + x);
console.log("변경 전 y = " + y);

[x, y] = [y, x];

console.log("변경 후 x = " + x);
console.log("변경 후 y = " + y);
