/**
 * Created by Karl on 2017-10-09.
 */
public class UVA100 {


    public UVA100(){
        int i = printN(22, 0);

        System.out.println("DONE : " + i);
    }

    public static void main(String[] args){
        new UVA100();
    }


    int printN(int n, int i){

        i++;

        System.out.println("I: " + i);
        System.out.println("N: " + n);

        if (n == 1){
            return i;
        }

        if (n % 2 == 0){
            return printN(n/2, i);
        }else{
            return printN(3 * n +1, i);
        }
    }
}
