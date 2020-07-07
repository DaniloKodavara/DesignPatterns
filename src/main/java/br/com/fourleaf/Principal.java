package br.com.fourleaf;

public class Principal
{
    public static void main( String[] args )
    {
        //Será um exemplo , simulando uma fila de documentos que um sistema operacional controla na hora de imprimir um determinado documento.
        //Não deverá existir mais de uma instancia controlando está fila.

        GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();

        System.out.println(g1);
        System.out.println(g2);
    }
}
