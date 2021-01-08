import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CompareStrings extends Specification {
    def "Equals method on two strings should return true"() {
        given:
        String s1 = "Hello world"
        String s2 = "Hello world"

        when:
        def result = s1.equals(s2)

        then:
        result == true
    }

    def "Equals method on two strings should return false"() {
        given:
        String s3 = "I'm a string"
        String s4 = "I'm a string too"

        when:
        def result = s3.equals(s4)

        then:
        result == false
    }

}