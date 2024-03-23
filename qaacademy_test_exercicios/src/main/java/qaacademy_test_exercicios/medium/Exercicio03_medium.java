package medium;

//import javax.swing.JOptionPane;

public class Exercicio03_medium {
    public int retornaFatorial (int fatorial){
        int i;
        i= fatorial;
        while (i>1) {
            fatorial = fatorial * (i - 1);
              i--;
        }
        return fatorial;

        
    }
    
}


// PUBLIC STATIC VOID MAIN(STRING[] ARGS) {
    //     INT FATORIAL, I;
    //     STRING FATORIALDIGITADO = JOPTIONPANE.SHOWINPUTDIALOG("DIGITE O FATORIAL");
    //     FATORIAL = INTEGER.PARSEINT(FATORIALDIGITADO);
    //     I = FATORIAL;
    //     WHILE (I > 1) {
    //         FATORIAL = FATORIAL * (I - 1);
    //         I--;

    //     }
    //     SYSTEM.OUT.PRINTLN("O FATORIAL DO NUMERO DIGITADO É: " + FATORIAL);
    // }
