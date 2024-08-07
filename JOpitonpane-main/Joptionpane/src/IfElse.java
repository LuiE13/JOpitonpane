import javax.swing.*;
public class IfElse {
    public static void main(String[] args){
        String aux = JOptionPane.showInputDialog("Fornece o numero do mês:");
        if(aux!=null){
            try{
                int mes =Integer.parseInt(aux);
                if (mes>=1 && mes<=12){
                    JOptionPane.showMessageDialog(null,"Numero de mês valido\n"+mes);
                }else {
                    JOptionPane.showMessageDialog(null,"numero de mês invalido \n");
                }
            }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null,"Digite valores inteiros!"+ erro);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Opção cancelada.");
        }
        System.exit(0);
    }
}
