import spock.lang.Specification
import OOP.Subscriber
import OOP.Publisher

class PublisherSpec extends Specification {
    Publisher publisher = new Publisher()
    def subscriber1 = Mock(Subscriber)
    def subscriber2 = Mock(Subscriber)

    def setup() {
        publisher.subscribers.add(subscriber1)
        publisher.subscribers.add(subscriber2)
    }

    def "Should send messages to all subscribers"() {
        when:
        publisher.send("Hello")

        then:
          1 * subscriber1.receive("Hello")
          1 * subscriber2.receive("Hello")
    }

}