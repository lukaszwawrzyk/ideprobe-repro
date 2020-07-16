package org.virtuslab.ideprobe.repro

import org.virtuslab.ideprobe.RunningIntelliJFixture
import org.virtuslab.ideprobe.protocol.ProjectRef

trait OpenPantsProjectFixture extends PantsFixture with BspFixture {

  def openProjectWithBsp(intelliJ: RunningIntelliJFixture): ProjectRef = {
    val projectPath = runFastpassCreate(intelliJ.config, intelliJ.workspace, targetsFromConfig(intelliJ))
    intelliJ.probe.openProject(projectPath)
  }

  def openProjectWithPants(intelliJ: RunningIntelliJFixture): ProjectRef = {
    val projectPath = runPantsIdeaPlugin(intelliJ.workspace, targetsFromConfig(intelliJ))
    intelliJ.probe.openProject(projectPath)
  }

  private def targetsFromConfig(intelliJ: RunningIntelliJFixture): Seq[String] =  {
    intelliJ.config[Seq[String]]("targetSpecs")
  }
}
