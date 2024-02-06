import kotlin.math.*
import kotlin.math.pow

fun main(){
    try {
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()
        var z = readLine()!!.toDouble()

        val e = 2.71828

        var a = sqrt(abs(x-1)) - sqrt(abs(y)).pow(3) / 1 + x.pow(2)/2+y.pow(2)/4
        var b = x * (atan(z) + e.pow(-(x+3)))
        println(a)
        println(b)


    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
}