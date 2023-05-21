package org.example.strategy.factory;

import org.example.strategy.EnviadorDeEmail;
import org.example.strategy.EnviadorDeMensagens;
import org.example.strategy.EnviadorDeSMS;
import org.example.strategy.EnviadorDeWhatsapp;

public class EnviadorDeMensagemFactory {
    public static EnviadorDeMensagens newInstance(String tipo){

        if(tipo.equalsIgnoreCase("sms")){
            return new EnviadorDeSMS();
        } else if (tipo.equalsIgnoreCase("whatsapp")) {
            return new EnviadorDeWhatsapp();
        } else if (tipo.equalsIgnoreCase("email")) {
            return new EnviadorDeEmail();
        }
        throw new IllegalArgumentException("Tipo de enviador não suportado: " + tipo );

    }
}
