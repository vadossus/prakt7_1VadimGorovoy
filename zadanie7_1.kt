import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.abs

fun main(){
    try {
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()

        var a = sqrt(abs(x-1)) - sqrt(abs(y)).pow(3) / 1 + x.pow(2)/2+y.pow(2)/4
        println(a)
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
}