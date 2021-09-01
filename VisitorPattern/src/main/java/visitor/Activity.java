package visitor;

public interface Activity {
    int accept(Visitor visitor);
}