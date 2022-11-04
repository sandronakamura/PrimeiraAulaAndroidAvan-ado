package com.example.calculadoraimc

internal fun getImcResult(pesoTxt: String, alturaTxt: String): IMCResult {

    // Verifica se os campos peso e altura não estão vazios, caso algum deles esteja retorna mensagem BLANK
    if (pesoTxt.isEmpty() || alturaTxt.isEmpty()){
        return IMCResult(Result.BLANK)
    }

    // Converte as informações recebidas como string para float
    val peso = pesoTxt.toFloat()
    val altura = alturaTxt.toFloat()

    // Realiza o calculo do IMC
    val imc = peso / (altura * altura)

    // Realiza a comparação do resultado com as classes do IMC e retorna o texto compativel.
    if (imc < 16){
        return IMCResult(Result.MAGREZA_III)
    } else if (imc < 17){
        return IMCResult(Result.MAGREZA_II)
    } else if (imc < 18.5){
        return IMCResult(Result.MAGREZA_I)
    } else if (imc < 25){
        return IMCResult(Result.OK)
    } else if (imc < 30){
        return IMCResult(Result.SOBREPESO)
    } else if (imc < 35){
        return IMCResult(Result.OBESIDADE_I)
    } else if (imc < 40){
        return IMCResult(Result.OBESIDADE_II)
    } else {
        return IMCResult(Result.OBESIDADE_III)
    }
}


// Classe de dados que armazena as classes do IMC
data class IMCResult(val result: Result)
 enum class Result(val label: String) {
    MAGREZA_III("Magreza Severa"),
    MAGREZA_II("Magreza moderada"),
    MAGREZA_I("Magreza leve"),
    OK("Saudável"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_I("Obesidade Grau I"),
    OBESIDADE_II("Obesidade GHrau II (severa)"),
    OBESIDADE_III("Obesidade GHrau III (mórbida)"),
    BLANK("Insira  os valores de peso e altura corretamente!")
}