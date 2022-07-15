public class Fibonacci {
    private int fibonacci;
    public int compute(int num){
        if(num < 0){
            throw new RuntimeException("Número negativo");
        }
        if(num == 0){
            fibonacci = 0;
        }else if (num == 1){
            fibonacci = 1;
        }else{
            fibonacci = compute(num - 1) + compute(num - 2);
        }
        return fibonacci;
    }
}
