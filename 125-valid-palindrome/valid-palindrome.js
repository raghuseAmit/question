/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let newStr = '';
    for (let i of s) {
        if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z') | (i >= '0' && i <= '9')) {
            newStr += i.toLowerCase();
        }
    }
    let reversed = newStr.split('').reverse().join('');
    return newStr === reversed;
};
