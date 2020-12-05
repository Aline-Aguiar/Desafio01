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

    private fun validacaoCodAluno(codigoAluno: Int): Int {
        var indice = -1
        for (aluno in listaAlunos) {
            if (codigoAluno == aluno.codigoAluno)
                indice = listaAlunos.indexOf(aluno)
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
            val professorA = ProfessorAdjunto(nomePA, sobrenomePA, 0, codigoPA, qtdHorasMonitoria)
            listaProfessores.add(professorA)
        } else {
            println("Já existe um professor com o codigo $codigoPA. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun registrarProfessorTitular(nomePT: String, sobrenomePT: String, codigoPT: Int, especialidade: String) {
        if (validacaoCodProfessor(codigoPT) == -1) {
            val professorT = ProfessorTitular(nomePT, sobrenomePT, 0, codigoPT, especialidade)
            listaProfessores.add(professorT)
        } else {
            println("Já existe um professor com o codigo $codigoPT. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun excluirProfessor(codigoP: Int) {
        if (validacaoCodProfessor(codigoP) > -1) {
            listaProfessores.removeAt(validacaoCodProfessor(codigoP))
        } else {
            println("Não existe um professor com o código $codigoP. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }
    fun registrarAluno(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Int) {
        if (validacaoCodAluno(codigoAluno) == -1) {
            val aluno = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
            listaAlunos.add(aluno)
        } else {
            println("Já existe um aluno com o codigo $codigoAluno. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }
}