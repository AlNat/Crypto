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

public class Morze {

    // Вначале думал хранить мапу из символов и морзе, но вариант не подошел. Так что делаю в лоб

    public String GetMorze (String symbol) {
        String answer = "";

        switch (symbol.charAt(0)) {
            case 'а':
            case 'А':
                answer = ".-";
                break;
            case 'б':
            case 'Б':
                answer = "-...";
                break;
            case 'в':
            case 'В':
                answer = ".--";
                break;
            case 'г':
            case 'Г':
                answer = "--.";
                break;
            case 'д':
            case 'Д':
                answer = "-..";
                break;
            case 'е':
            case 'Е':
            case 'ё':
            case 'Ё':
                answer = ".";
                break;
            case 'ж':
            case 'Ж':
                answer = "...-";
                break;
            case 'з':
            case 'З':
                answer = "--..";
                break;
            case 'и':
            case 'И':
                answer = "..";
                break;
            case 'к':
            case 'К':
                answer = "-.-";
                break;
            case 'л':
            case 'Л':
                answer = ".-..";
                break;
            case 'м':
            case 'М':
                answer = "--";
                break;
            case 'н':
            case 'Н':
                answer = "-.";
                break;
            case 'о':
            case 'О':
                answer = "---";
                break;
            case 'п':
            case 'П':
                answer = ".--.";
                break;
            case 'р':
            case 'Р':
                answer = ".-.";
                break;
            case 'с':
            case 'С':
                answer = "...";
                break;
            case 'т':
            case 'Т':
                answer = "-";
                break;
            case 'у':
            case 'У':
                answer = "..-";
                break;
            case 'ф':
            case 'Ф':
                answer = "..-.";
                break;
            case 'х':
            case 'Х':
                answer = "....";
                break;
            case 'ц':
            case 'Ц':
                answer = "-.-.";
                break;
            case 'ч':
            case 'Ч':
                answer = "---.";
                break;
            case 'ш':
            case 'Ш':
                answer = "----";
                break;
            case 'щ':
            case 'Щ':
                answer = "--.-";
                break;
            case 'ы':
            case 'Ы':
                answer = "-.--";
                break;
            case 'ь':
            case 'Ь':
            case 'ъ':
            case 'Ъ':
                answer = "-..-";
                break;
            case 'э':
            case 'Э':
                answer = "..-..";
                break;
            case 'ю':
            case 'Ю':
                answer = "..--";
                break;
            case 'я':
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

    public char GetSymbol (String Morze) {

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
