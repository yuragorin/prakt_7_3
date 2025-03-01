fun main(){
    try {


        println("выбор графика")
        var switch = readLine()!!.toInt()
        println("чему равен x")
        var x = readLine()!!.toDouble()


            when (switch) {
                1 -> if (x < 2 && x != 0.0) {
                    println("y= ${0}")
                } else {
                    println("y= ${1}")
                }

                2 -> if (x < 4 && x != 0.0 || x == 4.0) {
                    println("y= ${0}")
                } else {
                    println("y= ${1}")
                }

                3 -> if (x < 3 && x != 0.0) {
                    println("y= ${0}")
                } else {
                    println("y= ${1}")
                }

                4 -> if (x < 2 && x != 0.0) {
                    println("y= ${0}")
                } else {
                    println("y= ${1}")
                }

                else -> println("такого графика нет")



        }
    }
    catch(e:Exception){
        println("неверные данные")
    }





}