package Phones;

public class Call {
    private String phoneNumber;
    private final String ring = "Ring-Ring!";

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRing() {
        return ring;
    }
}
