

public class AlgoritimoRecursivos {


    public static void fatoriaInterativo(int fatorial){
        int resultado = 1;

        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;
        }
        System.out.printf("Fatorial %d = %d", fatorial, resultado);
    }

    public static int fatoriaRecursivo(int n){
        if(n == 1){
            return 1;
        }
        return n * fatoriaRecursivo(n - 1);
    }

}
