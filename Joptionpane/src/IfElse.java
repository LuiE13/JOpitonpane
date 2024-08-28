//beatriz e luiz
import javax.swing.*;//importa a classe Javax.swing por completo
public class IfElse {//declara a classe
    public static void main(String[] args){//metodo main da classe
        String aux = JOptionPane.showInputDialog("Fornece o numero do mês:");
        //pede um numero ao usuario e guarda esse numero
        if(aux!=null){//caso o usuario forneça algo executa o bloco abaixo
            try{//executa o bloco abaixo ate ocorrer um erro
                int mes =Integer.parseInt(aux);//converte para inteiro o numero do usuario
                if (mes>=1 && mes<=12){//caso o numero eseja entre 1 e 12, valida o numero do mes
                    JOptionPane.showMessageDialog(null,"Numero de mês valido\n"+mes);
                }else {//caso contrario diz que o numero é invalido
                    JOptionPane.showMessageDialog(null,"numero de mês invalido \n");
                }
            }catch (NumberFormatException erro){//se houver erro na conversão mostra a mensagem de erro
                //e pede que o usuario insira um numero inteiro
                JOptionPane.showMessageDialog(null,"Digite valores inteiros!"+ erro);
            }
        } else {//caso não haja um valor informa que o usuario cancelou
            JOptionPane.showMessageDialog(null,"Opção cancelada.");
        }
        System.exit(0);//finaliza o programa
    }
}
