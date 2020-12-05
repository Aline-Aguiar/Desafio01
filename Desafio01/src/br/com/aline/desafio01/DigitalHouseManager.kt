package br.com.aline.desafio01

class DigitalHouseManager() {
    var listaAlunos: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCursos: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()

    private fun validacaoCodCurso(codigoCurso: Int): Curso? {
        var i: Curso? = null
        for (curso in listaCursos) {
            if (codigoCurso == curso.codigoCurso)
                i = curso
        }
        return i
    }

    private fun validacaoCodProfessor(codigoP: Int): Professor? {
        var i: Professor? = null
        for (professor in listaProfessores) {
            if (codigoP == professor.codigoProfessor)
                i = professor
        }
        return i
    }

    private fun validacaoCodAluno(codigoAluno: Int): Aluno? {
        var i: Aluno? = null
        for (aluno in listaAlunos) {
            if (codigoAluno == aluno.codigoAluno)
                i = aluno
        }
        return i
    }

    fun registrarCurso(nomeCurso: String, codigoCurso: Int, qtdMaxAlunos: Int) {
        if (validacaoCodCurso(codigoCurso) == null) {
            val curso = Curso(nomeCurso, codigoCurso, qtdMaxAlunos)
            listaCursos.add(curso)
        } else {
            println("Já existe um curso com o codigo $codigoCurso. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        if (validacaoCodCurso(codigoCurso) != null) {
            listaCursos.remove(validacaoCodCurso(codigoCurso))
        } else {
            println("Não existe um curso com o código $codigoCurso. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun registrarProfessorAdjunto(nomePA: String, sobrenomePA: String, codigoPA: Int, qtdHorasMonitoria: Int) {
        if (validacaoCodProfessor(codigoPA) == null) {
            val professorA = ProfessorAdjunto(nomePA, sobrenomePA, 0, codigoPA, qtdHorasMonitoria)
            listaProfessores.add(professorA)
        } else {
            println("Já existe um professor com o codigo $codigoPA. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun registrarProfessorTitular(nomePT: String, sobrenomePT: String, codigoPT: Int, especialidade: String) {
        if (validacaoCodProfessor(codigoPT) == null) {
            val professorT = ProfessorTitular(nomePT, sobrenomePT, 0, codigoPT, especialidade)
            listaProfessores.add(professorT)
        } else {
            println("Já existe um professor com o codigo $codigoPT. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun excluirProfessor(codigoP: Int) {
        if (validacaoCodProfessor(codigoP) != null) {
            listaProfessores.remove(validacaoCodProfessor(codigoP))
        } else {
            println("Não existe um professor com o código $codigoP. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun registrarAluno(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Int) {
        if (validacaoCodAluno(codigoAluno) == null) {
            val aluno = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
            listaAlunos.add(aluno)
        } else {
            println("Já existe um aluno com o codigo $codigoAluno. " +
                    "Favor, tentar novamente com um código diferente.")
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val aluno = validacaoCodAluno(codigoAluno)
        val curso = validacaoCodCurso(codigoCurso)
        if (aluno == null) {
            println("Não existe um aluno com o código $codigoAluno registrado na Digital House. " +
                    "Favor, tentar novamente com outro código ou registrar o aluno.")
        } else if (curso == null) {
            println("Não existe um curso com o código $codigoCurso registrado na Digital House. " +
                    "Favor, tentar novamente com outro código.")
        } else if (curso.adicionarUmAluno(aluno)) {
            val matricula = Matricula(aluno, curso)
            this.listaMatriculas.add(matricula)
            println("Matrícula de ${aluno.nome} ${aluno.sobrenome} no " +
                    "curso de ${curso.nomeCurso} realizada com sucesso!")
        } else {
            println("Matrícula não efetuada.")
        }
    }

    fun alocarProfessor(codigoCurso: Int, codigoPT: Int, codigoPA: Int) {
        val curso = validacaoCodCurso(codigoCurso)
        val professorT = validacaoCodProfessor(codigoPT)
        val professorA = validacaoCodProfessor(codigoPA)
        if (curso == null) {
            println("Não existe um curso com o código $codigoCurso registrado na Digital House. " +
                    "Favor, tentar novamente com outro código.")
        } else if (professorT == null) {
            println("Não existe um professor com o código $codigoPT registrado na Digital House. " +
                    "Favor, tentar novamente com outro código ou registar o aluno.")
        } else if (professorA == null) {
            println("Não existe um professor com o código $codigoPA registrado na Digital House. " +
                    "Favor, tentar novamente com outro código ou registar o aluno.")
        } else {
            curso.professorTitular = professorT as ProfessorTitular
            curso.professorAdjunto = professorA as ProfessorAdjunto
            println("Professores ${professorT.nomeProfessor} ${professorT.sobrenomeP} e " +
                    "${professorA.nomeProfessor} ${professorA.sobrenomeP} " +
                    "alocados no curso ${curso.nomeCurso} com sucesso!")
        }
    }
}