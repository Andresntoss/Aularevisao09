package Escola

class Aluno(
    val nome: String = "",
    val sobrenome: String = "",
    val ra: Int = 0
) {

    fun assistirAula(): String {
        return "Aluno $nome assitiu a aula."
    }

    fun licaoDeCasa(): String {
        return "Aluno $nome fez lição."
    }

}