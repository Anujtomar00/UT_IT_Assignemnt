package com.knoldus.db

import com.knoldus.models.User
import scala.collection.immutable.HashMap

class UserReadDto {
  val anujEmployee: User = User("Anuj","Tomar",21,600000,"Software Engineer","Knoldus","anuj.tomar@knoldus.com")
  val rahulEmployee: User = User("Rahul","Sharma",26,500000,"Software Engineer","HCL","rahul.sharma@hcl.com")

  val users: HashMap[String,User] = HashMap("Anuj"-> anujEmployee,"Rahul"-> rahulEmployee)

  def getUserByName(name: String): Option[User] = users.get(name)


}
