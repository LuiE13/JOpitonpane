//beatriz e luiz
import javax.swing.JOptionPane;//importa a classe JOptionPane
public class ContadorWhile {//declara a classe
    public static void main(String args[]) {//metodo main da classe
        try {//testa o bloco abaixo e o executa até ocorrer um erro
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade!: "));
            int contador = limite;
            //pede ao usuario um numero que servira como limite para a execução do programa
            while (contador >= 0) {
                //mostra o numero limite e diminui u de seu valor até chegar a zero
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim do contador regressivo\n");//informa o fim da regressão
            contador = 0;
            do {//executa esse comando
                System.out.println(contador);
                //mostra o valor que começara em zero e acresenta 1 a cada vez que o loop for executado
                contador++;
            } while (contador <= limite);//repete o codigo acima ate que atinga o numero limite
            System.out.println(("Fim do contador progressivo."));//informa o fim da progressão
        } catch (NumberFormatException erro) {// caso ocorra um erro de conversãomostra a mensgem de erro
            System.out.println("Não foi encontrado um número inteiro válido!\n" + erro.toString()); // se o argumento for inválido
        }
        System.exit(0);//finaliza o programa
    }
}