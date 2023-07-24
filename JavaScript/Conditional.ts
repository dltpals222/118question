function Condition(x: number, y: number): void {
  if (x > y) {
    console.log(`x의 값(${x})은 y의 값(${y})보다 크다.`);
  } else {
    console.log(`x의 값(${x})은 y의 값(${y})보다 작다.`);
  }
}

Condition(3, 10);
Condition(10, 3);
