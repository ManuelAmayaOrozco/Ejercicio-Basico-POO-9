class GestorDeTareas(val listaTareas: MutableList<Tarea>) {

    fun nuevaTarea(tarea: Tarea) {
        listaTareas.add(tarea)
    }

    fun eliminarTarea(tarea: Tarea) {
        listaTareas.remove(tarea)
    }

    fun cambiarEstado(pos: Int) {
        val tareacamb = listaTareas[pos]
        if (tareacamb.estado == "pendiente") {
                tareacamb.estado = "realizada"
            }
            else if (tareacamb.estado == "realizada") {
                tareacamb.estado = "pendiente"
            }
        listaTareas[pos] = tareacamb
    }

    fun mostrarTareas() {
        for (tarea in listaTareas) {
            println(tarea)
        }
    }

    fun mostrarTareasPendientes() {
        for (tarea in listaTareas) {
            if (tarea.estado == "pendiente") {
                println(tarea)
            }
        }
    }

    fun mostrarTareasRealizadas() {
        for (tarea in listaTareas) {
            if (tarea.estado == "realizada") {
                println(tarea)
            }
        }
    }

}