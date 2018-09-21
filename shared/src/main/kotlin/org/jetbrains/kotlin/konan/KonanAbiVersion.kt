package org.jetbrains.kotlin.konan

fun String.parseKonanAbiVersion(): KonanAbiVersion {
    return KonanAbiVersion(this.toInt())
}

data class KonanAbiVersion(val version: Int) {
    companion object {
        val CURRENT = KonanAbiVersion(1)
    }
    override fun toString() = "$version"
}