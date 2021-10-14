var funds : Double = 100.0
val pswd = "password"
var amountToDeposit: Double = 0.0

//Function to call balance
fun balance(): Double {
    return funds
}

//Function to deposit
fun deposit(amountToDeposit: Double){
    funds += amountToDeposit
    println("Deposit successful!")
}

//Function to withdraw
fun withdraw(amountToWithdraw: Double){
    var input : String
    print("Enter password: ")
    input = readLine()!!

    when { (input == pswd) -> {
        funds -= amountToWithdraw
        println("Withdrawal successful!")
         }
    }
}

//Main function
fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            // Each command goes here...
            "balance" -> println("Your available balance is ${balance()}")
            "deposit" -> deposit(cmd[1].toDouble())
            "withdraw" -> withdraw(cmd[1].toDouble())
            else -> println("Invalid command")
        }

    }
}