//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package org.example;

public class Main {
    public static void main(String[] args) {
        String jsonFilter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder requestPart = new StringBuilder();

        // Делаем реплейс значений в строки jsonFilter получая строку
        // "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\""
        jsonFilter = jsonFilter
                .replace("{", "")
                .replace("}", "");

        // разделяем строку
        // на строки "\"name\":\"Ivanov\""	"\"country\":\"Russia\""	"\"city\":\"Moscow\""	"\"age\":\"null\""
        String[] filters = jsonFilter.split(", ");

        //задаем цикл на разделение строк на ключ и значение
        for (String filter : filters) {
            String[] keyValue = filter.split(":"); // key = \"name\"  value = \"Ivanov\"
            String key = keyValue[0].replace("\"", "");// key = name
            String value = keyValue[1].replace("\"", ""); //value = Ivanov

            // обработчик для null значения
            if (!"null".equals(value)) { // если value != null
                // если длинна запроса не пустая добавляем еще разделитель
                if (requestPart.length() > 0) {
                    requestPart.append(" AND ");
                }
                // добавляем часть запроса
                requestPart
                        .append(key).append(" = '")
                        .append(value).append("'");
            }
        }

        String sqlQuery = "SELECT * FROM students WHERE " + requestPart;
        System.out.println(sqlQuery);
    }
}