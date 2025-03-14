/*
* Baseada em funções que operam sobre dados globais ou parâmetros
* A execução segue um fluxo linear e estruturado
* Menos modularidade e reutilização do código comparado ao OOP
* Melhor para pequenos scripts e aplicações com lógica simples
* */

public class ProceduralParadigm {
//    Função para calcular a soma entre dois números
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        int result = add(2, 5);
        System.out.println("Resultado: " + result);
    }
}
