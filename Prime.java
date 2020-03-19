import java.util.Arrays;
import java.util.Scanner;

class Prime{
        public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                int i=Integer.parseInt(input.nextLine());
                boolean arr[]=new boolean[i+1];
                Arrays.fill(arr,2,i+1,true);
                for(int j=2;j*j<i+1;j++){
                        if(arr[j]){     // sab multiples of prime one by one hata rhe h. Ye ensure krra ki sirf prime ke multiples hi jae
                                System.out.print("Multiples of "+j+":  ");
                                for(int k=j*2;k<i+1;k+=j){
                                        arr[k]=false;
                                        System.out.print(k+" ");        
                                }
                                System.out.println();
                        }
                }                
                if(arr[i])
                        System.out.println("isPri");

        }
}