package com.knoldus.db

import com.knoldus.models.Company
import scala.collection.immutable.HashMap

class CompanyReadDto {
  val knoldusCompany: Company= Company("knoldus","knoldus@gmail.com","Noida")
  val hclCompany: Company= Company("HCL","hcl@gmail.com","Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus"-> knoldusCompany, "HCL"-> hclCompany )

  def getCompanyByName(name: String): Option[Company] = companies.get(name)


}
