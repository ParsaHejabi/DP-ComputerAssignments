import java.util.ArrayList;
import java.util.Iterator;

public class Organization extends Unit {
    private Unit fatherUnit;
    private ArrayList<Unit> units;
    private String title;
    private String description;

    public Organization(String title, String description) {
        this.title = title;
        this.description = description;

        units = new ArrayList<>();
    }

    @Override
    public Unit getFatherUnit() {
        return fatherUnit;
    }

    @Override
    public void setFatherUnit(Unit fatherUnit) {
        this.fatherUnit = fatherUnit;
    }

    @Override
    public void add(Unit unit) {
        units.add(unit);
        if (unit instanceof Organization) {
            unit.setFatherUnit(this);
        }
    }

    @Override
    public void remove(Unit unit) {
        units.remove(unit);
    }

    @Override
    public Unit getChild(int index) {
        return units.get(index);
    }

    @Override
    public int getPostCounts() {
        int postCounts = 0;

        Iterator<Unit> iterator = units.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            if (unit instanceof Post) {
                postCounts++;
            }
            else {
                postCounts += unit.getPostCounts();
            }
        }

        return postCounts;
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
    public void print() {
        System.out.println(getTitle() + " ORGANIZATION, " + getDescription());
        System.out.println("Sub Unit of: " + (fatherUnit == null ? "GREAT UNIT" : getFatherUnit().getTitle()));
        System.out.println("Number of posts: " + getPostCounts());
        System.out.println("----------------");
        System.out.println();

        Iterator<Unit> iterator = units.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            unit.print();
        }
    }
}
