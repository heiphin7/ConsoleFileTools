import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        // Используем bufferedReader для входящего потока данных, в этом случае всего для fileName
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Считываем fileName
        String fileName = bufferedReader.readLine();

        // Инициализируем scanner и FileInputStream для чтения данных ИЗ файла
        Scanner scanner = new Scanner(new FileInputStream(fileName));

        // В данном случае будет удобен тип данных ArrayList<Integer>, так этот тип данных удобен тем, что мы не знаем
        // сколько четных чисел будет в файле.
        ArrayList<Integer> sortedArray = new ArrayList<>();

        // Запускаем цикл, который работает до тех пор, пока в файле есть данные
        while(scanner.hasNextLine()){
            // Считывание числа и проверка на чётность
            int n = scanner.nextInt();
            if(n % 2 == 0){
                sortedArray.add(n);
            }
        }
        // Сортирует список
        Collections.sort(sortedArray);

        // Вывод списка через цикл for - each
        for(int i: sortedArray){
            System.out.println(i);
        }

        // Закрываем входящие потоки
        scanner.close();
        bufferedReader.close();
    }
}