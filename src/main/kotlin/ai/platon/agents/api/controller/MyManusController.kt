package ai.platon.agents.api.controller

import ai.platon.agents.agent.plan.PlanningFlow
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/my/agents")
class MyagentsController(private val planningFlow: PlanningFlow) {
    @GetMapping("/chat")
    fun simpleChat(@RequestParam(value = "query", defaultValue = "Greeting~") query: String): String {
        planningFlow.newPlan("plan_" + System.currentTimeMillis())
        return planningFlow.execute(query)
    }
}
