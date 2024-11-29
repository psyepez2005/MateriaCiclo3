def calcArea(fig:(Double,Double)=>Double, x:Double, y:Double): Double={
  val respuesta = fig(x,y)
  respuesta
}


def areaTrian(b:Double, h:Double):Double = (b*h)/2
def areaPara(b:Double, h:Double):Double = b*h
def areaCuad(l1:Double, l2:Double):Double = l1*l2
def areaRect(b:Double, h:Double):Double = b*h
def areaRomb(dMay:Double, dMen:Double):Double = (dMay*dMen)/2
//def areaPoligReg(p:Double, a:Double):Double = (p*a)/2
//def areaCirc(r:Double, x:Double):Double = math.Pi*math.pow(r,2)


calcArea(areaTrian,2,5)
calcArea(areaPara,2,5)
calcArea(areaCuad,2,0)
calcArea(areaRect,2,5)
calcArea(areaRomb,2,5)
//calcArea(areaPoligReg,2,5)
//calcArea(areaCirc,2,0)