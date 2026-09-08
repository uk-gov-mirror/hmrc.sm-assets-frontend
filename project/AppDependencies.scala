import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt._

object AppDependencies {
  val bootstrapPlayVersion = "9.19.0"

  val compile = Seq(
    caffeine,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-30" % bootstrapPlayVersion,
    "uk.gov.hmrc" %% "play-frontend-hmrc-play-30" % "13.12.0"
  )

  val test = Seq(
    "uk.gov.hmrc" %% "bootstrap-test-play-30"     % bootstrapPlayVersion % Test
  )

  val it = Seq.empty
}
