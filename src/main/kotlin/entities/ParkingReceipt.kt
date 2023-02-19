package entities


import constants.VEHICLE_HOUR_FEE
import java.time.Duration
import java.time.LocalDateTime

class ParkingReceipt(
    ticket: Ticket,
    val receiptNumber: Int,
    val exitTime: LocalDateTime? = LocalDateTime.now()
) {

    private var entryTime = ticket.getEntryTime()
    private var parkingfee: Long = 0

    fun getReceiptnumber(): Int {
        return receiptNumber
    }

    fun generateReceipt(): ParkingReceipt {
        parkingfee = calculateParkingfee()
        return this
    }

    fun calculateParkingfee(): Long {
        val duration = Duration.between(entryTime, exitTime).toHours()
        return duration * VEHICLE_HOUR_FEE
    }
}