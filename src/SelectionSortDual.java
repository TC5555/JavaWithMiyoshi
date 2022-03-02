public class SelectionSortDual {
    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static int[] selectionSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) { //this for loop happens 'a' times.
            int largest = i, smallest = i;
            for (int j = i; j > 0; j--) {
                if (a[j] > a[largest]) {
                    largest = j;
                }
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            swap(a, i, largest);
            swap(a, i, smallest);
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
