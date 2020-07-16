package org.virtuslab.ideprobe.repro

import scala.io.StdIn

object TrailingCommas extends PantsTestSuite {

  def main(args: Array[String]): Unit = {
    fixtureFromConfig().run { intelliJ =>
      openProjectWithBsp(intelliJ)
      StdIn.readLine("\n\n>>> Hit enter to close IntelliJ and cleanup <<<\n\n")
    }
  }

}
