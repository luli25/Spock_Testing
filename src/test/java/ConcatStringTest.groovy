import spock.lang.Specification

class ConcatStringTest extends Specification {
    def "Name and surname should be printed together"() {
        given:
        def name = "Joe"
        def surname = "Ramirez"
        def fullName = name + " " + surname

        expect:
        fullName == "Joe Ramirez"
    }
}
