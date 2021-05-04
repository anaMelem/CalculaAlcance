import java.text.DecimalFormat;
import java.util.Scanner;

/*********************************************************************************
 ** Este programa calcula o alcance de um anúncio publicitário                  **
 ** Desenvolvido por: Ana Carolina dos Anjos Melém                              **
 *********************************************************************************/

public class calculaAlcance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa calcula o alcance de um anúncio publicitátio");
        System.out.println("Qual o valor gasto para anunciar?(Em reais)");
        float valorGasto = in.nextFloat();
        // Calcula quantos usuarios vizualizam a partir do valor investido:
        float vizuPrimaria = 30*valorGasto;
        // Calcula o número de cliques a partir das vizualizações:
        float numCliques = vizuPrimaria * (0.12F);
        //Calcula o número de compartilhamento através dos cliques:
        float numComparti = numCliques * (6.6F);
        //Calcula as novas novas vizualizações através do número de compartilhamentos mínimo:
        float novaVizuMin = 40 * numComparti;
        //Calcula as novas vizualizações através do número de compartilhamento máximo, considerando
        // que cada cmpartilhamento foi feito 4 vezes:
        float novaVizuMax = novaVizuMin * 3;
        // O número de pessoas alcacnçadas pelo anúncio poderiam ser:
        float alcanceMin = novaVizuMin + vizuPrimaria;
        float alcanceMax = novaVizuMax + vizuPrimaria;
        DecimalFormat formatador = new DecimalFormat("0");
        System.out.println("Alcance mínimo: "+formatador.format(alcanceMin)+ " pessoas."); // como valor mínimo
        System.out.println("Alcance máximo: "+formatador.format(alcanceMax)+ " pessoas."); // como valor máximo

    }
}
