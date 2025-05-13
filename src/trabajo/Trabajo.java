
package trabajo;


public class Trabajo {

    public static void main(String[] args) {
      
        Operaciones basicas = new Operaciones();

        int a = 10;
        int b = 5;

        System.out.println("Suma: " + basicas.sumar(a, b));
        System.out.println("Resta: " + basicas.restar(a, b));
        System.out.println("Multiplicación: " + basicas.multiplicar(a, b));
        System.out.println("División: " + basicas.dividir(a, b));
    }
    
}
