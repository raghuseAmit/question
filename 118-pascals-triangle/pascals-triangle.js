/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    const r = [];
    for (let i = 1; i <= numRows; i++) {
        const t = [];
        for (let j = 0; j < i; j++) {
            if (j === 0 || j === i - 1) {
                t.push(1);
            } else {
                t.push(r[r.length - 1][j] + r[r.length - 1][j - 1]);
            }
        }
        r.push(t);
    }
    return r;
}