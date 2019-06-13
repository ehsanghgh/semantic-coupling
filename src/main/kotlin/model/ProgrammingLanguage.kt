package com.github.loehnertz.semanticcoupling.model


enum class ProgrammingLanguage {
    JAVA;

    companion object {
        fun getProgrammingLanguageByName(name: String): ProgrammingLanguage = valueOf(name.toUpperCase())
    }
}
