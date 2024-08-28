//beatriz e luiz
import javax.swing.JOptionPane;//importa a classe JOptionPane
public class GetMessagEPrintStackTrace {//declara a classe
    public static void main(String[] args) {//metodo main da classe
        int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
         //pede um numero ao usuario, transforma-o em inteiro e guarda o valor em x
        try {//tenta dividir o numero por zero
            int y = x/0;//vai dar erro ja que não da pra dividir por 0
        } catch (Exception errro){//caso ocorra um erro executa o bloco abaixo
            //forçamos um erro ao dividir por zero ent sempre cairemos aqui
            JOptionPane.showMessageDialog(null, errro.getMessage());//mostra a mensagem de erro
            errro.printStackTrace();//printa no console o erro
        }
    }
}
