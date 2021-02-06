import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code
        Scanner scanner = new Scanner(System.in);
        String firstname = null;
        String stageofedu = null;
        String cuisinepre = null;
        int age, yearsofexper;
        firstname = scanner.next();
        age = scanner.nextInt();
        stageofedu = scanner.next();
        yearsofexper = scanner.nextInt();
        cuisinepre = scanner.next();
        System.out.println("The form for " + firstname + " is completed. " +
                "We will contact you if we need a chef that cooks "+ cuisinepre + " dishes.");

    }
}