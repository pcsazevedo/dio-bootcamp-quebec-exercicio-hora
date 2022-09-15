package aula;

public class Main {
    public static void main(String[] args) {
        Metodos.getSoma(3,6);

        Metodos.getSubtracao(6 , 3);

        Metodos.getMultiplicacao(6 , 3);

        Metodos.getDivisao(12 , 3);

        HoraDia.obterMensagem(8);
        HoraDia.obterMensagem(13);
        HoraDia.obterMensagem(20);

        TaxaEmprestimo.calculoEmprestimo(1000, 0.45, 3);
        TaxaEmprestimo.calculoEmprestimo(1000, 0.20, 0);
        TaxaEmprestimo.calculoEmprestimo(1000, 0.20, 12);


    }
}
