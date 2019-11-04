public class Contact {
    // instance fields
    private String name;
    private String number;

    //constructor
    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String result = String.format(": <" + name + "> (" + number + ")");
        return result;
    }
}
