package ai.platon.agents.tool

import ai.platon.agents.tool.support.ToolExecuteResult
import java.util.function.Function

interface Tool : Function<Any, ToolExecuteResult>, AutoCloseable
