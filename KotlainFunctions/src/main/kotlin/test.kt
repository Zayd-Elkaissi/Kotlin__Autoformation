
    val users = mutableListOf<String>()
    fun main() {
        while (true) {
            println("Select an option:")
            println("1. Show")
            println("2. Add")
            println("3. Remove")
            var option: Int = readLine()!!.toInt()
            when (option) {
                1 -> {
                    println("------ Show ------")
                    Show()
                }

                2 -> {
                    println("------ Add ------")
                    Add()
                }

                3 -> {
                    println("------ Remove ------")
                    Remove()
                }

                4 -> {
                    break

                }
                else -> {
                    println("Invalid option. Please select one of the options provided.")
                }
            }
        }

    }
    fun Show(){
        // Read users
        for (u in users) {
            println("User $u")
        }
    }
    fun Add(){
        // Create a user
        print("Add name")
        var name:String= readLine()!!.toString()
        users.add(name)

    }
    fun Remove(){
        // Remove a user
        println("Enter the name of the user you want to remove: ")
        var name:String= readLine()!!.toString()
        users.remove(name)
        println("User $name removed successfully.")
    }

