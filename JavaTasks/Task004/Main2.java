//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//
//class Answer2 {
//    public static void removeEvenNumbers(Integer[] arr) {
//        int amont = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                amont++;
//            }
//        }
//
//        int[] newArr = new int[amont];
//
//        int index = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] % 2 != 0) {
//                newArr[index] = arr[j];
//                index++;
//            }
//
//        }
//
//        List<Integer> list = new ArrayList<>();
//        for (int element : newArr) {
//            list.add(element);
//        }
//
//        // Вывод списка
//        System.out.println(list);
//
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Main2 {
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        } else {
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer2 ans = new Answer2();
//        ans.removeEvenNumbers(arr);
//    }
//}