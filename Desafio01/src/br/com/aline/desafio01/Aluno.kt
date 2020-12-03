package br.com.aline.desafio01

data class Aluno(var nome:String, var sobrenome:String, val codigoAluno:Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (codigoAluno != other.codigoAluno) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoAluno
    }

    override fun toString(): String {
        return "Aluno(nome='$nome', sobrenome='$sobrenome', codigoAluno=$codigoAluno)"
    }

}