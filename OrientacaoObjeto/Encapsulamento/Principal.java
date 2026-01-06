package OrientacaoObjeto.Encapsulamento;

public class Principal {
    // Benefícios: segurança, controle e manutenção
    // Encapsulamento: restringe o acesso direto aos atributos de uma classe
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 8500);
        funcionario.setCargo("Desenvolvedor");

        System.out.println("Funcionário tem o nome: " + funcionario.getNome());
        System.out.println("Funcionário tem o cargo: " + funcionario.getCargo());
        System.out.println("Funcionário tem o salário: " + funcionario.getSalario() + "\n");

        funcionario.reajusteSalarial(5);
        funcionario.reajusteSalarial(10);
        funcionario.exibeInformacoes();
    }
}
