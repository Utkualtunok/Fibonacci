import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcı veri girişi
        System.out.print("Fibonacci eleman sayısını giriniz : ");
        int total = scanner.nextInt();

        int num1 = 0, num2 = 1;
        //Fibonacci formülü ile sayıları bulma işlemleri
        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i <= total; i++) {
            System.out.print(num1 + " ");

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
