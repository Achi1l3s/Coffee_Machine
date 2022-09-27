class LewisCarrollBook(name: String = "", author: String = "Lewis Carroll", price: Int = 0) {
    var name: String = name
        get() {
            println("The name of the book is $field")
            return field
        }
        set(value) {
            println("Now, a book called $value")
            field = value
        }
    val author: String = author
        get() {
            println("The author of the book is $field")
            return field
        }
    var price: Int = price
        get() {
            println("Putting a new price...")
            return field
        }
        set(value) {
            println("The new price is $value")
            field = value
        }
}
