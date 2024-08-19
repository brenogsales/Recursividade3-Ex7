package controller;

public class Ex7 {
    public Ex7(){
        super();
    }
    public static int somaDigitos(int num){
        if(num == 0){
            return 0;
        }
        if(num > 0 && num < 10){
            return num;
        }

        return (num % 10) + somaDigitos(num / 10);
    }
}
