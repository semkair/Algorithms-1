class Select {
    public static int select(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k);
    }

    private static int quickSelect(int[] arr, int low, int high, int k) {
        if (low == high) return arr[low];

        int pivot = arr[(low + high) / 2];
        int i = low, j = high;

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++; j--;
            }
        }

        if (k <= j) return quickSelect(arr, low, j, k);
        if (k >= i) return quickSelect(arr, i, high, k);
        return arr[k];
    }
}