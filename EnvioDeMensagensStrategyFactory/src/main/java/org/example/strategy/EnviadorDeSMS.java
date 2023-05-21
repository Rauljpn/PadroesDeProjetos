package org.example.strategy;

public class EnviadorDeSMS implements EnviadorDeMensagens {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviado mensagem por SMS: " + mensagem);
    }
}
