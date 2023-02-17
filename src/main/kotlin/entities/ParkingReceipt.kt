package entities

import java.util.*
import constants.VEHICLE_HOUR_CHARGE
import java.time.Duration
import java.time.LocalDateTime

class ParkingReceipt (
   ticket: Ticket,
     val receiptNumber: Int,
     val exitTime: LocalDateTime? =LocalDateTime.now()
    ) {

    private var entryTime: LocalDateTime? ticket.getEntryTime()
    private var parkingfee: Long = 0

    fun getReceiptnumber(): Int {
        return receiptNumber
    }

    fun generateReceipt(): Receipt{
        parkingCharge = calculateParkingCharge()
        return this
    }

    fun calculateParkingCharge(): Long{
        val duration = Duration.between(entryTime,exitTime).toHours()
        return duration* VEHICLE_HOUR_CHARGE
    }
}