package org.example.strategy;

public class MensageiroEstrategista {
    EnviadorDeMensagens enviador;

    public MensageiroEstrategista(EnviadorDeMensagens enviador) {
        this.enviador = enviador;
    }

    public void enviarMensagem(String mensagem){
        enviador.enviarMensagem(mensagem);
    }
}
