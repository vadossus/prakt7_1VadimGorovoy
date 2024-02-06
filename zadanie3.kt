fun main()
{
    try {
        println("введите значения: ")
        val a1 = readLine()!!.toInt()
        val d = readLine()!!.toInt()
        val k = readLine()!!.toInt()
        val p = readLine()!!.toInt()

        var summa = 0

        for (i in k..p)
        {
            summa += a1 + (i-1)*d
        }
        println("Сумма арифметической прогрессии: $summa")
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
}

