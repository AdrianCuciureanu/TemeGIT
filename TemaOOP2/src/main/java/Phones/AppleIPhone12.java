package Phones;

import java.util.ArrayList;
import java.util.List;

public class AppleIPhone12 extends Apple {
    private int batteryLife;
    private final String material = "aluminum";
    private String color;
    private String imei;

    private List<Contact> myContacts;
    private List<Message> myMessages;
    private List<Call> myCalls;

    public AppleIPhone12(String color, String imei) {
        this.color = color;
        this.imei = imei;
        batteryLife = 84;
        myContacts = new ArrayList<Contact>();
        myMessages = new ArrayList();
        myCalls = new ArrayList();
    }

    @Override
    public void addContact(int id, String phoneNumber, String firstName, String lastName) {
        if (batteryLife > 0) {
            Contact contact = new Contact(id, phoneNumber, firstName, lastName);
            myContacts.add(contact);
        }
    }

    @Override
    public void listContacts() {
        if (batteryLife > 0) {
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println("Contact: id = " + myContacts.get(i).getId() + ", phone number = " + myContacts.get(i).getPhoneNumber()
                        + ", name = " + myContacts.get(i).getFirstName() + " " + myContacts.get(i).getLastName());
            }
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        if (batteryLife > 0) {
            if (message.length() <= 100) {
                Message sms = new Message(phoneNumber, message);
                myMessages.add(sms);
                batteryLife--;
            } else {
                batteryLife--;
                System.out.println("SMS not send! Message can have maximum 100 characters");
            }
        }
        System.out.println("Remaining battery: " + batteryLife);
    }

    @Override
    public void listMessages(String phoneNumber) {
        if (batteryLife > 0) {
            for (int i = 0; i < myMessages.size(); i++) {
                if (myMessages.get(i).getPhoneNumber() == phoneNumber) {
                    System.out.println(myMessages.get(i).getPhoneNumber() + ": " + myMessages.get(i).getMessage());
                }
            }
        }

    }

    @Override
    public void call(String phoneNumber) {
        if (batteryLife > 1) {
            Call call = new Call(phoneNumber);
            myCalls.add(call);
            batteryLife = batteryLife - 2;
        }
        System.out.println("Remaining battery: " + batteryLife);
    }

    @Override
    public void viewHistory() {
        if (batteryLife > 0) {
            for (int i = 0; i < myCalls.size(); i++) {
                System.out.println(myCalls.get(i).getPhoneNumber() + ": " + myCalls.get(i).getRing());
            }
        }
    }
}
