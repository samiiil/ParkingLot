package services

import entities.Ticket
import entities.Vehicle
import exceptions.ParkingLotFullException
import constants.MAX_CAPACITY
import entities.ParkingReceipt
import models.ParkingLot
import models.ParkingSpot

var ticketNumber = 1
var receiptNumber = 1

class ParkingServices {

    private val parkingLot: ParkingLot = ParkingLot()


    fun park(vehicle: Vehicle): Ticket {
        val freeSpot = getFreeSlot() ?: throw ParkingLotFullException()
        val ticket = Ticket(freeSpot.getspotNumber(), ticketNumber++)
        parkingLot.park(vehicle, freeSpot.getspotNumber())
        return ticket
    }

    fun unpark(ticket: Ticket): ParkingReceipt {
        parkingLot.freeSpot(ticket.getParkingSpotNumber())
        return ParkingReceipt(ticket, receiptNumber++).generateReceipt()
    }


    private fun getFreeSlot(): ParkingSpot? {
        for (spotNumber in 1..MAX_CAPACITY) {
            val spot = parkingLot.getSpot(spotNumber)!!
            if (spot.getparkedVehicle() == null)
                return spot
        }
        return null
    }


}