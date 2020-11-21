import java.time.{LocalDate, MonthDay, Period}

case class Friend(name: String, birthDayDate: String, birthDayMessage: String, greetingsFrom: String) {

  def getAge = {
    Period.between(
      LocalDate.parse(birthDayDate),
      LocalDate.now()
    ).getYears()
  }

  def isFriendBirthday = {
    val dateOfBirth = LocalDate.parse(birthDayDate)
    val recurringBirthDay = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth())
    val currentMonthDay = MonthDay.from(LocalDate.now())
    currentMonthDay.equals(recurringBirthDay)
  }

  def wishHappyBirthday = {
    s"Dear $name, $birthDayMessage $greetingsFrom!"
  }
}
