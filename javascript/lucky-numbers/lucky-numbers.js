// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  function arrayNumber(array){
    let result = array.reduce(
      (accumulator, currentValue) => accumulator + String(currentValue)
    );
    return result;
  }

  let result = Number(arrayNumber(array1)) + Number(arrayNumber(array2));
  return result;
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
  let numberPalindrome = value.toString();
  for(let i = 0; i < numberPalindrome.length/2; i++) {
    if (numberPalindrome.charAt(i) != numberPalindrome.charAt(numberPalindrome.length - 1 - i)){
      return false;
    }
  }
  return true;
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  if (!input) {
    return 'Required field';
  } else if (Number(input) == 0 || !Number(input)) {
    return 'Must be a number besides 0';
  } else {
    return '';
  }
}
