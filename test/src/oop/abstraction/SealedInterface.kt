package oop.abstraction

// Sealed interface
sealed interface DevicState

// Implementers (must be in same file/module)
class Locked: DevicState
class UnLocked: DevicState
class Secured(val patchVersion: String) : DevicState

// Function using exhaustive when
fun handleState(state: DevicState) {
    when(state){
        is Locked -> println("Device is locked!")
        is UnLocked -> println("Device is unlocked")
        is Secured -> println("Device secured with patch ${state.patchVersion}.")
        // No one else needed - the compiler knows all cases are covered
    }
}

fun main() {
    val state: List<DevicState> = listOf(
        Locked(),
        UnLocked(),
        Secured("01-26-2026")
    )

    for (s in state) {
        handleState(s)
    }
}