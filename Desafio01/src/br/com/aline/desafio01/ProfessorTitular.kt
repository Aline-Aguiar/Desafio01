package br.com.aline.desafio01

class ProfessorTitular(nomeProfessor: String,
                       sobrenomeP: String,
                       tempoDeCasa: Int,
                       codigoProfessor: Int,
                       var especialidade: String): Professor (nomeProfessor,sobrenomeP,tempoDeCasa,codigoProfessor) {

    override fun toString(): String {
        return "ProfessorTitular(especialidade='$especialidade')"
    }
}