package review.second

fun main() {
    // Simple to-do list syntax//

    val task = mutableListOf<Pair<String, Boolean>>()

    while (true){
        print("Enter command: ")
        val command: String? = readLine()

        when(command){

            "add" -> {
                print("Add task: ")
                val addTask: String? = readLine()
                if (!addTask.isNullOrBlank()){
                    task.add(Pair(addTask.trim(), false))
                    println("Task added: ${addTask.trim()}")
                }
            }

            "remove" -> {
                print("Remove task: ")
                val index = (readLine()?.toIntOrNull()?: 0) -1
                if (index in task.indices){
                    val removeTask = task.removeAt(index)
                    println("Remove task: ${removeTask.first}")
                } else {
                    println("Invalid index!")
                }
            }

            "list" -> {
                if (task.isEmpty()){
                    println("Empty task list")
                }else{
                    task.forEachIndexed { i, t ->
                        val status = if (t.second) "Done" else "Not Done"
                        println("${i + 1}: ${t.first} [$status}") }
                }
            }

            "done" -> {
                print("Enter task number: ")
                val markDone = (readLine()?.toIntOrNull()?: 0) -1
                if (markDone in task.indices) {
                    val current = task[markDone]
                    task[markDone] = Pair(current.first, true)
                    println("Task marked as Done: ${current.first}")
                }else{
                    println("Invalid index")
                }
            }

            "exit" -> {
                println("End of the program!")
                break
            }
            else -> println("Unknown Command!")
        }
    }
}