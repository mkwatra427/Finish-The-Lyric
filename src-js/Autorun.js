const fs = require('fs');
//fd = fs.openSync('lyricSource.txt');
let fullSong = fs.readFileSync('lyricSource.txt', 'utf8'); // requires encoding option
let tokenized = fullSong.split('\r\n');
console.log(tokenized);