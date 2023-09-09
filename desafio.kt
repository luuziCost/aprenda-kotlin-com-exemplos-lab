// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(nome:String, sobrenome:String, val estado: String, val anoNasc:Int, val nivel_do_curso: String) {  
    
 var nome:String
 var sobrenome:String
    
 init {
     this.nome = nome
     this.sobrenome = sobrenome    
 }
   
  override fun toString() :String {
      return "Usuario: $nome, sobrenome: $sobrenome, estado: $estado, anoNasc: $anoNasc, nivel_do_curso: $nivel_do_curso"
       
  }
 
}

   data class ConteudoEducacional(val cursoDe:String, val duracaoHoras:Int = 360) {
  
} 
 
   data class Formacao(val aluno: String){ 
 
 } 

   fun main() {
   
   val curso_Sobre = ConteudoEducacional("Kotlin") 
   println(curso_Sobre)
   for (niveis in Nivel.entries) println(niveis.toString())
    
   val inscritos = mutableListOf<Usuario>()
   
   val inscrito = Formacao("matriculado ")
   print("Formacao: ${inscrito.aluno}") 
 
   val inscrito1 = Usuario("Lidia","Bela", "DF", 2000, "basico") 
   val inscrito2 = Usuario("Mauro", "Silas", "RJ", 1980, "avançado") 
     inscritos.add(inscrito1)
     inscritos.add(inscrito2)
     for(inscricao in inscritos) {
         println(inscricao)   
      } 
 }
  
  fun matricular(vararg usuario: String): List<String> {
    val matriculados = ArrayList<String>()
    for (matriculas in usuario)
     matriculados.add(matriculas)
     return matriculados
}