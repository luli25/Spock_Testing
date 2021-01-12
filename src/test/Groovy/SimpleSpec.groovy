import spock.lang.Specification


class SimpleSpec extends Specification {
    def "Check case-insensitive equality between two strings"() {
        given:
        String s1 = "hello"
        String s2 = "HELLO"
        
        when:
        s1 = s1.toLowerCase()
        s2 = s2.toLowerCase()

        then:
        s1 == s2
    }

    def "Check addition of two numbers"() {
        given:
        int num1 = 10
        int num2 = 30

        when:
        int result = num1 + num2

        then:
        result == 40
    }

}