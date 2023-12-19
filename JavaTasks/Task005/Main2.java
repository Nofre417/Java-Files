import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(checkText("foo", "baa"));

    }

    public static boolean checkText(String text1, String text2) {
        if (text1.length() != text2.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {

            if(map.containsKey(arr1[i])){

                if(map.get(arr1[i]) != arr2[i]){
                    return  false;
                }
            }
            else{
                map.put(arr1[i], arr2[i]);
            }
        }
        return true;
    }

}
