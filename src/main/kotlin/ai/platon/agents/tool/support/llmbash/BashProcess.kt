
package ai.platon.agents.tool.support.llmbash

import ai.platon.agents.tool.support.CodeExecutor

object BashProcess {

    fun executeCommand(commandList: List<String>, workingDirectory: String?): List<String?> {
        return commandList.map { commandLine ->
            CodeExecutor.execute(commandLine, "bash", workingDirectory)
            null
        }
    }
}
