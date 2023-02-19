import exceptions.InvalidSpotExceptions
import exceptions.SpotIsOccupiedException
import models.ParkingLot
import entities.Ticket
import entities.Vehicle
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import services.ParkingServices


class ParkingServiceTest {
    @Test
    fun `the vehicle should park`() {
        val ticket = ParkingServices().park(Vehicle.CAR)

        assertEquals(1, ticket.getTicketNumber())
        assertEquals(1, ticket.getParkingSpotNumber())

    }
}