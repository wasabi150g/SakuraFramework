package windows.events.keyboards

import events.Event

sealed class KeyboardEvent(val status: KeyboardStatus, val key: Key, val mods: Int) : Event<Key, Unit> {
    override fun isMatched(condition: Key): Boolean {
        return condition == key
    }

    class Pressed(key: Key, mods: Int) : KeyboardEvent(KeyboardStatus.KEY_PRESSED, key, mods)

    class Released(key: Key, mods: Int) : KeyboardEvent(KeyboardStatus.KEY_RELEASED, key, mods)

    class Repeated(key: Key, mods: Int) : KeyboardEvent(KeyboardStatus.KEY_REPEATED, key, mods)
}