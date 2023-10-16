public class Main5 {
    public static void main(String[] args) {
        int a = 1, b = 2;

        System.out.println(PowFunction(a, b));
    }
    static  double PowFunction(double a, int b){
        if(b == 0 || a == 1) return 1;
        if(b < 0){
            a = 1.0 / a;
            b = -b;
        }
        double res = a;
        for(int i = 1; i < b; i++){
            res *= a;
        }
        return res;
    }

}
