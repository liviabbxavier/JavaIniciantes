package OrientacaoObjeto.Abstracao;

public class Principal {
    // Benefícios POO: Organização, reutilização, facilita a manutenção, escalabilidade, modularidade
    // Quatro pilares:
    // Abstração: Pega um elemento da vida real e transforma em um código
    // Poliformismo: 
    // Herança: Herda um atributo da chamada 'classe mãe'
    // Encapsulamento: 
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Ana";
        funcionario1.cargo = "Gerente de projetos";
        funcionario1.salario = 9000;
        funcionario1.exibeInformacoes();
        funcionario1.reajusteSalarial(5);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "João";
        funcionario2.cargo = "Desenvolvedor";
        funcionario2.salario = 8500;
        funcionario2.exibeInformacoes();
        funcionario2.reajusteSalarial(5);
    }
}
