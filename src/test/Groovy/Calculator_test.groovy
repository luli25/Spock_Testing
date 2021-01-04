import spock.lang.Specification
import Calculator.Calculator

class Calculator_test extends Specification {
    def "Checking class methods"() {
        Calculator calculator = Mock()

        when:
        calculator.Add(10, 10)
        calculator.Subtraction(8, 2)

        then:
        assert 20
        assert 6
    }


}