import java.util.Scanner;

/**
 * Created by Karl on 2017-10-09.
 */
class UVA100 {


    final private Scanner sc = new Scanner(System.in);

    public UVA100(){
        while(sc.hasNext()){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int max = maxCycles(i, j);

            System.out.println(i + " " + j + " " + max);

        }
    }



    int maxCycles(int min, int max){

        int maxCycles = 0;

        for (int i = min; i <= max ; i++){

            int cycles = getCycles(i, 0);
            if (cycles > maxCycles){
                maxCycles = cycles;
            }
        }
        return maxCycles;
    }

    int getCycles(int n, int cycleCount){

        cycleCount++;

        if (n == 1){
            return cycleCount;
        }

        if (n % 2 == 0){
            return getCycles(n/2, cycleCount);
        }else{
            return getCycles(3 * n +1, cycleCount);
        }
    }


    public static void main(String[] args){
        new UVA100();
    }
}
