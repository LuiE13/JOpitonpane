//beatriz e luiz
import javax.swing.*;//importa toda a classe javax.swing
public class IfResumido {//declara a classe
    public static void main(String[] args) {//metodo principal da classe

        int a = 10 , b = 15,maior;//cria 2 variaveis com valor de 10 e 15

        if(a > b){//verifica se a é maior que b
            maior = a;//se for diz que a é o maior valor, e guarda o valor de a
        }else {
            maior = b;//se for diz que b é o maior valor, e guarda o valor de b
        }

        JOptionPane.showMessageDialog(null,"Usando um if comum: " + maior);
        //mostra o maior valor

        int c=10,d=8;//cria 2 variaveis com valor de 10 e 8
        maior = (c>d) ? c : d;//usando o operador ternario compara os valores de c e d
        //armazena o maior valor na variavel maior

        JOptionPane.showMessageDialog(null, "Usando um if resumido: " + maior);
        //mostra o maior valor
    }
}