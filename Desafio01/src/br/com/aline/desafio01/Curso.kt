package br.com.aline.desafio01

class Curso(var nomeCurso: String,
            val codigoCurso:Int,
            var professorTitular: ProfessorTitular,
            var professorAdjunto: ProfessorAdjunto,
            var qtdMaxAlunos: Int,
            var matriculados: List<Aluno> = listOf()){


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoCurso
    }

    override fun toString(): String {
        return "Curso(nomeCurso='$nomeCurso', codigoCurso=$codigoCurso, qtdMaxAlunos=$qtdMaxAlunos)"
    }


}