public class Name {
    private String first;
    private String last;

    public Name(String firstName, String lastName) {
        this.first =firstName;
        this.last = lastName;
    }
    String informalRepresentation() {
        return first + " " + last;
    }
    String formalRepresentation() {
        return last + ", " + first;
    }
}

