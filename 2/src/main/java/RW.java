import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.*;

/**
 * Created by @author AlNat on 11.09.2016.
 * Licensed by Apache License, Version 2.0
 */
class RW {
    // Класс для работы с чтением/записью

    private List<String> writeFile; // Файл для записи

    /**
     *  Конструктор - инициализируем массивы под входные файлы
     */
    RW () {
        writeFile = new LinkedList<>();
    }

    /**
     * Funtion write into file all simple numbers < size
     * @param inputFilename filename
     * @param size count of elements
     */
    void Calc (String inputFilename, int size) throws IOException {

        writeFile.clear();

        boolean numbers[] = new boolean[size + 1]; // Массив, если число простое - то значение в numbers[число] true
        Arrays.fill(numbers, true); // Положили во все ячейки true

        Eratosfen (numbers);

        for (int t = 0; t <= size; t++ ) { // Прошли по массиву
            if (numbers[t]) { // Если это число простое - пишем его
                writeFile.add(String.valueOf(t));
            }
        }

        Files.write(Paths.get(inputFilename), writeFile, Charset.forName("UTF-8")); // Пишем

    }

    /**
     * Алгоритм:
     * Для нахождения всех простых чисел не больше заданного числа n, следуя методу Эратосфена, нужно выполнить следующие шаги:
     * 1) Выписать подряд все целые числа от двух до n (2, 3, 4, …, n).
     * 2) Пусть переменная p изначально равна двум — первому простому числу.
     * 3) Зачеркнуть в списке числа от 2p до n считая шагами по p (это будут числа кратные p: 2p, 3p, 4p, …).
     * 4) Найти первое незачёркнутое число в списке, большее чем p, и присвоить значению переменной p это число.
     * 5) Повторять шаги 3 и 4, пока возможно.
     *
     * Теперь все незачёркнутые числа в списке — это все простые числа от 2 до n.
     *
     * На практике, алгоритм можно улучшить следующим образом. На шаге № 3 числа можно зачеркивать начиная сразу с числа p^2,
     * потому что все составные числа меньше него уже будут зачеркнуты к этому времени. И, соответственно, останавливать
     * алгоритм можно, когда p^2 станет больше, чем n. Также, все простые числа (кроме 2) — нечётные числа, и поэтому
     * для них можно считать шагами по 2p, начиная с p^2.
     *
     *
     * @param numbers массив Флагов простых чисел
     */
    private void Eratosfen (boolean numbers[]) {

        if (numbers.length < 2) {
            return;
        }

        numbers[0] = false;
        numbers[1] = false;

        for (int t = 2; t * t < numbers.length; t++) { // Прошли по всему массиву

            if (numbers[t]) { // Если это число (пока) простое
                for (int t2 = t * t; t2 < numbers.length; t2 += t) { // То находим числа кратные ему, начиная с t
                    numbers[t2] = false; // И говорим, что они не простые
                }
            }

        }


    }


}
