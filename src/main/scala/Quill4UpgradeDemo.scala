object Quill4UpgradeDemo {

  import io.getquill.{idiom => _, _}
  import io.getquill.doobie.DoobieContext

  val dc = new DoobieContext.Postgres(Literal) // Literal naming scheme
  import dc.{SqlInfixInterpolator => _, _} // Quill's `sql` interpolator conflicts with doobie so don't import it
  //import dc.compat._ // Import the qsql interpolator instead

  case class Country(code: String, name: String, population: Int)

  private def getCountryQuery() =
    quote {
      query[Country].filter(_.code == "GBR")
    }

  def getUKCountry() =
    run(getCountryQuery())

}
