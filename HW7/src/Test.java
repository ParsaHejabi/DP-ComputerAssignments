public class Test {
    public static void main(String[] args) {
        Unit greatUnit = new Organization("Facebook", "Social Network");

        Unit ITUnit = new Organization("IT", "Tech guys");
        Unit financeUnit = new Organization("Finance", "Money business");

        ITUnit.add(new Post("Front-end", "JS developer", 2000));
        ITUnit.add(new Post("Back-end", "PHP developer", 5000));

        Unit ITmobileTeamUnit = new Organization("Mobile", "Mobile team");
        ITmobileTeamUnit.add(new Post("Android", "Android developer", 3000));
        ITmobileTeamUnit.add(new Post("IOS", "IOS developer", 6000));
        ITUnit.add(ITmobileTeamUnit);

        financeUnit.add(new Post("Salary", "Calculate salary", 1000));

        greatUnit.add(ITUnit);
        greatUnit.add(financeUnit);

        Client client = new Client(greatUnit);

        client.print();

        // Will print Finance organization
        greatUnit.getChild(1).print();

        greatUnit.remove(financeUnit);

        client.print();
    }
}
