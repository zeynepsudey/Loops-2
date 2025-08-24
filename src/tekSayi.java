import java.util.Scanner;

public class tekSayi {

    public static void main(String[] args) {
        int num;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz : ");
            num = inp.nextInt();
            if(num % 4 == 0){
                total += num;
            }

        } while (num % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
