// build.sc
import mill._
import mill.scalalib._

object examples extends ScalaModule {
  def scalaVersion = "2.12.4"
  def ivyDeps = Agg(
    ivy"org.typelevel::cats-core:1.0.1",
    ivy"eu.timepit::refined:0.8.7"
  )
}