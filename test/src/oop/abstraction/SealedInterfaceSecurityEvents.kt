package oop.abstraction

// Sealed interface for security events
sealed interface SecurityEvent

// Implementors (must be in the same module/file)
class PatchApplied(val version: String) : SecurityEvent
class DeviceLocked(val reason: String) : SecurityEvent
class DeviceBreached(val threatLevel: Int) : SecurityEvent

// Function handling events with exhaustion when
fun handleEvent(event: SecurityEvent) {
    when(event) {
        is PatchApplied -> println("Path ${event.version} applied successfully")
        is DeviceLocked -> println("Device locked due to: ${event.reason}.")
        is DeviceBreached -> println("Security breached detected: Threat level: ${event.threatLevel}")
        // No one else needed - the compiler knows all cases are covered
    }
}

fun main() {
    val events: List<SecurityEvent> = listOf(
        PatchApplied("01-26-2026"),
        DeviceLocked("User inactivity"),
        DeviceBreached(5)
    )

    for (e in events){
        handleEvent(e)
    }
}