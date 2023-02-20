package example.myapp
fun main() {
    val productManagement = ProductManagement()

    while (true) {
        println("\n--- PRODUCT MANAGEMENT MENU ---")
        println("1. Show")
        println("2. Add a product")
        println("3. Delete a product")
        println("4. Display products")
        println("5. Exit program")
        print("Enter your choice: ")
        var option: Int = readLine()!!.toInt()
        when (option) {

            1 -> {
                println("\nProduct list:")
                productManagement.Show()
            }
            2 -> {
                print("\nEnter product name: ")
                val name = readLine()?.toString() ?: ""
                print("Enter product price: ")
                val price = readLine()?.toDoubleOrNull() ?: 0.0

                val product = object : Product(name, price) {}
                productManagement.addProduct(product)

                println("\nProduct added successfully!")
            }
            3 -> {
                println("\n--- PRODUCTS ---")
                productManagement.Show()

                print("\nEnter product name to delete: ")
                val name = readLine()?.trim() ?: ""
                productManagement.deleteProduct(name)
                println("Product $name removed successfully.")
            }
            5 -> {
                println("\nExiting program. Goodbye!")
                return
            }
            else -> {
                println("\nInvalid choice. Please try again.")
            }
        }
    }
}
