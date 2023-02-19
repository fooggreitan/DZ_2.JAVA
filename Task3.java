// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//  {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, 
// используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args) throws FileNotFoundException {
        array();
    }
    public static void array() throws FileNotFoundException {
        File file = new File("task3.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] number = line.split("\\s+|,\\s*");
            StringBuilder newArray = new StringBuilder("");
            newArray.append("Студент ").append(number[1]).append(" получил ").append(number[4]).
            append(" по предмету ").append(number[7]);
            System.out.println(newArray);
        }
    }
}