import java.util.Scanner;
public class arrayPractic {
    public static void main(String[] args) {
        /*float [] arr = {23.7f, 67.9f,12.8f,78.f,90.7f};
        float sum = 0;
        for(float element:arr)
        {
            sum = sum+element;
        }
        System.out.println(sum);

    }*/
       /* int [] arr = {23,15,57,89,90,56};
        int num = 15;
        int present = 0;
        for(int element:arr)
        {
            if(num == element)
            {
                present = 1;
                break;
            }

            }
        if(present == 1)
        {
            System.out.println("element is present");
        }
        else {
            System.out.println("Element not present");
        }

    }*/
        /*float[] arr = {23.7f, 67.9f, 12.8f, 78.f, 90.7f};
        float sum = 0;
        for (float element : arr) {
            sum = sum + element;
        }
        float avf;
        avf = sum / arr.length;
        System.out.println(sum);
        System.out.println(avf);
    }
        int [] [] mat1 = {{1,2,3},
                          {4,5,6}};
        int [] [] mat2 = {{7,8,9},
                           {10,11,12}};
        for(int i = 0;i<mat1.length;i++)
        {
            for(int j = 0;j<mat1[i].length;j++)
            {
                int [] [] result = new int [2][3];
                result[i][j] = mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+ " ");
            }
            System.out.println("");
        }
    }*/

        int[] arr = {1,2, 4, 5};
        int l = arr.length;
        int temp = 0;
        for (int i = 0; i < l-1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = 1;
                break;
            }
        }
        if (temp == 1) {
            System.out.println("it is not in sorted order");
        } else {
            System.out.println("it is in sorted order");
        }
    }
}