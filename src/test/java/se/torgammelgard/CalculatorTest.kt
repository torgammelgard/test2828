package se.torgammelgard

import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun whenAdding1and2_thenAnswerIs3() {
        (calculator.add(1, 2) == 3)
    }
}