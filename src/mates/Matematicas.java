package mates;

public class Matematicas {
    public static double generarNumeroPiIterativo(long pasos) {
        long puntosDentroDelCirculo = 0;
        for (long i = 0; i < pasos; i++) {
            double x = Math.random();
            double y = Math.random();
            // Si el punto generado está dentro del círculo de radio 1, incrementamos el contador
            if (x * x + y * y <= 1) {
                puntosDentroDelCirculo++;
            }
        }
        // La probabilidad de que un punto esté dentro del círculo es π/4, por lo que multiplicamos por 4 el ratio
        return 4 * (double) puntosDentroDelCirculo / pasos;
    }
}