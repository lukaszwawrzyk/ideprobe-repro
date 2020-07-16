package org.virtuslab.ideprobe.repro

import org.virtuslab.ideprobe.IntegrationTestSuite
import org.virtuslab.ideprobe.IntelliJFixture

import scala.language.implicitConversions

class PantsTestSuite extends IntegrationTestSuite with OpenPantsProjectFixture {

  override def transformFixture(fixture: IntelliJFixture): IntelliJFixture = {
    fixture.withAfterWorkspaceSetup(PantsSetup.overridePantsVersion)
  }
}
