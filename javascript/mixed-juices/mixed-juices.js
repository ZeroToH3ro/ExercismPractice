const prepTime = {
  "Pure Strawberry Joy": 0.5,

  "Energizer": 1.5,

  "Green Garden": 1.5,

  "Tropical Island": 3,

  "All or Nothing": 5,
};

export function timeToMixJuice(name) {
  if (Object.keys(prepTime).includes(name)) {
    return prepTime[name];
  } else {
    return 2.5;
  }
}

export function limesToCut(wedgesNeeded, limes) {
  const wedges = {
    small: 6,
    medium: 8,
    large: 10,
  };

  let wedgesCut = 0;

  let i = 0;

  while (wedgesCut < wedgesNeeded) {
    if (limes[i]) {
      wedgesCut += wedges[limes[i]];
      i++;
    } else {
      return i;
    }
  }
  return i;
}

export function remainingOrders(timeLeft, orders) {
  while (timeLeft > 0) {
    timeLeft -= timeToMixJuice(orders[0]);
    orders.shift();
  }
  return orders;
}
