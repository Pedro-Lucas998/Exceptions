package edu.pedro.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo o arquivo...");
            System.out.println("Escrevendo dados do arquivo...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando recursos liberados pelo S.O...");
        }
    }


}
