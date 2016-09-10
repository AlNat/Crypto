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

    // Вначале думал хранить мапу из символов и морзе, но вариант не подошел. Так что делаю в лоб

    /**
     * Function get sybmol and return his morze-code
     * @param symbol - symbol to convert
     * @return String of morze-code
     */
    String GetMorze (char symbol) {
        String answer = "";

        switch (symbol) {
            case 'А':
                answer = ".-";
                break;
            case 'а':
                answer = ".-";
                break;
            case 'б':
                answer = "-...";
                break;
            case 'Б':
                answer = "-...";
                break;
            case 'в':
                answer = ".--";
                break;
            case 'В':
                answer = ".--";
                break;
            case 'г':
                answer = "--.";
                break;
            case 'Г':
                answer = "--.";
                break;
            case 'д':
                answer = "-..";
                break;
            case 'Д':
                answer = "-..";
                break;
            case 'е':
                answer = ".";
                break;
            case 'Е':
                answer = ".";
                break;
            case 'ё':
                answer = ".";
                break;
            case 'Ё':
                answer = ".";
                break;
            case 'ж':
                answer = "...-";
                break;
            case 'Ж':
                answer = "...-";
                break;
            case 'з':
                answer = "--..";
                break;
            case 'З':
                answer = "--..";
                break;
            case 'и':
                answer = "..";
                break;
            case 'И':
                answer = "..";
                break;
            case 'й':
                answer = "..";
                break;
            case 'Й':
                answer = "..";
                break;
            case 'к':
                answer = "-.-";
                break;
            case 'К':
                answer = "-.-";
                break;
            case 'л':
                answer = ".-..";
                break;
            case 'Л':
                answer = ".-..";
                break;
            case 'м':
                answer = "--";
                break;
            case 'М':
                answer = "--";
                break;
            case 'н':
                answer = "-.";
                break;
            case 'Н':
                answer = "-.";
                break;
            case 'о':
                answer = "---";
                break;
            case 'О':
                answer = "---";
                break;
            case 'п':
                answer = ".--.";
                break;
            case 'П':
                answer = ".--.";
                break;
            case 'р':
                answer = ".-.";
                break;
            case 'Р':
                answer = ".-.";
                break;
            case 'с':
                answer = "...";
                break;
            case 'С':
                answer = "...";
                break;
            case 'т':
                answer = "-";
                break;
            case 'Т':
                answer = "-";
                break;
            case 'у':
                answer = "..-";
                break;
            case 'У':
                answer = "..-";
                break;
            case 'ф':
                answer = "..-.";
                break;
            case 'Ф':
                answer = "..-.";
                break;
            case 'х':
                answer = "....";
                break;
            case 'Х':
                answer = "....";
                break;
            case 'ц':
                answer = "-.-.";
                break;
            case 'Ц':
                answer = "-.-.";
                break;
            case 'ч':
                answer = "---.";
                break;
            case 'Ч':
                answer = "---.";
                break;
            case 'ш':
                answer = "----";
                break;
            case 'Ш':
                answer = "----";
                break;
            case 'щ':
                answer = "--.-";
                break;
            case 'Щ':
                answer = "--.-";
                break;
            case 'ы':
                answer = "-.--";
                break;
            case 'Ы':
                answer = "-.--";
                break;
            case 'ь':
                answer = "-..-";
                break;
            case 'Ь':
                answer = "-..-";
                break;
            case 'ъ':
                answer = "-..-";
                break;
            case 'Ъ':
                answer = "-..-";
                break;
            case 'э':
                answer = "..-..";
                break;
            case 'Э':
                answer = "..-..";
                break;
            case 'ю':
                answer = "..--";
                break;
            case 'Ю':
                answer = "..--";
                break;
            case 'я':
                answer = ".-.-";
                break;
            case 'Я':
                answer = ".-.-";
                break;
            case '1':
                answer = ".----";
                break;
            case '2':
                answer = "..---";
                break;
            case '3':
                answer = "...--";
                break;
            case '4':
                answer = "....-";
                break;
            case '5':
                answer = ".....";
                break;
            case '6':
                answer = "-....";
                break;
            case '7':
                answer = "--...";
                break;
            case '8':
                answer = "---..";
                break;
            case '9':
                answer = "----.";
                break;
            case '.':
                answer = "......";
                break;
            case ',':
                answer = ".-.-.-";
                break;
            case ':':
                answer = "---...";
                break;
            case ';':
                answer = "-.-.-.";
                break;
            case '(':
                answer = "-.--.-";
                break;
            case ')':
                answer = "-.--.-";
                break;
            case '\'':
                answer = ".-";
                break;
            case '"':
                answer = ".----.";
                break;
            case '-':
                answer = "-....-";
                break;
            case '/':
                answer = "-..-.";
                break;
            case '?':
                answer = "..--..";
                break;
            case '!':
                answer = "--..--";
                break;
            case ' ':
                answer = "-...-";
                break;
        }

        return answer;
    }

    /**
     * Function get code and return reprezentive symbol
     * @param Morze String of code
     * @return char of symbol
     */
    char GetSymbol (String Morze) {

        char answer;

        if (Morze.equals(".-")) {
            answer = 'a';
        } else if (Morze.equals("-...")) {
            answer = 'б';
        } else if (Morze.equals(".--")) {
            answer = 'в';
        } else if (Morze.equals("--.")) {
            answer = 'г';
        } else if (Morze.equals("-..")) {
            answer = 'д';
        } else if (Morze.equals(".")) {
            answer = 'е';
        } else if (Morze.equals("...-")) {
            answer = 'ж';
        } else if (Morze.equals("--..")) {
            answer = 'з';
        } else if (Morze.equals("..")) {
            answer = 'и';
        } else if (Morze.equals("-.-")) {
            answer = 'к';
        } else if (Morze.equals(".-..")) {
            answer = 'л';
        } else if (Morze.equals("--")) {
            answer = 'м';
        } else if (Morze.equals("-.")) {
            answer = 'н';
        } else if (Morze.equals("---")) {
            answer = 'о';
        } else if (Morze.equals(".--.")) {
            answer = 'п';
        } else if (Morze.equals(".-.")) {
            answer = 'р';
        } else if (Morze.equals("...")) {
            answer = 'с';
        } else if (Morze.equals("-")) {
            answer = 'т';
        } else if (Morze.equals("..-")) {
            answer = 'у';
        } else if (Morze.equals("..-.")) {
            answer = 'ф';
        } else if (Morze.equals("....")) {
            answer = 'х';
        } else if (Morze.equals("-.-.")) {
            answer = 'ц';
        } else if (Morze.equals("---.")) {
            answer = 'ч';
        } else if (Morze.equals("----")) {
            answer = 'ш';
        } else if (Morze.equals("--.-")) {
            answer = 'щ';
        } else if (Morze.equals("-.--")) {
            answer = 'ы';
        } else if (Morze.equals("-..-")) {
            answer = 'ь';
        } else if (Morze.equals("..-..")) {
            answer = 'э';
        } else if (Morze.equals("..--")) {
            answer = 'ю';
        } else if (Morze.equals(".-.-")) {
            answer = 'я';
        } else if (Morze.equals(".----")) {
            answer = '1';
        } else if (Morze.equals("..---")) {
            answer = '2';
        } else if (Morze.equals("...--")) {
            answer = '3';
        } else if (Morze.equals("....-")) {
            answer = '4';
        } else if (Morze.equals(".....")) {
            answer = '5';
        } else if (Morze.equals("-....")) {
            answer = '6';
        } else if (Morze.equals("--...")) {
            answer = '7';
        } else if (Morze.equals("---..")) {
            answer = '8';
        } else if (Morze.equals("----.")) {
            answer = '9';
        } else if (Morze.equals("-----")) {
            answer = '0';
        } else if (Morze.equals("......")) {
            answer = '.';
        } else if (Morze.equals(".-.-.-")) {
            answer = ',';
        } else if (Morze.equals("---...")) {
            answer = ':';
        } else if (Morze.equals("-.-.-.")) {
            answer = ';';
        } else if (Morze.equals("-.--.-")) {
            answer = '(';
        } else if (Morze.equals(".----.")) {
            answer = '\'';
        } else if (Morze.equals(".-..-.")) {
            answer = '"';
        } else if (Morze.equals("-....-")) {
            answer = '-';
        } else if (Morze.equals("-...-.")) {
            answer = '/';
        } else if (Morze.equals("..--..")) {
            answer = '?';
        } else if (Morze.equals("--..--")) {
            answer = '!';
        } else  {
            answer = ' ';
        }

        return answer;
    }

}
