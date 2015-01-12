
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
    
    /**
     * Muestra la suma de los numeros desde a hasta b incluidos
     * El usuario ha de introducir a y b
     */
    public void sumValuesInterval(int a, int b){
        if(a > b){
            int intercambio = a;
            a = b;
            b = intercambio;
        }
        int acumulador = 0;
        int contador = a;
        while(contador <= b){
            acumulador += contador;
            contador++;
        }
        System.out.println("La suma de los numeros entre " + a + " y " + b + " es: " + acumulador);
    }
    
    /**
     * Devuelve Verdadero (True) si el numero introducido es primo
     * En caso contrario, devuelve Falso (False);
     */
    public boolean isPrime(int n){
        boolean numberIsPrime = true;
        int divisor = 2;
        while(numberIsPrime && divisor < n){
            if(n%divisor == 0){
                numberIsPrime = false;
            }else{
                divisor++;
            }
        }
        return numberIsPrime;
    }
}
