
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
}
