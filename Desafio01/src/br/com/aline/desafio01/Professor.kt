package br.com.aline.desafio01

abstract class Professor(var nomeProfessor: String,
                     var sobrenomeP: String,
                     var tempoDeCasa: Int,
                     val codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (codigoProfessor != other.codigoProfessor) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoProfessor
    }

    override fun toString(): String {
        return "Professor(nomeProfessor='$nomeProfessor', " +
                "sobrenome='$sobrenomeP', " +
                "tempoDeCasa=$tempoDeCasa, " +
                "codigoProfessor=$codigoProfessor,"
    }

}