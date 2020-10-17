public class Main {

    public static void main(String[] args) {
	Dog dog1 = new Dog ();
	Dog dog2 = new Dog ("Rex", "Ovcharka", Colors.BLACK, new Shelter("chulan", "dom"), dog1.getCommands());
	Dog dog3 = new Dog("Baks", "Alabay", Colors.WHITE, new Shelter("konura","dvor"));

        System.out.println("Все псы: " + "\n1: " + dog1 + "\n2: " + dog2 + "\n3: " + dog3);

    }
}
