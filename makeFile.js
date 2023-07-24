const fs = require("fs");
const path = require("path");

const fileName = "Conditional";

const list = [".java", ".ts", ".py"];
const dirList = ["Java", "JavaScript", "Python"];
const mkFile = list.map((item, i) => path.join(__dirname, dirList[i], fileName + item));

mkFile.map((item) => fs.writeFileSync(item, ""));
