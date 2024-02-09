import java.io.*;

/*
Писатель в файл с консоли

    Данное консольное приложение считывает сначала имя файла(путь к нему) и затем через цикл
    записывает в него данные, которые введены в консоль.
    Для выхода из цикла вам всего лишь нужно написать "exit" и приложение закроется.

    Каждая строка вводится с новой строки и в файл записывает тоже, с новой строки.
*/



public class Main {
    public static void main(String[] args) throws Exception {
        // Используем BufferedReader для чтения названия файла
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        // Далее используем bufferedWriter для записи данных в файл
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        // Я использовал тип данных StringBuilder, так как он является предпрочтительнее в этой задаче,
        // а именно построение строки для записи.
        StringBuilder stringBuilder = new StringBuilder();

        // Вечный цикл для записи данных
        while(true){
            // Считываем строку для записи и тут же проверяем его на "exit"
            String str = bufferedReader.readLine();
            if(str.equals("exit")){
                break;
            }else{
                // Если строка не равна "exit", тогда просто добаляем в StringBuilder и переходим на новую строку
                stringBuilder.append(str).append("\n");
            }
        }
        // В конце закрываем все потоки и добавляем StringBuilder в файл
        bufferedWriter.write(stringBuilder.toString());
        bufferedReader.close();
        bufferedWriter.close();
    }
}