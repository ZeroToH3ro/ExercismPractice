export function getFirstCard(deck) {
  const [fC] = deck;
  return fC;
}
export function getSecondCard(deck) {
  const [fC,sC] = deck;
  return sC;
}
export function swapTopTwoCards(deck) {
  const [fC,sC, ...restDeck] = deck;
  return [sC, fC, ...restDeck];
}
export function discardTopCard(deck) {
  const [fC, ...restDeck] = deck;
  return [fC, restDeck];

}
const FACE_CARDS = ['jack', 'queen', 'king'];
export function insertFaceCards(deck) {
  const [fC, ...restDeck] = deck;
  return [fC, ...FACE_CARDS, ...restDeck]
}

        

          