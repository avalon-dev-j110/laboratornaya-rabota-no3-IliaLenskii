package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;


public class FibonacciInitializer implements Initializer {
    private int length = 0;

    public FibonacciInitializer(int Length) {
        this.length = Length;
    }

    /**
     * Выполняет инициализацию массива значениями
     * последовательности Фибоначчи.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {

        if(this.length < 1)
            return;

        int n0 = 1;
        int n1 = 1;
        int n2 = 0;

        array[0] = n0;
        array[1] = n1;

        for(int i = 2; i < this.length; ++i) {
            n2 = n0 + n1;

            array[i] = n2;

            n0 = n1;
            n1 = n2;
        }

    }
}
