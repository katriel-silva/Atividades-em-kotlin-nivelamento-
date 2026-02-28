fun main() {
    println("Seja bem vindo(a), vamos calcular!!")
    println("Escolha o primeiro número!!")
    val numero1 = readln().toInt()

    println("Escolha o segundo número!!")
    val numero2 = readln().toInt()

    println("Escolha uma operação!!")
    println("+ , *, - ou /")
    val operacao = readln().last()

    val resultado = when (operacao) {
        '+' -> numero1 + numero2
        '-' -> numero1 - numero2
        '*' -> numero1 * numero2
        '/' -> numero1 / numero2
        else -> print("Operação incorreta!")
    }

    print("O resultado da operação é: $resultado")
}