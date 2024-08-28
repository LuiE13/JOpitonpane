import java.io.IOException; //importa a classe IOException, usada para cuidar de erros de entrada ou saída
import javax.swing.JOptionPane; //importa a classe JOptionPane, usada para criar caixa de diálogos que podem ser usada para receber dados ou visualizar mensagens 
public class InstrucaoThrows { //declara uma classe pública chamada InstrucaoThrows
    public static void main(String[] args) throws IOException { //define  o método principal, declara que pode ser usado IOException
        try{ //inicía um bloco try para pegar exessões que podem ocorrer
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            //exibe uma caixa de diálogo e recebe o valor digitado pelo usuário,
            //transformo o valor em um número inteiro que define o valor de idade

            if (idade<18) { //verifica se o valor de idade é menor que 18
                throw new Exception("Menor de idade, entrada não permitida!");
                //lança uma nova exceção com a mensagem caso a idade for menor que 18
            } else { //caso idade não seja menor que 18
                JOptionPane .showMessageDialog(null, "Idade válida, seja bem vindo!");
                //mostra a mensagem informndo que idade é maior ou igual 18
            }
        } catch (Exception e) { //pega qualquer exceção que esteja dentro do bloco try
            JOptionPane.showMessageDialog(null, e.toString());
            //exibe uma caixa de diálogo com a mensagem de exceção
        }
    }
}
