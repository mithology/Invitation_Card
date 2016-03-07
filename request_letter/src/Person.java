public class Person {
    private Name name;

    private int age;

    private Address address;

    private Gender gender;

    public Person( Name name,Gender gender, int age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    private String invitationCreater(String fullname) {
        String invitationTemplate = "title fullname, country";
        return invitationTemplate
                .replace("title", gender.getTitle())
                .replace("fullname", fullname)
                .replace("country", address.getCountry());
    }

    public String informallyInvited() {
        return invitationCreater(name.informalRepresentation());
    }

    public String formallyInvited() {
        System.out.println(gender);
        return invitationCreater(name.formalRepresentation());
    }
}
