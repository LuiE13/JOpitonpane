//beatriz e luiz
import java.io.*; //importa classes que são relacionadas a entrasda e saida de arquivos
import javax.swing.JOptionPane; //importa a classe JOptionPane, usada para criar caixa de diálogos que podem ser usada para receber dados ou visualizar mensagens

public class UsoDoThrows { //declara uma classe pública chmada UsoDoThrows
    public static void main(String[] args) throws IOException {
        //este método serve como ponto de entrada principal para o início da execução do programa
        String frase = JOptionPane.showInputDialog("Entre com uma frase:");
        //pede o que o usuário digite uma frase, e armazena esse valor como string
        try { //inicía um bloco try para pegar exessões que podem ocorrer
            FileWriter file = new FileWriter("c:/temp/frases.txt",true);
            //cria um FileWriter para abrir ou criar o arquivo "frases.txt"

            PrintWriter out = new PrintWriter(file); //cria um PrintWriter para escrever no arquivo

            out.println(frase); //escreve no arquivo a frase fornecida anteriormente pelo usuário
            file.close(); //fecha o FileWriter, liberando o recurso
            out.close(); //fecha o PrintWriter, liberando o recurso

            JOptionPane.showMessageDialog(null,"Frase armazenada no arquivo!");
            //exibe uma mensagem dizendo que a frase foi armazenada com sucesso
        } catch (FileNotFoundException erro) { //pega exceções relacionadas a ausência do arquivo
            JOptionPane.showMessageDialog(null,"Erro, verifique se a pasta c:/temp existe!");
            //exibe uma mensagem de erro se o caminho para o arquivo não for encontrado
        }
    }
}
