package entities

import java.time.LocalDateTime

data class Ticket(
    private val ticketNumber: Int,
    private val spotNumber: Int,
    private val entryDateTime: LocalDateTime,
    private val vehicle: Vehicle
    )
{
    override fun toString(): String {
        return """
            Parking Ticket:
                Ticket Number: $ticketNumber
                Spot Number: $vehicle - $spotNumber
                Entry Date-time: $entryDateTime
        """.trimIndent()
    }


}