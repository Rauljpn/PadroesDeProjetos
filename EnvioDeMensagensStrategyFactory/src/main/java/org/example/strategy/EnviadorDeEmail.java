package org.example.strategy;

public class EnviadorDeEmail implements EnviadorDeMensagens {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por e-mail: "+ mensagem);
    }
}
