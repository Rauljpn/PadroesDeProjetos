package org.example.strategy;

public class EnviadorDeWhatsapp implements EnviadorDeMensagens {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviado mensagem por Whatsapp:" + mensagem);
    }
}
