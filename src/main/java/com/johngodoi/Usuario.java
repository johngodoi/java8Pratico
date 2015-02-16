package com.johngodoi;

/**
 * Created by john on 12/02/15.
 */
class Usuario {
    private String nome;

    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos){
        this.pontos=pontos;
        this.nome=nome;
        this.moderador=false;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean isModerador() {
        return moderador;
    }

    public void setModerador(boolean moderador) {
        this.moderador = moderador;
    }

    public void tornaModerador(){
        this.moderador=true;
    }


}
