fun main() {
    atividade1()
    atividade2()
    atividade3()
    atividade4()
    atividade1When()
}

fun atividade1(): Unit {
    println("Digite a Primeira Nota:")
    val nota1 = readLine()!!.toFloat()
    println("Digite a Segunda Nota:")
    val nota2 = readLine()!!.toFloat()
    val media = (nota1 + nota2) / 2
    if(media >= 9)
        println("O aluno foi aprovado com mérito!!!")
    else if (media >= 6)
        println("O aluno foi aprovado!!!")
    else if (media >= 4)
        println("O aluno esta em recuperação")
    else if (media < 4)
        println("O aluno foi reprovado")
    else
        println("Operação Inválida")
}

fun atividade2(): Unit {
    println("Escolha o Gênero com o qual se identifica:\nM - Maculino\nF - Feminino\nO - Outros")
    val genero = readLine()!!
    if (genero.equals("m",true))
        println("Bem Vindo Senhor!!!")
    else if (genero.equals("f",true))
        println("Bem Vinda Senhora!!!")
    else if (genero.equals("o", true))
        println("Bem Vindo(a)!!!")
    else
        println("Digite uma Opção Válida")
}

fun atividade3(): Unit{
    println("Digite o primeiro valor:")
    val value1 = readLine()!!.toFloat()
    println("Digite o segundo valor:")
    val value2 = readLine()!!.toFloat()
    println("Digite o terceiro valor:")
    val value3 = readLine()!!.toFloat()

    val maior: Float
    val menor: Float

    if (value3 > value2 && value3 > value1)
        maior = value3
    else if (value2 > value3 && value2 > value1)
        maior = value2
    else
        maior = value1

    if (value3 < value2 && value3 < value1)
        menor = value3
    else if (value2 < value3 && value2 < value1)
        menor = value2
    else
        menor = value1

    println("Maior Valor: $maior\nMenor Valor: $menor")
}

fun atividade4(): Unit{
    println("Escolha o Turno Que Você Estuda:")
    println("M - Matutino\nV - Vespertino\nN - Noturno")
    val turno = readLine()!!
    if (turno.equals("m", true))
        println("Bom Dia!!!")
    else if (turno.equals("v", true))
        println("Boa Tarde!!!")
    else if (turno.equals("n", true))
        println("Boa Noite")
    else
        println("Digite um turno válido!!!")
}

fun atividade1When(): Unit {
    println("Digite o Primeiro Número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o Segundo Número:")
    val num2 = readLine()!!.toFloat()
    println("Escolha uma opração:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão")
    when(readLine()!!.toInt()){
        1 -> println("A soma é ${num1 + num2}")
        2 -> println("A Subtração é ${num1 - num2}")
        3 -> println("A Multiplicação é ${num1 * num2}")
        4 -> println("A Divisão é ${num1 / num2}")
        else -> println("Digite uma Operação Válida!!!")
    }
}