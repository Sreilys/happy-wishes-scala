object HappyWishesApp extends App {
  val friendsList = List(Friend("Amelia", "1990-11-21", "I wish you all the best for this special day! Happy Birthday!", "Sabrina"))
  for (friend <- friendsList) {
    println(friend.name, friend.getAge)
    if(friend.isFriendBirthday) println(friend.wishHappyBirthday)
  }
}
