package SortingPack;

/**
 *
 * @author STEPHEN HOEY
 */
public class SortApp {

    static int num[] = {4, 5, 7, 1, 0, 8, 2, 3, 9, 6};

    private static void printNumbers(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }

    public static void SelectionSortAc(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
        printNumbers(num);
    }

    public static void SelectionSortDc(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] > num[min]) {
                    min = j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
        printNumbers(num);
    }

    public static void BubbleSortAc(int[] numbers) {
        int temp;
        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < num.length - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        printNumbers(num);
    }

    public static void BubbleSortDc(int[] num) {
        int temp;
        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < num.length - i; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        printNumbers(num);
    }

    public static void InsertionSortAc(int[] num) {
        for (int j = 1; j < num.length; j++) {
            int temp = num[j];
            int i = j - 1;
            while ((i > -1) && (num[i] > temp)) {
                num[i + 1] = num[i];
                i--;
            }
            num[i + 1] = temp;
        }
        printNumbers(num);
    }

    public static void InsertionSortDc(int[] num) {
        for (int j = 1; j < num.length; j++) {
            int temp = num[j];
            int i = j - 1;
            while ((i > -1) && (num[i] < temp)) {
                num[i + 1] = num[i];
                i--;
            }
            num[i + 1] = temp;
        }
        printNumbers(num);
    }

    public static void main(String[] args) {

        System.out.print("Array Not Sorted:");
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i]);
        }

        System.out.println(" ");

        System.out.println("Selection Sort Acc And Dec Order");
        SelectionSortAc(num);
        System.out.println(" ");
        SelectionSortDc(num);

        System.out.println(" ");

        System.out.println("Bubble Sort Acc And Dec Order");
        BubbleSortAc(num);
        System.out.println(" ");
        BubbleSortDc(num);

        System.out.println(" ");

        System.out.println("Insertion Sort Acc And Dec Order");
        InsertionSortAc(num);
        System.out.println(" ");
        InsertionSortDc(num);

    }
}
