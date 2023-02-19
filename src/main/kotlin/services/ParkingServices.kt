package services

import ParkingLot
import entities.Ticket
import entities.Vehicle
import exceptions.ParkingLotFullException


var ticketNumber =1
var receiptNumber =1
class ParkingServices {

    private val parkingLot: ParkingLot = ParkingLot()


    fun park(vehicle: Vehicle):Ticket{
        val freeSpot = getFreeSlot() ?: throw ParkingLotFullException
        val ticket = Ticket(freeSpot.getSpotNumber)
    }


}