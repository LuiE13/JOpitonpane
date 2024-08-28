//beatriz e luiz
import javax.swing.*;//importa a classe Javax.swing por completo
import java.awt.*;

public class IfElseAninhado {//declara a classe
    public static void main(String[] args){//metodo main da classe
        String aux = JOptionPane.showInputDialog("Forneça o número do mês: ");//pede um numero ao usuario
        if (aux != null) {//verifica se foi inserido algum valor
            try {//executa o cadigo abaixo se não houver erros
                int mes = Integer.parseInt(aux);//converte para inteiro o numero do usuario
                //verifica o numero e o coloca com seu mes correspondente. ex 1 = janeiro
                if (mes == 1){
                    aux = "Janeiro";
                }
                else if (mes == 2){
                    aux = "Fevereiro";
                }
                else if (mes == 3){
                    aux = "Março";
                }
                else if (mes == 4){
                    aux = "Abril";
                }
                else if (mes == 5){
                    aux = "Maio";
                }
                else if (mes == 6){
                    aux = "Junho";
                }
                else if (mes == 7){
                    aux = "Julho";
                }
                else if (mes == 8){
                    aux = "Agosto";
                }
                else if (mes == 9){
                    aux = "Setembro";
                }
                else if (mes == 10){
                    aux = "Outubro";
                }
                else if (mes == 11){
                    aux = "Novembro";
                }
                else if (mes == 12){
                    aux = "Dezembro";
                }
                else{
                    aux = "Mês desconhecido! :/";
                }
                JOptionPane.showMessageDialog(null, aux);
                //mostra o mes correspondente ao numero
            }
            catch (NumberFormatException erro) {//se houver erro na conversão mostra a mensagem de erro
                //e pede que o usuario insira um numero inteiro
                JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros!\n" + erro );
            }
        }
        System.exit(0);//finaliza o programa
    }

}