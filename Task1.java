// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку,
//  в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split.
//  Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) throws FileNotFoundException {
        array();
    }

    public static void array() throws FileNotFoundException {
        File file = new File("task1.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            line = line.replace("null", "");
            String[] array = line.split("\\s+|,\\s*");

            StringBuilder newArray = new StringBuilder("");
            newArray.append("SELECT * FROM students WHERE ").append(array[1]).append(" = ").append(array[3]).
            append(" AND ").append(array[5]).append(" = ").append(array[7]).append(" AND ").
            append(array[9]).append(" = ").append(array[11]);
            System.out.println("SQL запрос - > " + newArray);
        }
    }
}

