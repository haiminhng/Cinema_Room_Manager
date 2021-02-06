import java.util.Scanner;
class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // put your code here
        int n = 0;
        n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    arr[i][j] = Math.abs(j - i);
                    //vấn để được giải quyết bằng Math.abs(j-i)
                    //loop 0 vòng lặp for sẽ chỉ nằm tại 0 và j sẽ tiếp tục đếm từ 0-n
                    //khi j-i có nghĩa là 0-0,1-0,2-0,3-0,4-0 tới n-0
                    //dòng 2 sẽ là 0-1(lấy giá trị absolut bằng Math.abs),1-1,2-1,3-1
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}