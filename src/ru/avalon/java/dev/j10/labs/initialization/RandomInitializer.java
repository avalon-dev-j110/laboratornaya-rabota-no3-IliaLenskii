package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;
import java.util.Random;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    private int length = 0;
    private int from = 0;
    private int sum = 0;

    public RandomInitializer(int Length) {
        this.length = Length;
    }

    public RandomInitializer(int From, int Length) {
        this(Length);
        this.from = From;
    }

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {

        if(this.length < 1)
            return;

        int c = 0;
        int factLen = this.from < 0 ? this.length - Math.abs(this.from) : this.length;

        Random rnd = new Random();

        for(int i = this.from; i < factLen; ++i, ++c) {
            int cr = rnd.nextInt(factLen - this.from) + this.from;

            sum += cr;

            array[c] = cr;
        }
    }

    public int getSum() {
        return sum;
    }
}
