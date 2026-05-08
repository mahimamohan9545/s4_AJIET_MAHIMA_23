public class SmallestElement {
    public static void main(String[] args) {
        int[] a = {10, 45, 7, 89, 24};

        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("smallest element in the array:"+smallest);
    }
}
