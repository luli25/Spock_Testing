import OOP.Person
import spock.lang.Specification

class PersonTest extends Specification {
    def "Should return name and age"() {
        given:
        def person = new Person()
        def spiedPerson = Spy(Person)

        when:
        spiedPerson.setName("Matt")
        spiedPerson.setAge(22)

        then:
        spiedPerson.getName() << "Matt"
        spiedPerson.getAge() << 22
    }
}
