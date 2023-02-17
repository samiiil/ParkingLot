import constants.VEHICLE_HOUR_CHARGE
import entities.Ticket
import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import entities.ParkingReceipt

class ReceiptTest {

    @Test
    fun `it should calculate fee`() {
        val ticket = Ticket(1,1 ,LocalDateTime.of(2023,2,17,4,0,0))
        val receipt = ParkingReceipt(ticket,1,LocalDateTime.of(2023,2,16,10,0,0))
    }

    val expectedfee = VEHICLE_HOUR_CHARGE * 2
    val actualfee = ParkingReceipt.calculateParkingfee

    assertEquals(expectedfee, actualfee)



    }
}