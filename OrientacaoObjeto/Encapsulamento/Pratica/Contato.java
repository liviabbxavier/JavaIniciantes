package OrientacaoObjeto.Encapsulamento.Pratica;

import java.util.ArrayList;

public class Contato {
    private final String nome;
    private final String telefone;
    
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João Silva", "(51) 99999-9999"));
        contatos.add(new Contato("Luana Santos", "(51) 99999-9999"));
        contatos.add(new Contato("Pedro Oliveira", "(51) 97777-0000"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n", 
                indice++,
                contato.getNome(),
                contato.getTelefone());
        }
    }
}
