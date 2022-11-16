//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;

public class LargestToSmallest {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz.
        int a, b, c;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri istiyoruz.
        System.out.print("A number: ");
        a = input.nextInt();

        //Kullanıcıdan değerleri istiyoruz.
        System.out.print("B number: ");
        b = input.nextInt();

        //Kullanıcıdan değerleri istiyoruz.
        System.out.print("C number: ");
        c = input.nextInt();

        // a'nın en büyük olma durumu
        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {//b'nin en büyük olma durumu
            if (a > c) {
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        }else {//c'nin en büyük olma durumu
            if (a > b){
                System.out.println("c > a > b");
            }
            else {
                System.out.println("c > b > a");
            }
        }
    }
}