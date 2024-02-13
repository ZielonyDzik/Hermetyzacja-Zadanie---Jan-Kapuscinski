public class Main {
    public static void main(String[] args) {


        Client client1 = new Client("John", "Cubbageson", 18, 'J', "Millenium", 150, "Yes", "Normal");
        Client client2 = new Client("Mathew", "Birch", 18, 'M', "PKO", 2137, "Yes", "Normal");
        Client client3 = new Client("Michael", "Faryn", 18, 'M', "MBank", 0, "Yes", "Normal");

        client1.getClientInfo();
        client2.getClientInfo();
        client3.getClientInfo();

        Employee emp1 = new Employee("Mike", "Kowalski", 45, 'M', "Millenium", 28122, "Yes", 123456789);
        Employee emp2 = new Employee("Bart", "Johnson", 24, 'b', "PKO", 213227, "Yes", 234567891);
        Employee emp3 = new Employee("Michael", "De Santa", 56, 'M', "MBank", 2456722, "Yes", 345678912);

        emp1.getEmployeeInfo();
        emp2.getEmployeeInfo();
        emp3.getEmployeeInfo();

        Music music1 = new Music("Houdini", "Dua Lipa", 3.42, "Mondays", "12, 14, 19", "POP / Radio", 12, 100);
        Music music2 = new Music("Hollywood Hills", "Sunrise Avenue", 3.31, "Wednesday, Saturday, Sunday", "12, 14, 19, 21, 23", "Rock / Radio", 10, 98);
        Music music3 = new Music("Forest Gump", "Vixen", 3.07, "Tuesday", "14", "POP/Funk", 2, 112);

        music1.getMusicInfo();
        music2.getMusicInfo();
        music3.getMusicInfo();
    }
}