class Main {
    public static void main(String[] args) {
        int[] arr1 = {5,2,9,1,5,6};
        MergeSort.sort(arr1);
        System.out.print("MergeSort: ");
        for (int x : arr1) System.out.print(x + " ");
        System.out.println();

        int[] arr2 = {3,7,8,5,2,1,9,5,4};
        QuickSort.sort(arr2, 0, arr2.length - 1);
        System.out.print("QuickSort: ");
        for (int x : arr2) System.out.print(x + " ");
        System.out.println();

        int[] arr3 = {7,10,4,3,20,15};
        System.out.println("Select k=2: " + Select.select(arr3, 2));

        int[][] pts = {{2,3},{12,30},{40,50},{5,1},{12,10},{3,4}};
        System.out.println("Closest Pair distance: " + ClosestPair.closestPair(pts));
    }
}