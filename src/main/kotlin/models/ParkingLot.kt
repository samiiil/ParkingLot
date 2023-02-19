package models

import constants.MAX_CAPACITY
import exceptions.InvalidSpotExceptions
import exceptions.SpotIsOccupiedException
class ParkingLot {

    private val spots: MutableList<ParkingSpot?> = MutableList(MAX_CAPACITY + 1) { null }

    fun getSpot(spotNumber: Int): ParkingSpot? {
        if (spotNumber > MAX_CAPACITY || spotNumber <= 0)
            throw InvalidSpotExceptions()
        if (spots[spotNumber] == null)
            spots[spotNumber] = ParkingSpot(spotNumber)
        return spots[spotNumber]
}

