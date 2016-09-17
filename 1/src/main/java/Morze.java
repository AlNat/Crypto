import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by @author AlNat on 10.09.2016.
 * Licensed by Apache License, Version 2.0
 */

/*
    Сама азбука Морзе:

    А	· −
    Б 	− · · ·
    В 	· − −
    Г 	− − ·
    Д 	− · ·
    Е(Ё) 	·
    Ж   · · · −
    З 	− − · ·
    И 	· ·
    Й 	· − − −
    К 	− · −
    Л 	· − · ·
    М 	− −
    Н 	− ·
    О 	− − −
    П 	· − − ·
    Р 	· − ·
    С 	· · ·
    Т 	−
    У 	· · −
    Ф 	· · − ·
    Х 	· · · ·
    Ц 	− · − ·
    Ч 	− − − ·
    Ш 	− − − −
    Щ 	− − · −
    Ъ 	− − · − −
    Ы 	− · − −
    Ь(Ъ) − · · −
    Э 	· · − · ·
    Ю 	· · − −
    Я 	· − · −
    Точка 	· · · · · ·
    Запятая 	· − · − · −
    Двоеточие 	− − − · · ·
    Точка с запятой 	− · − · − ·
    Скобка  	− · − − · −
    Апостроф 	· − − − − ·
    Кавычки 	· − · · − ·
    Тире 	− · · · · −
    Косая черта 	− · · − ·
    Вопросительный знак 	· · − − · ·
    Восклицательный знак 	− − · · − −
    Знак раздела 	− · · · −

*/

class Morze {

    private Map<Character, String> morze;

    /**
     * Function initilizing the map of morze symbols
     */
    Morze () {
        morze = new HashMap<>();

        morze.put('а', ".-");
        morze.put('А', ".-");
        morze.put('б', "-...");
        morze.put('Б', "-...");
        morze.put('в', ".--");
        morze.put('В', ".--");
        morze.put('г', "--.");
        morze.put('Г', "--.");
        morze.put('д', "-..");
        morze.put('Д', "-..");
        morze.put('е', ".");
        morze.put('Е', ".");
        //morze.put('ё', ".");
        //morze.put('Ё', ".");
        morze.put('ж', "...-");
        morze.put('Ж', "...-");
        morze.put('з', "--..");
        morze.put('З', "--..");
        morze.put('и', "..");
        morze.put('И', "..");
        morze.put('й', ".---");
        morze.put('Й', ".---");
        morze.put('к', "-.-");
        morze.put('К', "-.-");
        morze.put('л', ".-..");
        morze.put('Л', ".-..");
        morze.put('м', "--");
        morze.put('М', "--");
        morze.put('н', "-.");
        morze.put('Н', "-.");
        morze.put('о', "---");
        morze.put('О', "---");
        morze.put('п', ".--.");
        morze.put('П', ".--.");
        morze.put('р', ".-.");
        morze.put('Р', ".-.");
        morze.put('с', "...");
        morze.put('С', "...");
        morze.put('т', "-");
        morze.put('Т', "-");
        morze.put('у', "..-");
        morze.put('У', "..-");
        morze.put('ф', "..-.");
        morze.put('Ф', "..-.");
        morze.put('х', "....");
        morze.put('Х', "....");
        morze.put('ц', "-.-.");
        morze.put('Ц', "-.-.");
        morze.put('ч', "---.");
        morze.put('Ч', "---.");
        morze.put('ш', "----");
        morze.put('Ш', "----");
        morze.put('щ', "--.-");
        morze.put('Щ', "--.-");
        morze.put('ы', "-.--");
        morze.put('Ы', "-.--");
        morze.put('ь', "-..-");
        morze.put('Ь', "-..-");
        morze.put('ъ', "-..-");
        morze.put('Ъ', "-..-");
        morze.put('э', "..-..");
        morze.put('Э', "..-..");
        morze.put('ю', "..--");
        morze.put('Ю', "..--");
        morze.put('я', ".-.-");
        morze.put('Я', ".-.-");
        morze.put('1', ".----");
        morze.put('2', "..---");
        morze.put('3', "...--");
        morze.put('4', "....-");
        morze.put('5', ".....");
        morze.put('6', "-....");
        morze.put('7', "--...");
        morze.put('8', "---..");
        morze.put('9', "----.");
        morze.put('0', "-----");
        morze.put('.', "......");
        morze.put(',', ".-.-.-");
        morze.put(':', "---...");
        morze.put(';', "-.-.-.");
        morze.put('(', "-.--.-");
        morze.put(')', "-.--.-");
        morze.put('\'', ".----.");
        morze.put('"', ".-..-.");
        morze.put('-', "-....-");
        morze.put('/', "-..-.");
        morze.put('?', "..--..");
        morze.put('!', "--..--");
        morze.put(' ', "-...-");
    }


    /**
     * Function get sybmol and return his morze-code
     * @param symbol - symbol to convert
     * @return String of morze-code or nothing string if this symbol not found
     */
    String GetMorze (char symbol) {

        String answer = morze.get(symbol);

        if (answer == null) {
            return ""; // Код ошибки
        } else {
            return answer;
        }

    }

    /**
     * Function get code and return reprezentive symbol
     * @param Morze String of code
     * @return char of symbol
     */
    char GetSymbol (String Morze) {

        Set<Map.Entry<Character,String>> entrySet = morze.entrySet();

        for (Map.Entry<Character,String> pair : entrySet) {
            if ( Morze.equals( pair.getValue() ) ) {
                return pair.getKey();// нашли наше значение и возвращаем  ключ
            }
        }

        return ' ';

    }

}
