export class SongLyric {

    constructor() {
        this.lyrics = [[]];
    }

    addLyric(lyricPair) { // add individual, or paired lyrics? probably paired
        this.lyrics.push(lyricPair);
    }

    static parseLyrics(filename) {

    }
    
}