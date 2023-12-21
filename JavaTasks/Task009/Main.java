public class Main {
    public static void main(String[] args) {
        GBLinkenList<Integer> listOfNumbers = new GBLinkenList<>();
        listOfNumbers.add(73).add(6).add(9).add(8).add(24).add(5).add(52);
        System.out.println(listOfNumbers);

        //Remove and get
        System.out.println(listOfNumbers.pop());
        System.out.println(listOfNumbers);

        //Insert item by index
        listOfNumbers.insert(3, 100);
        listOfNumbers.insert(listOfNumbers.size(), 0);
        System.out.println(listOfNumbers);

        //Get size of LinkedList
        System.out.println(listOfNumbers.size());

        //Add element to start
        System.out.println(listOfNumbers.addToStart(444));

        //Add element to end
        System.out.println(listOfNumbers.addToEnd(63));

        //Get element by index
        System.out.println(listOfNumbers.get(3));
    }
}
