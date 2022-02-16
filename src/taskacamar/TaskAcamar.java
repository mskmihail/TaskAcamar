package taskacamar;

public class TaskAcamar {

    public static int lengthOfLastWord(final String a) {
        boolean char_flag = false;
        int len = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (Character.isLetter(a.charAt(i))) {
                char_flag = true;
                len++;
            } else {
                if (char_flag == true) {
                    return len;
                }
            }
        }
        return len;
    }

    public static void sortSquares(int arr[]) {
        int n = arr.length, left = 0,
                right = n - 1;

        int result[] = new int[n];

        for (int index = n - 1; index >= 0; index--) {
            if (Math.abs(arr[left]) > arr[right]) {
                result[index] = arr[left] * arr[left];
                left++;
            } else {
                result[index] = arr[right] * arr[right];
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        int arr[] = {-4, -1, 0, 3, 10};
        sortSquares(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
