//class Answer {
//    public static StringBuilder answer(String QUERY, String PARAMS) {
//        // Напишите свое решение ниже
//        String[] mas = PARAMS.replace("{", "").replace("}", "").replace("\"", "").replace(" ", "").split(",");
//        StringBuilder result = new StringBuilder(QUERY);
//      for (int i = 0; i < mas.length; i++){
//        if (mas[i].split(":")[1].equals("null")) continue;
//        result.append(mas[i].split(":")[0]).append("=").append("'").append(mas[i].split(":")[1]).append("'").append(" and ");
//      }
//      int t = result.lastIndexOf(" and ");
//        result = result.replace(t, result.length(), "");
//    return result;
//    }
//}
//
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//      String QUERY = "";
//      String PARAMS = "";
//
//      if (args.length == 0) {
//        // При отправке кода на Выполнение, вы можете варьировать эти параметры
//        QUERY = "select * from students where ";
//        PARAMS = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} ";
//      }
//      else{
//        QUERY = args[0];
//        PARAMS = args[1];
//      }
//
//      Answer ans = new Answer();
//      System.out.println(ans.answer(QUERY, PARAMS));
//    }
//}