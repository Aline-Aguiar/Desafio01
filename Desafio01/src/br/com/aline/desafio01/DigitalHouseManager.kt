package br.com.aline.desafio01

class DigitalHouseManager() {
    var listaAlunos: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCursos: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()

    private fun validacaoCodCurso(codigoCurso: Int): Int {
        var indice = -1
        for (curso in listaCursos) {
            if (codigoCurso == curso.codigoCurso)
                indice = listaCursos.indexOf(curso)
        }
        return indice
    }

    private fun validacaoCodProfessor(codigoP: Int): Int {
        var indice = -1
        for (professor in listaProfessores) {
            if (codigoP == professor.codigoProfessor)
                indice = listaProfessores.indexOf(professor)
        }
        return indice
    }

    fun registrarCurso(nomeCurso: String, codigoCurso: Int, qtdMaxAlunos: Int) {
        if (validacaoCodCurso(codigoCurso) == -1) {
            val curso = Curso(nomeCurso, codigoCurso, qtdMaxAlunos)
            listaCursos.add(curso)
        } else {
            println("Já existe um curso com o codigo $codigoCurso. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        if (validacaoCodCurso(codigoCurso) > -1) {
            listaCursos.removeAt(validacaoCodCurso(codigoCurso))
        } else {
            println("Não existe um curso com o código $codigoCurso. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun registrarProfessorAdjunto(nomePA: String, sobrenomePA: String, codigoPA: Int, qtdHorasMonitoria: Int) {
        if (validacaoCodProfessor(codigoPA) == -1) {
            val professor = ProfessorAdjunto(nomePA,sobrenomePA,0,codigoPA,qtdHorasMonitoria)
            listaProfessores.add(professor)
        } else {
            println("Já existe um professor com o codigo $codigoPA. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }
}