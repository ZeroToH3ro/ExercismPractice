function frontDoorPassword(word) {
    return word[0].toUpperCase() + word.slice(1, word.length).toLowerCase();
}

console.log(frontDoorPassword('minh'));