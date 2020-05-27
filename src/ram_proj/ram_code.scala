package ram_proj
import org.apache.spark.sql.SparkSession
object ram_code {
  def main(args: Array[String]): Unit =
    {
      val spark = SparkSession.builder().master("local").appName("DataFrame").getOrCreate()
      val dff = spark.read.csv("C:/Birendra/Scala_Spark_src/test.csv")
      dff.show()
      val df = spark.read.format("csv").option("header", "true").load("C:/Birendra/Scala_Spark_src/test.csv")
      df.show()
      df.select("Nmae", "Age").show()
    }
}