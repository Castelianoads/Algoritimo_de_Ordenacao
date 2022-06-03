
public class AlgoritimosSofisticadoOrd {

    public static void quicsort(int[] vetor, int menor, int maior){

        if (menor > maior){
            return;
        }
        int i = menor;
        int j = maior;

        // theshold
        int pivo = vetor[menor];
        while(i < j){

            // Encontrar a primeira posição menor que do pivo da direita para esquerda
            while(i < j && vetor[j] > pivo){
                j--;
            }

            // Substituir o menor por um numero menor que o pivo
            if(i < j){
                vetor[i] = vetor[j];
                i++;
            }

            // Encontrar a primeira posição maior que o pivo da esquerda para direita
            while(i < j && vetor[j] <= pivo){
                i++;
            }

            // Substituir o maior por um número maior que o pivo
            if(i < j){
                vetor[j] = vetor[i];
                j--;
            }
            vetor[i] = pivo;

            quicsort(vetor, menor, i-1);
            quicsort(vetor, i+1, maior);
        }
    }
}
