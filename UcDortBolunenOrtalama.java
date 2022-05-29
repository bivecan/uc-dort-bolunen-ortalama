import java.util.Scanner;

public class UcDortBolunenOrtalama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Sayı girin");
        int k = input.nextInt();
        double j=0; double sum =0; double ort=0;

        for(int i=1;i<=k;i++){
            if ((i%3==0)||(i%4==0)){
                sum +=i;
                j++;
            }
        }
        ort = sum/j;
        System.out.println("Ortalama: " + ort);

        }
}
