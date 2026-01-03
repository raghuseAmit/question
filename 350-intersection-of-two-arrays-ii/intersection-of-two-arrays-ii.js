/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    const result = [];
    const used = new Array(nums2.length).fill(false);

    for (let i = 0; i < nums1.length; i++) {
        for (let j = 0; j < nums2.length; j++) {
            if (!used[j] && nums1[i] === nums2[j]) {
                result.push(nums1[i]);
                used[j] = true; 
                break;        
            }
        }
    }
    return result;
};
