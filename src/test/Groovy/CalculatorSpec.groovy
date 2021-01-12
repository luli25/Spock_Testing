import spock.lang.Specification
import Calculator.Calculator
import spock.lang.Unroll


class CalculatorSpec extends Specification {
    Calculator calculator = new Calculator()

    @Unroll
    def "Check addition between two numbers"() {
        when:
        def result = calculator.Addition(50, 10)

        then:
        result << 60
    }

    @Unroll
    def "Check subtraction between two numbers"() {
        when:
        def result = calculator.Substract(8, 7)

        then:
        result << 1
    }

    @Unroll
    def "Check multiplication between two numbers"() {
        when:
        def result = calculator.Multiply(20, 8)

        then:
        result << 160
    }

    @Unroll
    def "Check division between two numbers"() {
        when:
        def result = calculator.Divide(100, 5)

        then:
        result << 20
    }

}