package machine

//thanks to Jaguar
data class Coffee(
    var water: Int,
    var milk: Int,
    var coffeeBeans: Int,
    var cups: Int,
    var money: Int,
)

val espresso = Coffee(250, 0, 16, 1, 4)
val latte = Coffee(350, 75, 20, 1, 7)
val cappuccino = Coffee(200, 100, 12, 1, 6)

fun printAndRead(info: String): String {
    println(info)
    return readln()
}

class CoffeeMachine() {
    private var milk = 540
    private var coffeeBeans = 120
    private var water = 400
    private var cups = 9
    private var money = 550

    override fun toString(): String {
        return """
        The coffee machine has:
        ${this.water} ml of water
        ${this.milk} ml of milk
        ${this.coffeeBeans} g of coffee beans
        ${this.cups} disposable cups
        $${this.money} of money
        """.trimIndent()
    }

    fun fill() {
        println()
        val water = printAndRead("Write how many ml of water you want to add:")
        this.water += water.toInt()
        val milk = printAndRead("Write how many ml of milk you want to add:")
        this.milk += milk.toInt()
        val beans = printAndRead("Write how many grams of coffee beans you want to add:")
        this.coffeeBeans += beans.toInt()
        val cups = printAndRead("Write how many disposable cups you want to add:")
        this.cups += cups.toInt()
    }

    private fun use(inputVariantCoffee: Coffee) {
        val (waterVariant, milkVariant, coffeeBeansVariant, cupsVariant, moneyVariant) = inputVariantCoffee
        if (this.milk >= milkVariant && this.coffeeBeans >= coffeeBeansVariant && this.water >= waterVariant && this.cups >= cupsVariant) {
            this.milk -= milkVariant
            this.coffeeBeans -= coffeeBeansVariant
            this.water -= waterVariant
            this.cups -= cupsVariant
            this.money += moneyVariant
        } else if (this.milk < milkVariant && this.coffeeBeans >= coffeeBeansVariant && this.water >= waterVariant && this.cups >= cupsVariant) {
            println("\nSorry, not enough water!")
        } else {
            println("\nI have enough resources, making you a coffee!")
        }

    }

    fun take() {
        println("\nI gave you $$money")
        this.money = 0
    }

    fun buyCoffee(choice: String) {
        when (choice) {
            "1" -> use(espresso)
            "2" -> use(latte)
            "3" -> use(cappuccino)
            "back" -> return
        }
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()

    while (true) {
        val action = printAndRead("\nWrite action (buy, fill, take, remaining, exit):")

        loop@ while (true) {
            when (action) {
                "buy" -> {
                    val coffee =
                        printAndRead("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                    coffeeMachine.buyCoffee(coffee)
                    break@loop
                }

                "fill" -> {
                    coffeeMachine.fill()
                    break@loop
                }

                "take" -> {
                    coffeeMachine.take()
                    break@loop
                }

                "remaining" -> {
                    println(coffeeMachine.toString())
                    break@loop
                }

                "exit" -> return
            }
        }
    }
}