class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        List<Integer>list = new ArrayList<>();
        for (int num : aliceSizes) {
            sum1 += num;
            list.add(num);
        }
        for (int num : bobSizes){
            sum2 += num;
        }

        int diff = (sum1 - sum2) / 2;
        int[] ans = new int[2];
        for (int n : bobSizes){
            if (list.contains(n + diff)){
                ans[0] = n + diff;
                ans[1] = n;
                break;
            }
        }
        return ans;
    }
}