fun main(args: Array<String>) {

    var x: Int
    var y = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    println("ENTER TIME IN")
    var timeIn: Int = readLine()!!.toInt()
    println("Enter [am] or [pm]")
    var pm_or_am_timeIn: String = readLine()!!.toString()

    println("ENTER TIME OUT")
    var timeOut: Int = readLine()!!.toInt()
    println("Enter [am] or [pm]")
    var pm_or_am_timeOut: String = readLine()!!.toString()

    if (pm_or_am_timeIn.equals("am", ignoreCase = true) && pm_or_am_timeOut.equals("pm", ignoreCase = true)) {
        timeInAmandTimeOutPm(timeIn,timeOut)
    }
}

fun timeInAmandTimeOutPm(timeIn: Int, timeOut:Int){
    var counter1: Int = 0
    var counter2: Int = 0
    for (num in timeIn..12) {
        counter1=num-1
    }
    for(nums in 1..timeOut){
        counter2=nums
    }
    println(counter1+counter2)
}
