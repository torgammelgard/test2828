package se.torgammelgard

import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun whenAdding1and2_thenAnswerIs3() {
        (calculator.add(1, 2) == 3)
    }

    @Test
    fun whenSubtracting2from3_thenAnswerIs1() {
        assert(calculator.subtract(3, 2) == 1)
    }
}