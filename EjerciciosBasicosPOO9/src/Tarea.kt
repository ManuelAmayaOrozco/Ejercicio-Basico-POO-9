import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Tarea(var descripcion: String, var estado: String = "pendiente") {

    var identificador = 0

    val fechaHoraActual: LocalDateTime = LocalDateTime.now()
    // Formatear la fecha y hora para imprimir
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val fechaFormateada: String = fechaHoraActual.format(formatter)

    init {
        identificador++
    }

    override fun toString(): String {
        return "Identificador: $identificador\n$descripcion\nEstado: $estado ($fechaFormateada)"
    }


}