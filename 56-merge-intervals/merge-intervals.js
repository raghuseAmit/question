/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {
    let n = intervals.length;
    intervals.sort((a, b) => a[0]-b[0] || a[1]-b[1]);
    let merged = [];
    for(let i = 0; i < n; i++) {
        const [currStart, currEnd] = intervals[i]
        if (merged.length === 0 || merged[merged.length - 1][1] < currStart) {
            merged.push([currStart, currEnd]);
        } 
        else {
            merged[merged.length - 1][1] = Math.max(merged[merged.length - 1][1], currEnd);
        }
    }
    return merged;
};