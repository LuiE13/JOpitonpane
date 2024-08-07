//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
public class IfResumido {
    public static void main(String[] args) {

        int a = 10 , b = 15,maior;

        if(a > b){
            maior = a;
        }else {
            maior = b;
        }

        JOptionPane.showMessageDialog(null,"Usando um if comum: " + maior);

        int c=10,d=8;
        maior = (c>d) ? c : d;

        JOptionPane.showMessageDialog(null, "Usando um if resumido: " + maior);
    }
}