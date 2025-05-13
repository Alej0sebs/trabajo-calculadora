/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Sebs
 */
public class Operaciones {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    // Agregar multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Agregar dividir
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return (double) a / b;
    }
}
