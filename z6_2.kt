fun main(){
    try {


        println("введите трехзначное число")
        var v1 = readLine()!!.toInt()
        var v2 =0
        when{
            (v1>=100 && 999>=v1) -> v2=(v1/100)-(v1/10%10)
            else -> println("введите корректные данные")
        }
        when{
            v2<0 -> v2 = (v1/10%10)-(v1/100)
            else ->when{
                (v1%10==v2+(v1/10%10))-> println("есть алгоритм")
            }
        }
            when{
                v2>0->
                    when{
                        (v1%10==v2+(v1/10%10))-> println("есть алгоритм")
                    }
            }
    }
    catch(e:Exception){
        println("некорректные данные")
    }


}