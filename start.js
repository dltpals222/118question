const program = require('commander');
const makeFile = require('./makeFile')

program
  .arguments('<filename>')
  // .option('-t, --title <title>', 'set title')
  // .option('-a, --author <author>', 'set author')
  .action((filename) => {
    makeFile(filename)
  });


  program.parse(process.argv);
