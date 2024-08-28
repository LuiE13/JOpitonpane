//beatriz e luiz
import javax.swing.*;
import javax.swing.JOptionPane;//importa a classe JOptionPane
public class If {//declara a classe
    public static void main(String[] args) {//metodo main da classe
       Object[] op = {"Masculino","Feminino"};
       // cria um vetor com 2 casas, uma com "masculino" e outra com "feminino"
       String resp = (String) JOptionPane.showInputDialog(null,"selecione o sexo: \n",
               "Pesquisar",JOptionPane.PLAIN_MESSAGE,null,op,"Masculino");
       //mostra uma tela de escolha entre as casas do vetor, o valor inicial é masculino, guarda a opção selecionada como resp
       if(resp==null){
           //caso o usuario cancele(não responda) dizemos que ele cancelou
           JOptionPane.showMessageDialog(null,"Você pressionou cancel!");
       }
       if (resp.equals("Masculino")){//o equals é um compardor de caracteres ;)
           //caso o usuario escolha masculino diz que ele é homem
           JOptionPane.showMessageDialog(null,"Você é homem!");
       }
       if (resp.equals("Feminino")){
           //caso o usuario escolha feminino diz que ele é mulher
           JOptionPane.showMessageDialog(null,"Você é mulher!");
       }
       System.exit(0);//finaliza o programa
    }
}