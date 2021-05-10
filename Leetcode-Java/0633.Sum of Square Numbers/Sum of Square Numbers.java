class Solution {
    public boolean judgeSquareSum(int c) {
        //双指针
        int s = 0;
        int e = (int) Math.sqrt(c);

        while (s <= e){
            int sum = (int) (Math.pow(s,2) + Math.pow(e,2));
            if (sum > c)
                e--;
            else if (sum < c)
                s++;
            else
                return true;
        }
        return false;
    }
}