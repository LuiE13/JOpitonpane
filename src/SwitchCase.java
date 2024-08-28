//beatriz e luiz
import javax.swing.*; //esse comando reve para importar todas as classe da biblioteca swing
public class SwitchCase { //declara uma classe pública chamada SwitchCase
    public static void main(String[] args) { //este método serve como ponto de entrada principal para o início da execução do programa
        String mes = (String) JOptionPane.showInputDialog("Forneça o número do mês");
        //exibe uma caixa de diálogo e recebe o mês digitado pelo usuário, e armazena essa entrada como uma string

        if (mes != null) { //verifica se mês é diferente de null(nulo/nada)
            switch (mes){ //inicia um switch para comparar o valor da variável mês
                case "1": //se mês for igual a 1
                    mes = "Janeiro"; //define Mês como Janeiro

                    break; //sai do bloco switch
                case "2": //se mês for igual a 2

                    mes="Fevereiro"; //define Mês como Fevereiro

                    break; //sai do bloco switch
                case "3": //se mês for igual a 3

                    mes="Março"; //define Mês como Março

                    break; //sai do bloco switch
                case "4": //se mês for igual a 4

                    mes="Abril"; //define Mês como Abril

                    break; //sai do bloco switch
                case "5": //se mês for igual a 5

                    mes="Maio"; //define Mês como Maio

                    break; //sai do bloco switch
                case "6": //se mês for igual a 6

                    mes="Junho"; //define Mês como Junho

                    break; //sai do bloco switch
                case "7": //se mês for igual a 7

                    mes="Julho"; //define Mês como Julho

                    break; //sai do bloco switch
                case "8": //se mês for igual a 8

                    mes="Agosto"; //define Mês como Agosto

                    break; //sai do bloco switch
                case "9": //se mês for igual a 9

                    mes="Setembro"; //define Mês como Setembro

                    break; //sai do bloco switch
                case "10": //se mês for igual a 10

                    mes="Outubro"; //define Mês como Outbro

                    break; //sai do bloco switch
                case "11": //se mês for igual a 11

                    mes="Novembro"; //define Mês como Novembro

                    break; //sai do bloco switch
                case "12": //se mês for igual a 12

                    mes="Dezembro"; //define Mês como Dezembro

                    break; //sai do bloco switch
                default: //se mês não corresponde a nenhum dos casos acima
                    mes = "Mês Desconhecido!"; //define Mês como Mês Desconhecido!
                    break; //sai do bloco switch
            }

            JOptionPane.showMessageDialog(null, mes);
            //exibe uma caixa de diálogo de acordo com o que o usuário digitou, que pode ser o nome de algum mês ou Mês Desconhecido!
        }
        System.exit(0); //encerra o programa
    }
}
