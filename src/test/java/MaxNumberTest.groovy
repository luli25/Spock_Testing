import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MaxNumberTest extends Specification {
    def "Maximum of two numbers"(int a, int b, int c) {
        expect:
        Math.max(a, b) == c

        where:
        a  | b  || c
        1  | 3  || 3
        7  | 5  || 7
        10 | 5  || 10
        -5 | -2 || -2


    }
}
