package fundamentos

import java.util.Scanner

class EstruturaWhen {
    fun usarWhen(){
        // Estrutura When funciona como o Switch-Case de outras linguagens
        val scanner = Scanner(System.`in`);
        var valor = scanner.nextInt();

        when (valor){
            1, 7 -> println("Final de semana");
            in 2..6 -> println("Dia de Semana");
            else -> println("Feriado");
        }
    }
}