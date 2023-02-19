// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task2 
{ 
    public static void main(String[] args) throws IOException{

        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler file = new FileHandler("task2.txt");
        logger.addHandler(file);
        SimpleFormatter sFormat = new SimpleFormatter();
        file.setFormatter(sFormat);

        int[] array = new int[]{1,4,6,2,3,1,1};
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                    logger.info(Arrays.toString(array));
                }
            }
        }
    }
}