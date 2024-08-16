package edu.pedro.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File arquivo = new File("src/edu/pedro/exception/teste/Arquivo/teste.txt");
        try{
            boolean foiCriado = arquivo.createNewFile();
            System.out.println("Arquivo criado " + foiCriado);
        }
        catch (IOException e){
            e.printStackTrace();
            throw e; // Só throw, porque a exceção já existe. Está sendo referenciada pelo objeto e
        }
    }

}
