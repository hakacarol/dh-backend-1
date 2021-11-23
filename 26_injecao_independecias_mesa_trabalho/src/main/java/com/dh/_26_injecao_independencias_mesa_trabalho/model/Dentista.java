package com.dh._26_injecao_independencias_mesa_trabalho.model;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dentista {
    private String nome;
    private String email;
    private String credencial;

    public Dentista(String nome, String email, String credencial) {
        this.nome = nome;
        this.email = email;
        this.credencial = credencial;
    }
}
