package org.lucashspring2.lucasspring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado com sucesso!");
    }

    public void enviarMensagemBoasVindas() {
        techTeam.setEmailf("Lucas@gmail.com");
        System.out.println(techTeam);
        System.out.println("Bem vindo tech team!");
    }
}
