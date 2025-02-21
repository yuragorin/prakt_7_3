fun main(){
    try {


        println("введите скорость первого авто")
        var v1 = readLine()!!.toDouble()
        println("введите скорость второго авто")
        var v2 = readLine()!!.toDouble()
        println("расстояние между ними")
        var s = readLine()!!.toDouble()
        when{
            (v1>=0 && v2>=0&&s>0) -> println("t= ${s/(v1+v2)}")
            else -> println("введите корректные данные")
        }
    }
    catch(e:Exception){
        println("некорректные данные")
    }


}