import java.util.*

fun main(args: Array<String>) {
    /* Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável. */
    val scanner = Scanner(System.`in`);
    var A: Int = scanner.nextInt();
    var B: Int = scanner.nextInt();
    var SOMA: Int = A + B;

    println("SOMA = ${SOMA}");
}