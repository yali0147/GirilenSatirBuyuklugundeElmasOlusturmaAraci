import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       System.out.println("Girilen Satır Büyüklüğünde Elmas Oluşturma Aracı");
        Scanner inp =new Scanner(System.in);
        System.out.print("Satır Büyüklüğünü Giriniz : ");
        int n= inp.nextInt();

        if (n%2==1){
            for (int i =0;i<=(((n-1)/2));i++){
                for(int j=0;j<(((n-1)/2)-i);j++) {
                    System.out.print(" ");
                }
                for (int k=1;k<=((2*i)+1);k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }for (int l =1;l<=(((n-1)/2));l++) {
                for (int m = 1; m <= l; m++) {
                    System.out.print(" ");
                }for (int o = 0; o <=n-(2*l)-1; o++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }else{for (int i =1;i<=(((n)/2));i++){
            for(int j=0;j<(((n)/2)-i);j++) {
                System.out.print(" ");
            }
            for (int k=0;k<((2*i)-1);k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }for (int l =1;l<=(((n)/2));l++) {
            for (int m = 1; m < l; m++) {
                System.out.print(" ");
            }for (int o = 0; o <=n-(2*l); o++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        }
    }
}