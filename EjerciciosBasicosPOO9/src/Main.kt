fun main() {

    val tarea1 = Tarea("hisdhuausid", "pendiente")
    val tarea2 = Tarea("eeeeeeeeeee", "pendiente")

    val listaTareas = mutableListOf<Tarea>(tarea1, tarea2)

    val gestor = GestorDeTareas(listaTareas)

    gestor.mostrarTareas()

}