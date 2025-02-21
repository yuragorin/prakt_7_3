fun main(){
    try {


        println("введите коэф функции a")
        var a = readLine()!!.toDouble()
        println("введите коэф функции b")
        var b = readLine()!!.toDouble()
        println("введите коэф функции c")
        var c = readLine()!!.toDouble()
        println("введите начало отрезка u")
        var u = readLine()!!.toDouble()
        println("введите конец отрезка v")
        var v = readLine()!!.toDouble()
        println("введите x")
        var x = readLine()!!.toDouble()
        var y = 0!!.toDouble()
        when{
            a>=1&&b>=1&&c>=1 ->y=(a*x*x)+(b*x)+c

        }
        when{
            y>u -> println("минимальное значение функции${u}")


        }
        println(y)
        when{
            y>u && y<v -> println("макс значение ${y}")
            else -> when{
                v==y ->println("макс значение ${y}")
            }

        }
    }
    catch(e:Exception){
        println("некорректные данные")
    }


}