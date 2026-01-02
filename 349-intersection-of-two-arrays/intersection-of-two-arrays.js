/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    let set1 = new Set(nums1);
    let result = new Set();

    for(let num of nums2){
        if(set1.has(num)){
            result.add(num);
        }
        
    }

    return Array.from(result);
    };

    console.log(intersection([1,2,1,2,1],[1,2,4]));