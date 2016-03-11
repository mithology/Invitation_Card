public class Person {
    private Name name;

    private static String age;

    private Address address;

    private String gender;

    public Person(Name name, String gender, String age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public  String represent(String option) {
        return address.addCountryName(name.informalRepresentation()+ age);
    }
    public static boolean isAbleToConsumeAlcohol(int legalAge){
        return  Integer.parseInt(age) >= legalAge;
    }

}
