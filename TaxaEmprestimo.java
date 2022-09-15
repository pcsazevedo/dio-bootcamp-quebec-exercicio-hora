package aula;

public class TaxaEmprestimo {
    public static void calculoEmprestimo( double valor, double taxa, int parcela){

        double parcelamento;

        double total;


        if ( parcela != 0){


            total = valor  * taxa;

            double valorTotal = total + valor;

            parcelamento = valorTotal / parcela;

            System.out.println("\nO Valor solicitado: " + valor + " \nCom a taxa de: " + taxa +
                    "\nFica no total de: " +
                    valorTotal + "\nNúmero de parcela: " + parcela + "\nValor das parcelas: " + parcelamento);
        }else {
            System.out.println("\nQuantidade não aceita");
        }








    }
}
