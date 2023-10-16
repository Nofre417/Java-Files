public class Main4 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] res = str.split(" ");

        for(int i = res.length - 1; i >= 0; i--){
            System.out.print(res[i] + " ");
        }
    }
}
