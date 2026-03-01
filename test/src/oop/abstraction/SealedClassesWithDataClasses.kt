package oop.abstraction

// Sealed class hierarchy with data classes
sealed class SecurityEventV2 {
    data class PatchApplied(val version: String) : SecurityEventV2()
    data class DeviceLocked(val reason: String) : SecurityEventV2()
    data class DeviceBreached(val threatLevel: Int) : SecurityEventV2()
}

// Exhaustive when expression
fun handleEvent(event: SecurityEventV2) {
    when(event) {
        is SecurityEventV2.PatchApplied -> println("Patch: ${event.version} applied successfully.")
        is SecurityEventV2.DeviceLocked -> println("Device locked due to: ${event.reason}")
        is SecurityEventV2.DeviceBreached -> println("Security breach detected! Threat level: ${event.threatLevel}.")
    }
}

fun main() {
    val events: List<SecurityEventV2> = listOf(
        SecurityEventV2.PatchApplied("2.3.5"),
        SecurityEventV2.DeviceLocked("User Inactivity"),
        SecurityEventV2.DeviceBreached(5)
    )

    for (e in events) {
        handleEvent(e)
    }
}