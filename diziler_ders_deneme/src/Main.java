public class Main {
    public static void main(String[] args) {
        public double pow(int base, int exponent){
            if(exponent<0){
                int tempExponent=-exponent;
                return 1/(base * pow(base, (tempExponent-1)));
            }
            else if(exponent>0){
                return base * pow(base, (exponent-1));
            }
            else{
                return 1;
            }
        }
    }
}