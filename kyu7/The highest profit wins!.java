class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        return new int[]{min,max};
    }
}