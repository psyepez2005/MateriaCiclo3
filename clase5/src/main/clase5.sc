val values =List(1,2,3,4,5)
val names = List("ola","chao")

val nums: List[Int] = List(1,2,3,4,5)
val fruits: List[String] = List("apple","orange")
val empty: List[Double] = List()
val mix : List[Any]= List("Maria",1.5,3,true,'a')

val myList : List[Int] = List(10,20,30,40,50,60)
myList.isEmpty  //false
myList.drop(2)  //elimina los dos primeros, devuelve una lista
myList.dropWhile(_ <25) //elimina los que no cumplan la condicion     (_) ETA EXPANSION
myList.dropWhile(n => n<25) //es la forma larga de escribir lo de arriba, ya q dropWhile recibe una funcion
myList.slice(2,4) //devuelve [30,40], le mando los indices DESDE el 2 y HASTA 4 pero al 4 no lo agarra
myList.tail //devuelve todos los valores menos la cabeza
myList.take(3)  //devuelve los 3 primeros valores
myList.takeWhile(_<30)  //devuelve los valores uno por uno hasta que no se cumpla la condicion
//ejm:(10,70,20,30) -> (10), no retorna el 20 xq ya el 70 no cumplio la condicion
myList.sorted //ordena la lista por defecto de forma ascendente
myList.sorted(Ordering.Int.reverse) //asi es para ordenar en descendente

def esPrimo(n:Int): Boolean = (2 to n-1).forall(k => n % k !=0)
def esPrimo(n:Int): Boolean = (2 to n-1).forall(n % _ !=0)
esPrimo(7)
esPrimo(8)

myList.foldLeft(0)((x,y)=>x+y) //ay

def sumar2(n:Int):Int=>Int         =        (x:Int)  =>  x+n
//       param1    devuel1      cuerpo->    param2       devuelv2
sumar2(1)(2) //1 es n, 2 es x

