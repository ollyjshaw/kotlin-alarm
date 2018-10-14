import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AlarmTest {
    @Test
    fun test_ticks_every_hour(){
        val clock = AlarmClock()
        val sound = clock.readTime("07:21")
        assertEquals("tick", sound)
    }

    @Test
    fun test_beeps_every_hour(){
        val clock = AlarmClock()
        val sound = clock.readTime("09:00")
        assertEquals("beep", sound)
    }

    @Test
    fun test_wakes_up_at_seven(){
        val clock = AlarmClock()
        val sound = clock.readTime("07:00")
        assertEquals("wake up", sound)
    }
}

