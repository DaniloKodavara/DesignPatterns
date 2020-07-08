package br.com.fourleaf;

import br.com.fourleaf.mensagem.Mensagem;
import br.com.fourleaf.mensagem.MensagemFactory;
import br.com.fourleaf.mensagem.MensagemSMS;

import javax.swing.*;

public class PrincipalFactoryMethod
{
    public static void main( String[] args )
    {
        //Será um exemplo de simulando uma aplicação de envio de mensagens que utiliza uma interface para Abstrair a implementação dos classes de Envio.
        // A classe MensagemFactory fica respnsavel em definir o tipo de objeto que sera implementado neste caso vai escolher entre MensagemEmail ou MensagemSMS .

        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagem = MensagemFactory.getMensagem(2);
        mensagem.enviar(texto);


    }
}
