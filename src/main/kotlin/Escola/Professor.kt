package Escola

class Professor(
    val nome: String,
    val RegistroDoc: Int
) {

    fun ValidaProfessor(confChamada: Boolean, confPresenca: Boolean) {
        if (confChamada && confPresenca) {
            println("Professor presente e chamada realizada.")
        } else {
            println("Professor Ausente")
        }
    }

}