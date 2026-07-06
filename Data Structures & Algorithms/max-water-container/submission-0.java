class Solution {
    public int maxArea(int[] heights) {
        int lp = 0;
        int rp = heights.length-1;
        int maxWater = 0;
        while (lp<rp){
            int h = Math.min(heights[lp],heights[rp]);
            int l = rp-lp;
            int currWater = h*l;
            maxWater = Math.max(maxWater,currWater);

            if(heights[lp]<heights[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}
