package br.com.aline.desafio01

fun main(){
//    val numeros = mutableListOf(1,2,3,4)
//    numeros.add(5)
//    println(numeros)
//
//    numeros.removeAt(1)
//    println(numeros)
//
//    numeros[0]=0
//    println(numeros)
//
//    numeros.random()
//    println(numeros)


    val aluno1 = Aluno("Gustavo","Silva",1234)
    val aluno2 = Aluno("Luiza","Oliveira",5678)
    val aluno3 = Aluno("Bruna","Santos",9101)

    val professorT = ProfessorTitular("Leandro","Bianco",5,258,"Biologia")
    val professorA = ProfessorAdjunto("José","Soares",3,357,3)

//    val curso = Curso("Biologia",18,2)
//    val curso1 = Curso(nomeCurso = "Matemática", codigoCurso = 12, qtdMaxAlunos = 5)
//    val curso2 = Curso("Física",15,20)

    val dig = DigitalHouseManager()

    dig.registrarAluno("Marcos","Paulo",11)
    dig.registrarAluno("Maria","Pilar",19)
    dig.registrarAluno("Maité","Ribeiro",19)
    dig.registrarAluno("Bianca","Barros",23)

    println("${dig.listaAlunos}")
//    dig.registrarProfessorAdjunto("Carlos","Batista",52,2)
//    dig.registrarProfessorAdjunto("Priscila","Bianco",35,5)
//    dig.registrarProfessorAdjunto("Bruna","Farias",52,1)
//    dig.registrarProfessorTitular("Micael","Phillips",16,"Geografia")
//
//    println("${dig.listaProfessores}")
//    dig.excluirProfessor(35)
//    println()
//    println("${dig.listaProfessores}")
//    dig.excluirProfessor(17)
//    println()
//    println("${dig.listaProfessores}")


//    dig.registrarCurso("Biologia",12,10)
//    dig.registrarCurso("Matemática",12,15)
//    dig.registrarCurso("Fisica",18,23)
//
//    println("${dig.listaCursos}")
//    println()
//    dig.excluirCurso(22)
//    println("${dig.listaCursos}")

//    println("${curso.matriculados}")
//    println()
//    println("${curso.adicionarUmAluno(aluno3)}")
//    println("${curso.matriculados}")
//    println()
//    curso.excluirAluno(aluno3)
//    println("${curso.matriculados}")
//    println()
//    println("${curso.adicionarUmAluno(aluno3)}")
//    println("${curso.matriculados}")



}