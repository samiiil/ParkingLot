import exceptions.InvalidSpotExceptions
import exceptions.SpotIsOccupiedException
import models.ParkingLot
import entities.Ticket
import entities.Vehicle
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import services.ParkingServices
import entities.ParkingReceipt


class ParkingServiceTest {
    @Test
    fun `the vehicle should park`() {
        val ticket = ParkingServices().park(Vehicle.CAR)

        assertEquals(1, ticket.getTicketNumber())
        assertEquals(1, ticket.getParkingSpotNumber())

    }

    @Test
    fun `the vehicle should unpark`() {
        val parkingService = ParkingServices()
        val ticket = parkingService.park(Vehicle.CAR)

        val ParkingReceipt = parkingService.unpark(ticket)

        assertEquals(1, ParkingReceipt.getReceiptnumber())


    }

    @Test
    fun `throw exception if spot is occupied`() {
        val parkingLot = ParkingLot()
        parkingLot.park(Vehicle.CAR, 1)

        assertThrows(SpotIsOccupiedException::class.java) {
            parkingLot.park(Vehicle.CAR, 1)
        }
    }
}
