//beatriz e luiz
public class Relogio { //declara uma classe pública chamada Relogio
    public static void main(String args[]) { //este método serve como ponto de entrada principal para o início da execução do programa
        int horas, minutos, segundos; //declara três variáveis inteiras horas, minutos e segundos, sem definir os valores iniciais
        for (horas = 0; horas < 24; horas++) { //loop para completar pelas horas de 0 a 23
            for (minutos = 0; minutos < 60; minutos++) { //loop para completar pelos minutos de 0 a 59
                for (segundos = 0; segundos < 60; segundos++) { //lop para completar pelos minutos de 0 a 59
                    System.out.println(horas + "h:" + minutos + "min:" + segundos + "s"); //exibe as horas, minutos e segundos
                    try { //inicía um bloco try para pegar exessões que podem ocorrer
                        Thread.sleep(1000); //pausa a execução do programa por 1 segundo
                        if (segundos == 10) { //verifica se segundos é igual a 10
                            System.exit(0); //encerra o programa imediatamente
                        }
                    } catch (InterruptedException erro) { //pega qualquer exceção que possa ser lançada por Thread.sleep()
                        erro.toString(); //imprime as camadas do erro
                    }
                }
            }
        }
        System.exit(0); //encerra o programa imediatamente
    }
}
