import javax.swing.JOptionPane;
public class GetMessagEPrintStackTrace {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
        try {
            int y = x/0;
        } catch (Exception errro){
            JOptionPane.showMessageDialog(null, errro.getMessage());
            errro.printStackTrace();
        }
    }
}
