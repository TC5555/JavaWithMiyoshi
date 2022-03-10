public class SelectionSortDual {
    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static int[] selectionSort(int[] a) {
        for (int i =a.length - 1; i > 0; i--) { //this for loop happens 'a' times.
            int largest = i, smallest = (a.length-1) - i;
            for (int j = (a.length-1) - i; j < a.length; j++) {
                if (a[(a.length-1) -j] > a[largest]) {
                    largest = (a.length-1) -j;
                }
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            if((a.length-1) -i == largest && i == smallest) {
                swap(a, smallest, largest);
            }
            else if((a.length-1) -i == largest) {
            swap(a, (a.length-1) -i, smallest);
                swap(a, smallest, i);
            }
            else if(i == smallest){
            swap(a, i, largest);
                swap(a, largest, i);}
            else {
                swap(a, i, largest);
            swap(a, (a.length-1) -i, smallest);
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {900,2,1,1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3451212,-200000,1213,-21,2121,1,1,2,2,2,4,4,4,4,4,4,4,2126,1};
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
