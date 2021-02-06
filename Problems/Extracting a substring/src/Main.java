import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = null;
        int start, end;
        str = input.next();
        start = input.nextInt();
        end = input.nextInt();
    System.out.println(str.substring(start,end+1));
    }
}