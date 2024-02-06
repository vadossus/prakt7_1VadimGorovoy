import kotlin.math.sqrt
import kotlin.math.pow
fun main()
{
    try {
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var c = readLine()!!.toDouble()

        if (a == 0.0 || b == 0.0 || c == 0.0)
        {
            println("Одна из сторон равна нулю")
        }
        else {
            var p = a + b + c/2

            var hA = 2/a * sqrt(p * (p-a) * (p-b) * (p-c))

            var mA = 0.5 * sqrt((2*b.pow(2)) * (2*c.pow(2)) - a.pow(2))

            var bA = 2 * sqrt(b*c*p*(p-a)) / b + c

            println("Высота треугольника: $hA")
            println("Медиана к стороне а : $mA")
            println("Биссектриса угла а: $bA")
        }

    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

}