import java.util.Scanner;

public class gHesapM {
    static int sum(int a,int b){
        int result = a + b;
        System.out.println(result);
        return result;
    }
    static int release(int a,int b){
        int result = a - b;
        System.out.println(result);
        return  result;
    }
    static int multiply(int a,int b){
        int result = a * b;
        System.out.println(result);
        return result;
    }
    static int divide(int a,int b){
        int result = a / b;
        System.out.println(result);
        return result;
    }
    static int pow(int a,int b){
        if (a>=0 && b>=0){
            for (int i=1;i <=b;i++){
                a *= i;
            }
            System.out.println(a);
        }return a;
    }
    static int mod(int a,int b){
        int result = a % b;
        System.out.println(result);
        return result;
    }
    static int Rav(int a,int b){
        int perimeter = (a + b)*2;
        System.out.println("Çevre: "+perimeter);
        int area = a * b;
        System.out.println("Alan: "+area);
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1-Toplama\n" +
                    "2-Çıkarma\n" +
                    "3-Çarpma\n" +
                    "4-Bölme\n" +
                    "5-Üs hesapla\n" +
                    "6-Mod al\n" +
                    "7-Dikdörtgen alan ve çevresini hesapla\n" +
                    "0-Çıkış yap";
        System.out.println(menu);
        System.out.println("İşlem seçiniz:");
        select = inp.nextInt();
        if (select == 0){
            System.out.println("İyi günler");
            return;
        }
        System.out.println("İlk sayıyı giriniz:");
        int a = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = inp.nextInt();
        switch (select){
            case 1:
                sum(a,b);
                break;
            case 2:
                release(a,b);
                break;
            case 3:
                multiply(a,b);
                break;
            case 4:
                divide(a,b);
                break;
            case 5:
                pow(a,b);
                break;
            case 6:
                mod(a,b);
                break;
            case 7:
                Rav(a,b);
                break;
        }
    }
}
