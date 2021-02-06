import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int ... array) {
        if (array.length < 1) {
            return null;
        }
        int[] arr2 = {array[0],array[array.length - 1] } ;
        return arr2;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
