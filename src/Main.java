import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1 D array
//        int arr[]=new int[5];
//        for(int i=0;i<arr.length;i++){
//            System.out.print("Enter the student marks" +i + " ");
//            arr[i]=scan.nextInt();
//
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
        //2-D array
        int a[][] = new int[3][3];
        int b[][]= new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter first array values " + i + " of "  + j);
                a[i][j] = scan.nextInt();

            }

        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Enter second array values " + i + " of "  + j);
                b[i][j] = scan.nextInt();

            }
        }
        System.out.println("values of first array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("of second array");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int result [][]= new int[3][3];
        System.out.println("resultant array");
        for (int i=0;i<a.length;i++) {
            for (int k=0;k<b.length;k++){
                result[i][k]=a[i][k]+b[i][k];
                System.out.print(result[i][k]+" ");
                    }
                    System.out.println();
                }
            }
        }




//        System.out.println("Please enter number here");
//        Scanner scan=new Scanner(System.in);
//        int a=scan.nextInt();
//        System.out.println(a);
//    }
//}