package medium;

public class Exercicio07_08_medium {
    public String[] criaVetorMeses() {
        
        String[] mesesAno;
        mesesAno = new String[12];
        
        mesesAno[0] = "Janeiro";
        mesesAno[1] = "Fevereiro";
        mesesAno[2] = "Março";
        mesesAno[3] = "Abril";
        mesesAno[4] = "Maio";
        mesesAno[5] = "Junho";
        mesesAno[6] = "Julho";
        mesesAno[7] = "Agosto";
        mesesAno[8] = "Setembro";
        mesesAno[9] = "Outubro";
        mesesAno[10] = "Novembro";
        mesesAno[11] = "Dezembro";
        
        return mesesAno;
    }
        
    public void imprimirVetorMeses(String[] mesesAno) {
        int i = 0;

        while (i < 12) {
            System.out.println("Os meses do ano são: " + (i + 1) + "-" + mesesAno[i]);
            i++;
        }

    }
        
    } 


    

    // public static void main(String[] args) {
    //     String[] mesesAno;
    //     mesesAno = new String[12];
    //     mesesAno[0] = "Janeiro";
    //     mesesAno[1] = "Fevereiro";
    //     mesesAno[2] = "Março";
    //     mesesAno[3] = "Abril";
    //     mesesAno[4] = "Maio";
    //     mesesAno[5] = "Junho";
    //     mesesAno[6] = "Julho";
    //     mesesAno[7] = "Agosto";
    //     mesesAno[8] = "Setembro";
    //     mesesAno[9] = "Outubro";
    //     mesesAno[10] = "Novembro";
    //     mesesAno[11] = "Dezembro";
        
    //     ///Exercicio 08
    //     int i=0;
    //     while (i<12) {
    //     System.out.println("os meses do ano são: " + (i+1) + "-" + mesesAno[i]);
    //         i++;
    //     }
         
