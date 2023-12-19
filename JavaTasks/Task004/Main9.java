//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class MyQueue<T> {
//    // Напишите свое решение ниже
//
//    Queue<T> myQueue = new LinkedList<>();
//
//    public void enqueue(T element){
//        myQueue.offer(element);
//
//    }
//
//    public T dequeue(){
//        //  возвращает первый элемент из очереди и удаляет его
//        return myQueue.remove();
//
//    }
//
//    public T first(){
//        // Напишите свое решение ниже
//        return myQueue.element();
//
//    }
//
//    public LinkedList<T> getElements() {
//        return (LinkedList<T>) myQueue;
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Main9 {
//    public static void main(String[] args) {
//        MyQueue<Integer> queue;
//        queue = new MyQueue<>();
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            queue.enqueue(1);
//            queue.enqueue(10);
//            queue.enqueue(15);
//            queue.enqueue(5);
//        } else {
//            queue.enqueue(Integer.parseInt(args[0]));
//            queue.enqueue(Integer.parseInt(args[1]));
//            queue.enqueue(Integer.parseInt(args[2]));
//            queue.enqueue(Integer.parseInt(args[3]));
//        }
//
//        System.out.println(queue.getElements());
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.getElements());
//
//        System.out.println(queue.first());
//    }
//}