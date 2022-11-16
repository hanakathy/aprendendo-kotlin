package fundamentos

import java.util.*

class Soma {
    fun somar() {
        /*** A soma de dois valores inteiros ***/
        val scanner = Scanner(System.`in`);
        var A: Int = scanner.nextInt();
        var B: Int = scanner.nextInt();
        var SOMA: Int = A + B;

        println("SOMA = ${SOMA}");
    }
}