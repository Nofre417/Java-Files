public class Main2 {
    public static void main(String[] args) {
        int[] mas = {1, 1, 0, 1, 1, 1, 1};
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i < mas.length; i++)
        {
            if(mas[i] == 1)
            {
                count++;
            }
            else if (maxCount < count)
            {
                maxCount = count;
                count = 0;
            }
            else  count = 0;
        }
        if (maxCount < count)
        {
            maxCount = count;
        }
        System.out.println("Максимальное количество подряд: " + maxCount);
    }
}
