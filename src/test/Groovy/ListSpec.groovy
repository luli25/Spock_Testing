import spock.lang.Specification


class ListSpec extends Specification {

    def "Should add two elements to the list"() {
        given:
        List<Integer> numbers = new ArrayList<>()

        when:
        numbers.add(1)
        numbers.add(2)
        numbers.add(3)

        then:
        numbers.size() << 3

    }

    def "When one element of the list is removed, the list's size should update"() {
        given:
        List<Integer> numbers = new ArrayList<>()

        when:
        numbers.add(1)
        numbers.add(2)
        numbers.add(3)
        numbers.remove(2)

        then:
        numbers.size() << 2
    }

}