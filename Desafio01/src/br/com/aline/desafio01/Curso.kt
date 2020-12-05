package br.com.aline.desafio01

class Curso(var nomeCurso: String,
            val codigoCurso: Int,
            var qtdMaxAlunos: Int
            ) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    var matriculados: MutableList<Aluno> = mutableListOf()


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

    private fun validacaoCodigo(umAluno: Aluno): Boolean {
        return !matriculados.contains(umAluno)
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (validacaoCodigo(umAluno) && this.matriculados.size < this.qtdMaxAlunos) {
            matriculados.add(umAluno)
            return true
        } else{
            if(!validacaoCodigo(umAluno)) println("Já existe um aluno com este código. " +
                    "Favor, tentar novamente com um código diferente.")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno){
        val contem =matriculados.contains(umAluno)
        if(contem){
            matriculados.remove(umAluno)
        }else{
            println("Aluno ${umAluno.nome} ${umAluno.sobrenome} não está matrículado neste curso")
        }
    }

}