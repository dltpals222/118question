function MultiCond(x: number, y: number, z: number): void {
  if (z !== 0) {
    console.log("z가 0이 아닙니다.");
  } else if (x !== y) {
    console.log("z가 0입니다. 그리고 x와 y의 값이 다릅니다.");
  } else {
    console.log("z가 0입니다. 그리고 x와 y의 값이 같습니다.");
  }
}

MultiCond(1, 2, 3);
MultiCond(1, 2, 0);
MultiCond(2, 2, 0);
MultiCond(2, 2, 3);
