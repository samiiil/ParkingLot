import constants.VEHICLE_HOUR_FEE
import entities.ParkingReceipt
import entities.Ticket
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class ReceiptTest {

    @Test
    fun `it should calculate charge`() {
        val ticket = Ticket(1, 1, LocalDateTime.of(2023, 2, 14, 8, 0, 0))
        val receipt = ParkingReceipt(ticket, 1, LocalDateTime.of(2023, 2, 14, 10, 0, 0))

        val expectedCharge = VEHICLE_HOUR_FEE * 2
        val actualCharge = receipt.calculateParkingfee()

        assertEquals(expectedCharge, actualCharge)


    }
}