
public class TesteRecursao {

    public static void main(String[] args) {


        //AlgoritimoRecursivos.fatoriaInterativo(4);
        //AlgoritimoRecursivos.fatoriaRecursivo(4);

        int[] vetor = {90, 60, 50, 80, 70, 100}
        AlgoritimosSofisticadoOrd.quicsort(vetor, vetor[0], vetor.length-1);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("");
        }
    }
}
