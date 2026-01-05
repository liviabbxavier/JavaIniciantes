package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Cadastro {
    String nome;
    String cargo;
    int nivelAcesso;

    public void atualizarDados(String novoCargo, int novoNivelAcesso) {
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso + "\n");
        
        cargo = novoCargo;
        nivelAcesso = novoNivelAcesso;

        System.out.println("--- Após a atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso + "\n");
    }
    public static void main(String[] args) {
        Cadastro colaborador = new Cadastro();
        colaborador.nome = "Maria";
        colaborador.cargo = "Desenvolvedor Júnior";
        colaborador.nivelAcesso = 1;

        colaborador.atualizarDados("Desenvolvedor Pleno", 2);
    }
}
