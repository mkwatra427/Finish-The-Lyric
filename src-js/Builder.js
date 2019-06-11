
const fs = require('fs');

function parseLyrics(filename) {

    let fullSong = fs.readFileSync('lyricSource.txt', 'utf8'); // requires encoding option
    let tokenized = fullSong.split('\r\n');

    let song = new SongLyric();
    return fs.readFileSync(filename);
    
}