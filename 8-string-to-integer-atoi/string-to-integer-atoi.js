/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function(s) {
    let i = 0;
    
    while (i < s.length && s[i] === ' ') {
        i++;
    }
    
    if (i === s.length) return 0;

    let sign = 1, res = 0;

    if (s[i] === '-') { 
        sign = -1; 
        i++; 
    } else if (s[i] === '+') { 
        i++; 
    }
    while (i < s.length && s[i] >= '0' && s[i] <= '9') {
        res = res * 10 + (s[i] - '0');
        i++;
    }
    if (sign * res > 2**31 - 1) return 2**31 - 1;
    if (sign * res < -(2**31)) return -(2**31);

    return sign * res;
};
