fun main(){
    try {


    println("напишите время t")
    var t = readLine()!!.toDouble()
    println("напишите ускорение a")
    var a = readLine()!!.toDouble()
    println("начальный момент времени скорость=")
    var v = readLine()!!.toDouble()
    when{
        (t>0 && a>=0 && v>=0) -> println("s= ${+v*t+(a*t*t)/2}")
        else -> println("введите корректные данные")
    }
    }
    catch(e:Exception){
        println("некорректные данные")
    }


}