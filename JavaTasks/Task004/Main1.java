//import java.util.Arrays;
//
//class MergeSort {
//    public static int[] mergeSort(int[] a) {
//        if (a.length <= 1) return  a;
//
//    int mid = (a.length) / 2;
//    int[] left = new int[mid];
//    int[] right = new int[a.length - mid];
//
//    System.arraycopy(a, 0, left, 0, mid);
//    System.arraycopy(a, mid, right, 0, a.length - mid);
//
//    mergeSort(left);
//    mergeSort(right);
//
//    return merge(a, left, right);
//
//}
//    private static int[] merge(int[] a, int[] left, int[] right){
//        int i = 0, j = 0, k = 0;
//
//        while (i < left.length && j < right.length){
//            if(left[i] <= right[j]){
//                a[k++] = left[i++];
//            }else {
//                a[k++] = right[j++];
//            }
//        }
//        while (i < left.length){
//            a[k++] = left[i++];
//        }
//        while (j < right.length){
//            a[k++] = right[j++];
//        }
//
//        return a;
//    }
//
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Main1{
//    public static void main(String[] args) {
//        int[] a;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = new int[]{5, 1, 6, 2, 3, 4};
//        } else {
//            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        MergeSort answer = new MergeSort();
//        String itresume_res = Arrays.toString(answer.mergeSort(a));
//        System.out.println(itresume_res);
//    }
//}