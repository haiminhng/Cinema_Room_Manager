import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String userinput = input.next();
        System.out.println(atob(userinput));
    }

    public static String atob(String input) {
        boolean a = input.contains("a"); // true
        if (a = true){
            input = input.replace("a","b");
            return input;
        }
        return input;
    }
}