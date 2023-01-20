/// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */
export function cookingStatus(time){
    let result = '';
    if (time == null){
        result = 'You forgot to set the timer.';
    } else if(time == 0) {
        result = 'Lasagna is done.';
    } else if (time != 0) {
        result = 'Not done, please wait.';
    }
    return result;
}
  
export function preparationTime(layers, averageTime = 2){
    return layers.length * averageTime;
}

export function quantities (ingredients) {
  return {
    noodles: ingredients.filter(i => i === 'noodles').length * 50, 
    sauce: ingredients.filter(i => i === 'sauce').length * 0.2
  }
}

export function addSecretIngredient (friendList, myList){
  myList.push(friendList[friendList.length - 1]);
}

 export function scaleRecipe(recipe, amount) {
  const scaled = {};
  for (const key in recipe) {
    scaled[key] = recipe[key] * amount / 2;
  }
  return scaled;
}