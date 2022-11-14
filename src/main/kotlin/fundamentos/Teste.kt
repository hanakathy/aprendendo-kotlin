package fundamentos

data class Endereco (val rua: String, val numero: Int)
{
    // Quando se coloca 'data' antes de class, o metodo toString() eh sobreescrito
}

fun main(args: Array<String>){ //metodo Main
    /* Estudo de declaracoes de variaveis */
    var name = "Nami"; // Tipo declarado e iniciado. Pode ser mudado depois
    val nameVal = "Usopp"; // Tipo de variavel imutavel
    lateinit var pirata : String; //Coloca-se 'lateinit' para ser iniciado depois mas tem que ter o tipo
}

fun helloWorld(nome: String){
    println("Hello, ${nome}, to the new world!");
}