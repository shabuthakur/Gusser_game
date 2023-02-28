import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        int a[]=new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the marks of student:");
            a[i]=scan.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(
        );

        System.out.println("enter the value of k:");
        int k=scan.nextInt();

        for(int i=0;i<a.length;i++) {
            if (a[i] == k) {
                System.out.println("value of k present in array");
            }
        }

    }
}
