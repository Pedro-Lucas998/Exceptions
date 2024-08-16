package edu.pedro.exception;

public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("3988000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O cep não corresponde com as regras de negócio.");

        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();


        }
        return "3988-000";
    }
}
