// hola

val names: List[String] = List("pepe","jose","juan")
val numbers: List[Int] = names.map(_.length)
val numbers2: List[Int] = names.map(x => x.length)

def toNumber(text: String): Int = text.length
def myFunc(a: String, b: String):String = a+b

names.map(num=>num.length)
names.map(toNumber(_))
names.map(toNumber) //no es necesario mandarle parametros porque el lenguaje lo entiende por si mismo

//==========================LISTA====================================
val nombres: List[String] = List("jose","pepe","pedro","mario","emilio","diego")

//longitud de los nombress
val nuevoNombres1: List[Int]= nombres.map(_.length)

//A mayusculas solo los que tengan longitud >= a 5
val nuevoNombres2: List[String]= nombres.filter(_.length>=5).map(_.toUpperCase())

//la inicial de cada nombre
val nuevoNombres3: List[Char]= nombres.map(_.charAt(0))

//los nombres al reves
val nuevoNombres4: List[String]= nombres.map(_.reverse)