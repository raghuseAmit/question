/**
 * @param {number} n
 * @return {number}
 */
var hammingWeight = function(n) {
    let setBitCount = 0;
    while (n !== 0) {
        setBitCount += n % 2; // lastbit
        n = Math.floor(n / 2); //rightjayega
    }
    return setBitCount;
};
