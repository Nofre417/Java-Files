//class Answer {
//    public void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
//        // Напишите свое решение ниже
//        String[] mass = JSON.replace("\"фамилия\"", "")
//                .replace("[", "")
//                .replace("}]", "")
//                .replace("{", "")
//                .replace("\"", "")
//                .replace(":", "")
//                .replace("оценка", "")
//                .replace("предмет", "").split("},");
//        for (int i = 0; i < mass.length; i++) {
//            String[] arr = mass[i].split(",");
//            System.out.printf("%s%s%s%s%s%s", ELEMENT1, arr[0], ELEMENT2, arr[1], ELEMENT3, arr[2]);
//            System.out.println();
//        }
//    }
//}
//
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Main11{
//    public static void main(String[] args) {
//        String JSON = "";
//        String ELEMENT1 = "";
//        String ELEMENT2 = "";
//        String ELEMENT3 = "";
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
//                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
//                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//            ELEMENT1 = "Студент ";
//            ELEMENT2 = " получил ";
//            ELEMENT3 = " по предмету ";
//        }
//        else{
//            JSON = args[0];
//            ELEMENT1 = args[1];
//            ELEMENT2 = args[2];
//            ELEMENT3 = args[3];
//        }
//
//        Answer ans = new Answer();
//        ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
//    }
//}