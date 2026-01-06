package OrientacaoObjeto.Encapsulamento.Pratica;

import java.util.Scanner;

public class Senha {
    private String senha;

    public Senha(String senhaInicial) {
        this.senha = senhaInicial;
    }

    public String getSenha() {
        return senha;
    }


    public void setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = senha;
            System.out.println("Senha alterada com sucesso.");   
        } else {
            System.out.println("Senha atual incorreta. Nenhuma alteração feita.");
        }
    }

    public static void main(String[] args) {
        Senha user = new Senha("123456");
        user.setSenha("123456", "abc123");
    }
}
