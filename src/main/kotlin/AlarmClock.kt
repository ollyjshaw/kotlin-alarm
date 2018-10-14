class AlarmClock {
    fun readTime(timeIn: String): String {
        val time = Time.fromTime(timeIn)
        return if (time.mins == 0 && time.hours == 7) "wake up"
        else if (time.mins == 0) "beep"
        else "tick"
    }
}

data class Time(val hours: Int, val mins: Int) {
    companion object {
        fun fromTime(time: String): Time {
            val hours: Int = time.substring(0..1).toInt()
            val mins: Int = time.substring(3..4).toInt()
            return Time(hours, mins)
        }
    }
}
