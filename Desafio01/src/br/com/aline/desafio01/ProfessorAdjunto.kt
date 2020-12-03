package br.com.aline.desafio01

class ProfessorAdjunto(nomeProfessor: String,
                       sobrenomeP: String,
                       tempoDeCasa: Int,
                       codigoProfessor: Int,
                       var horasMonitoria: Int): Professor (nomeProfessor,sobrenomeP,tempoDeCasa,codigoProfessor) {

    override fun toString(): String {
        return "ProfessorAdjunto(horasMonitoria=$horasMonitoria)"
    }
}