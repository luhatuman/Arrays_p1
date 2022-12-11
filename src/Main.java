public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int [] firstArray = new int [] {1, 2, 3};
        double [] doubleArray = {1.57, 7.654, 9.986};
        String [] txtArray = {"Один", "Два", "Три", "Пятнадцать"};
        System.out.println();
        // Task 2
        System.out.println("Task 2");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < txtArray.length; i++) {
            System.out.print(txtArray[i]);
            if (i < txtArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        // Task 3
        System.out.println("Task 3");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = txtArray.length - 1; i >= 0; i--) {
            System.out.print(txtArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        // Task 4
        System.out.println("Task 4");
        for (int j : firstArray) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            } else {
                int a = j + 1;
                System.out.print(a + " ");
            }
        }
    }
}