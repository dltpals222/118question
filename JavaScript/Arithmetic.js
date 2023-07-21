class Arithmetic {
  constructor(a, b) {
    this.a = a;
    this.b = b;
  }

  get add() {
    return this.a + this.b;
  }
  get minus() {
    return this.a - this.b;
  }
  get multi() {
    return this.a * this.b;
  }
  get division() {
    return this.a / this.b;
  }
}

const testOne = new Arithmetic(4, 2).add;
const testTwo = new Arithmetic(4, 2).minus;
const testThree = new Arithmetic(4, 2).multi;
const testFour = new Arithmetic(4, 2).division;

console.log("더하기", testOne);
console.log("빼기", testTwo);
console.log("곱하기", testThree);
console.log("나누기", testFour);
