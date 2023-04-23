//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package Task1;

public class Task1 {
    public static void main(String[] args) {
        String inputFilter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        inputFilter = inputFilter.replace("{","").replace("}", "");
        String[] filterArray = inputFilter.split(",");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("where ");
        boolean isFirst = true;
        for (String str: filterArray
             ) {
                String[] temp = str.split(":");
                if (!temp[1].equals("\"null\"")){
                    if (isFirst)
                    {isFirst=false;}
                    else {
                        stringBuilder.append(" and ");
                    }
                    stringBuilder.append(temp[0]);
                    stringBuilder.append("=");
                    stringBuilder.append(temp[1]);
                }
        }
        System.out.println(stringBuilder);
    }
}
