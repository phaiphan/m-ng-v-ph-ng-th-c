import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("nhap vao phan tu can xoa: ");
        int number=sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        if (index(arr,number)==-1) {
            System.out.println(number+" khong co trong mang");
            return;
        }
        deleteE(arr,index(arr,number));
        for (int i=0;i<deleteE(arr,index(arr,number)).length;i++) System.out.print(deleteE(arr,index(arr,number))[i]+" ");
    }

    static int index(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }
    static int[] deleteE(int[]arr,int index) {
        int[]array= new int[arr.length-1];
        for (int i= 0;i<index;i++) array[i]=arr[i];
        for (int i=index+1;i< arr.length;i++) array[i-1]=arr[i];
        return array;
    }
}
