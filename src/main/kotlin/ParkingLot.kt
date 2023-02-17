import entities.Vehicle
import models.ParkingSpot
import java.util.*
import entities.Ticket

abstract class ParkingLot {
    private var ticketNumber = 1
    private var receiptNumber = 1
    protected abstract val parkingSpot: ParkingSpot
    protected abstract val validVehicleClasses: Set<VehicleClass>


    fun park(vehicleType: Vehicle, entryDateTime: Date = Date()): Ticket {
        val vehicleClass = vehicleType.vehicleClass

}