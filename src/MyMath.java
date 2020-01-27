public class MyMath {

    //Q1a
    public static int minNum(int a,int b,int c){
        int min;

        if(a<b){
            min = a;
        }
        else{
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }

    //Q1b
    public static int numPow(int a, int b){

        int result = 1;

        for(int i = 1; i<=b; i++){
            result *= a;
        }

        return result;
    }

    //Q1c
    public static int sumNum(int a){

        int result = 0;

        for(int i = 1; i <= a; i++){

            result += i;
        }

        return result;
    }

    //Q1d
    public static int getFac(int a){

        int result = 1;

        for(int i = a; i >= 1; i--){

            result *= i;
        }
        return result;
    }

    //Q1e
    public static  boolean isPrime(int a){
        boolean factorFound = false;

        int num = 2;
        while(!factorFound && num <a){
            if(a % num == 0){
                factorFound = true;
            }
            else num++;
        }

        return !factorFound;
    }

    //Q3
    public static  int countWords(String str){

        str = "A Star Is Born";

        

    }
}
