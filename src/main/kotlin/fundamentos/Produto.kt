package fundamentos

import java.util.*

class Produto {
    fun multiplicar(){
        /*** O produto entre estes dois valores inteiros ***/

        println("=== MULTIPLICACAO ===");

        val scanner = Scanner(System.`in`);
        var num1: Int = scanner.nextInt();
        var num2: Int = scanner.nextInt();
        var PROD: Int = num1 * num2;

        println("PROD = ${PROD}");
    }
}