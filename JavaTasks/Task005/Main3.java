import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        String primer1 = "a+(b*3)";
        String primer2 = "[a+(b*3])";
        String primer3 = "[a+(b*3)]";
        String primer4 = "<5*1>[a+{b*3}]";

        System.out.println(checkPrimer(primer1));
        System.out.println(checkPrimer(primer2));
        System.out.println(checkPrimer(primer3));
        System.out.println(checkPrimer(primer4));
    }

    public static boolean checkPrimer(String primer){
        Stack<Character> stack = new Stack<>();

        char[] chars = primer.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');

        for(char current: chars){
            if(map.containsKey(current)){
                stack.push(current);
            }
            if(map.containsValue(current)){
                if(stack.empty() || map.get(stack.pop()) != current){
                    return false;
                }
            }
        }
        return stack.empty();
    }

}
