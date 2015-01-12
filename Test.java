
/**
 * Actividad 0049
 */
public class Test
{
    // La version basica no tiene atributos

    /**
     * Constructor for objects of class Test
     */
    public Test(){
        // Al no haber atributos, no hay que inicializarlos
    }

    /**
     * Devuelve todos los multiplos de 5 comprendidos entre 10 y 95
     * Ellos mismos no estan incluidos
     */
    public void multiplesOfFive(){
        int contador = 15;
        System.out.println("Multiplos de 5 entre 10 y 95:");
        while(contador < 91){
            System.out.println(contador);
            contador += 5;
        }
    }
    
    /**
     * Muestra la suma de los numeros desde 0 hasta 10 incluidos
     * El metodo emplea el bucle while
     */
    public void sumValues(){
        int acumulador = 0;
        int contador = 0;
        while(contador < 11){
            acumulador += contador;
            contador++;
        }
        System.out.println("La suma de los numeros de 0 a 10 es: " + acumulador);
    }
}
