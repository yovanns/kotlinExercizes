fun main(args: Array<String>) {


    try {
        println("How much was the bill?")
        val full_price: String? = readLine()
        val bill: Float? = full_price?.toFloat() ?: 0.0f

        println("How many particapants?")
        val people_number: String? = readLine()
        val number: Int? = people_number?.toInt() ?: 0

        println("How much do we tip?")
        val tip_amount: String? = readLine()
        val tip: Float? = tip_amount?.toFloat() ?: 0.0f

        if (bill != null && tip != null && number != null && number != 0) {
            val separated_price = (bill + tip) / number
            println("Each participant should pay $separated_price")
        }
            else {
                println("Incorrect input")
                return
        }

    } catch
        (e: NumberFormatException) {
        println("Incorrect data type, try again.")
        return
    }
}