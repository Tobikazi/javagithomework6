import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.printf("%s %s прокатился на аттракционе, ", person.getName(), person.getSureName());
            int quantityTickets = person.getQuantityTickets();
            if (person.getQuantityTickets() > 0){
                --quantityTickets;
                System.out.printf("%s %s идёт на аттракцион, у него осталось %d билет(а/ов)\n", person.getName(), person.getSureName(), quantityTickets);
            person.setQuantityTickets(quantityTickets);
            queue.add(person);
                System.out.println();
            }
        }
    }
        private static List<Person> generateClients() {
            return List.of(
                    new Person("Иван", "Иванов", 4),
                    new Person("Алексей", "Алексеев", 2),
                    new Person("Игорь", "Угрев", 3),
                    new Person("Уголь", "Угольков", 1)
            );
    }
}
