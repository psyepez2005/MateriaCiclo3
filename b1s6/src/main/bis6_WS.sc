/*
1. Suponga que tiene una lista de digitos (0-9), su trabajo consiste en transformar esa lista
en una nueva lista con los nombres de cada digito. Ejemplo: [0, 1, 2] se convierte en: [Cero Uno, Dos]
*/
def num_letras(n:Int):String={
  n match
    case 0 => "cero"
    case 1 => "uno"
    case 2 => "dos"
    case 3 => "tres"
    case 4 => "cuatro"
    case 5 => "cinco"
    case 6 => "seis"
    case 7 => "siete"
    case 8 => "ocho"
    case 9 => "nueve"
    case _ => "NO ES UN DIGITO"


}
val lista: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11)
val nuevaLista: List[String] = lista.map(x=>num_letras(x))


/*
2. Y una lista con por lo menos 5 objetos de esa case class.

Utilizando la función map y otras responda a lo siguiente:

¿Cuál es la suma total de edad?
¿Cuál es la suma total de el peso?
¿Cuál es el promedio de las edades?
¿Cuál es el promedio de los pesos?
Para las siguientes preguntas tiene como restricción que no puede modificar el tamaño de la lista.

¿Cuántos valores de la edad son mayores al promedio?
¿Cuántos valores de la edad son menores al promedio?
¿Cuántos valores del peso son mayores al promedio?
¿Cuántos valores del peso son menores al promedio?
 */
case class Estudiante(cedula: String, apellidos: String, nombres: String, edad: Int, peso: Double)

val listaEst: List[Estudiante]=
  List(
    Estudiante("1105","Sota","Elias",18,67),
    Estudiante("1106","Pepe","Galindo",19,70),
    Estudiante("1107","Emilio","Perez",20,55),
    Estudiante("1108","Jose","Sanchez",21,90),
    Estudiante("1109","Mario","Castaneda",22,100),
  )


def estudiantesDatos(num: Double,e: Estudiante):Double={
  num match
    case 1 => e.edad
    case 2 => e.peso

}







def devolverEdad(e: Estudiante):Int={
  e.edad
}

val sumEdades: Double = listaEst.map(estudiantesDatos(1,_)).sum

val sumPesos: Double = listaEst.map(estudiantesDatos(2,_)).sum

val promEdades: Double = listaEst.map(estudiantesDatos(1,_)).sum/listaEst.size

val promPesos: Double = listaEst.map(estudiantesDatos(2,_)).sum/listaEst.size


val mayoresEDAD: Double = listaEstlistaEst.map(estudiantesDatos(1,_)>promEdades)

val menoresEDAD: Double = listaEstlistaEst.map(estudiantesDatos(1,_)<promEdades)

val mayoresPESO: Double = listaEstlistaEst.map(estudiantesDatos(2,_)>promEdades)

val menoresPESO: Double = listaEstlistaEst.map(estudiantesDatos(2,_)<promEdades)

