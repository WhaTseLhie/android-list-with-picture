package pardillo.john.jv.listwithpicture;

public class Person {

    private int personImage;
    private String personName, personNumber;

    public Person(int personImage, String personName, String personNumber) {
        this.personImage = personImage;
        this.personName = personName;
        this.personNumber = personNumber;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }
}