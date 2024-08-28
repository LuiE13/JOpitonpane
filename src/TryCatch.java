//beatriz e luiz
import javax.swing.*; //esse comando serve para importar todas as classe da biblioteca swing
public class TryCatch { //declara uma classe pública chamada TryCatch
    public static void main(String[] args) { //este método serve como ponto de entrada principal para o início da execução do programa
        try { //inicía um bloco try para pegar exessões que podem ocorrer
            String aux1 = JOptionPane.showInputDialog("Forneça o valor 1° do número: ");
            //pede o que o usuário digite o primeiro valor, e armazena esse valor como string
            int num1 = Integer.parseInt(aux1); //converte a string em um número inteiro

            String aux2 = JOptionPane.showInputDialog("Forneça o valor 2° do número: ");
            //pede o que o usuário digite o segundo valor, e armazena esse valor como string
            int num2 = Integer.parseInt(aux2); //converte a string em um número inteiro

            JOptionPane.showMessageDialog(null, " Soma = " + (num1+num2));
            //exibe o resultado da soma do primeiro e do segundo número
            JOptionPane.showMessageDialog(null, " Subtração = " + (num1-num2));
            //exibe o resultado da ssubtração do primeiro e do segundo número
            JOptionPane.showMessageDialog(null, " Multiplicação = " + (num1*num2));
            //exibe o resultado da multiplicação do primeiro e do segundo número
            JOptionPane.showMessageDialog(null, " Divisão = " + (num1/num2));
            //exibe o resultado da divisão do primeiro e do segundo número

        } catch (ArithmeticException erro){ //pega qualquer exceção que esteja relacionada a erros aritméticos
            JOptionPane.showMessageDialog(
                    null, "Erro de divisão por zero!\n" + erro.toString(),
                    "ERRO", JOptionPane.ERROR_MESSAGE); //exibe uma mensagem explicando o erro
        }  catch (NumberFormatException erro){ //pega qualquer exceção que esteja relacionada a erros de formato de número
            JOptionPane.showMessageDialog(
                    null, "Erro de conversão!\n" + erro.toString(),
                    "ERRO", JOptionPane.ERROR_MESSAGE); //exibe uma mensagem explicando o erro
        }  catch (NullPointerException erro){ //pega qualquer exceção que esteja relacionada a erros de objetos nulos
            JOptionPane.showMessageDialog(
                    null, "Tecla cancel precionada!\n" + erro.toString(),
                    "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);  //exibe uma mensagem explicando o erro
        } finally {  //bloco que é executado após o bloco try e catch
            JOptionPane.showMessageDialog(null, "Final da execução!");
            //exibe uma caixa de diálogo escrita Final da execução!
        }
        System.exit(0); //encerra o programa
    }
}
