package br.com.aline.desafio01

fun main() {

    val sistema = DigitalHouseManager()
    sistema.registrarProfessorTitular("José", "Eduardo", 123, "Android")
    sistema.registrarProfessorTitular("Luis", "Bianco", 456, "Full Stack")
    sistema.registrarProfessorAdjunto("João", "Camargo", 789, 85)
    sistema.registrarProfessorAdjunto("Felipe", "Mackay", 258, 90)

    sistema.registrarCurso("Full Stack", 20001, 3)
    sistema.registrarCurso("Android", 20002, 2)

    sistema.alocarProfessor(20001, 456, 258)
    sistema.alocarProfessor(20002, 123, 789)

    sistema.registrarAluno("Luíza", "Alencar", 1)
    sistema.registrarAluno("Paul", "Phillip", 2)
    sistema.registrarAluno("Leandro", "Alves", 3)
    sistema.registrarAluno("Patrícia", "Gimenez", 4)
    //sistema.registrarAluno("Priscila", "Silva", 5)

    sistema.matricularAluno(1, 20001)
    sistema.matricularAluno(3, 20001)
    sistema.matricularAluno(2, 20002)
    sistema.matricularAluno(4, 20002)
    //istema.matricularAluno(4,20002)
    //sistema.matricularAluno(5,20002)

}