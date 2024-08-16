package edu.pedro.uncheked;

public class LacandoExceptionsUncheked {
    public static void main(String[] args) {

        dividir(20, 0);
    }

    public static int dividir(int numero1, int numero2) throws ArithmeticException{
        if (numero2 == 0) {
            throw new ArithmeticException("O divisor não pode ser 0");
        }
        return numero1 / numero2;
    }
}
