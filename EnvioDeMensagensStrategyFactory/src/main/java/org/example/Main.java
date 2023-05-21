package org.example;

import org.example.strategy.EnviadorDeMensagens;
import org.example.strategy.MensageiroEstrategista;
import org.example.strategy.factory.EnviadorDeMensagemFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tiposDeMensagem = List.of("sms", "whatsapp", "email", "telegram");
        for (String m : tiposDeMensagem) {
            EnviadorDeMensagens enviador = EnviadorDeMensagemFactory.newInstance(m);
            MensageiroEstrategista estrategista = new MensageiroEstrategista(enviador);
            estrategista.enviarMensagem("Fala Manoel");
        }
    }
}