public class SelectionSortLargest {
    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static int[] selectionSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) { //this for loop happens 'a' times.
            int largest = i;
            for (int j = i; j > 0; j--) {
                /*
                this for loop happens 'a!' times.
                The big O will be 'a!' because the most occurring operations are happening 'a' times then 'a-1' times and so on.
                This algorithm is as fast as the standard selectionSort algorithm because this algorithm is just doing the same method in reverse.
                */
                if (a[j] > a[largest]) {
                    largest = j;
                }
            }
            swap(a, i, largest);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 107, 23, 4, 9, 54};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
    }
        selectionSort(a);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }

}
