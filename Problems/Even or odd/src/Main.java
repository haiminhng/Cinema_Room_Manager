import java.util.Scanner;
class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // put your code here
        int userinput = 0;
        do {
        userinput = input.nextInt();
        if(userinput % 2 == 0 && userinput!= 0){
        System.out.println("even");
        }
        else if (userinput == 0){
            break;
        }
        else {
        System.out.println("odd");
        }
        }
        while(userinput !=0);
    }
}