package mates;

public class Matematicas{
	/**
	* Genera una aproximació n al número pi mediante el método de
	* Montecarlo. El parámetro "pasos" indica el número de puntos
	* generado.
	* @author Arturo Muñoz
	* @param pasos que es el numero de "dardos" que se van a lanzar sobre el área para obtener la aproximación a pi
	* @return el numero aproximado a pi
	*/
    public static double generarNumeroPiRecursivo(long pasos){
        int i = 0;
        int count = 0;
        double pi;
        double x = 0;
        double y = 0;
        while(i < pasos) {
            x = Math.random();
            y = Math.random();
            if ((pasos == 0)
		return 0;
	    else 
		return pasos* (generarNumeroPiRecursivo (pasos -1));{
                count++;
            }
        }
        pi = 4 * ((float)count / (float)pasos);
       return pi;
    }
}
