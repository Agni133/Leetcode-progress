/**
 * @param {number[]} prices
 * @param {number} money
 * @return {number}
 */
var buyChoco = function(prices, money) {
        prices.sort((a, b) => a - b);

    const sum = prices[0] + prices[1];

    if (money - sum >= 0) {
        return money - sum;
    } else {
        return money;
    }

};