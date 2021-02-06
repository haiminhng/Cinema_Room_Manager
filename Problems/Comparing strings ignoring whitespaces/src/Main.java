import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String clean1 = str1.replaceAll(" ", "").trim();
        String clean2 = str2.replaceAll(" ",  "").trim();
        System.out.println(clean1.equals(clean2));

        }
    }
