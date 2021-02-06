import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int K = input.nextInt();
    if (K <= N * M && (K % N == 0 || K % M == 0)){
        System.out.println("YES");
        }
    else{
        System.out.println("NO");
        }
    }
}