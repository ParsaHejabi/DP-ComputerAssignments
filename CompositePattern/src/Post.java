public class Post extends Unit {
    private String title;
    private String description;
    private int salary;

    public Post(String title, String description, int salary) {
        this.title = title;
        this.description = description;
        this.salary = salary;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("-- " + getTitle() + " POST, " + getDescription());
        System.out.println("Salary: " + getSalary());
        System.out.println();
    }
}
