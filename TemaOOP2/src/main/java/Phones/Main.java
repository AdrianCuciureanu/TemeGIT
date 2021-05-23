package Phones;

public class Main {
    public static void main(String[] args) {
        Phone phone = new AppleIPhoneX("black", "541515454");

        phone.addContact(1, "5164161", "Adrian", "Cuciureanu");
        phone.addContact(2, "5446465", "Valentin", "Cuciureanu");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage("545165151", "message content");
        phone.sendMessage("545165151", "al doilea mesaj");
        phone.sendMessage("545165151", "message  asdkjolfnsad jnaskdnf adskj fkjaNBF LKJANDF LKASNDF LKDSAN DSA;KLNS FA;LDSM FLKa kaj sdj hadkjg " +
                "akjdh ljshda fljhad fljha djuv ajkhhv hasd bvkhasde v aavuhb dskujvh akhujdaklh vkah vduhadujjkafvu dvfka sde  vh dakv aksdh kujahs dvyhasd dasv dsa vasd v" +
                "as dvljs bfljdhsa gflhsd fkbjf ;a ljlki ibcontent");
        phone.listMessages("545165151");

        phone.call("516515153");
        phone.call("545165151");
        phone.call("545165152");
        phone.viewHistory();


    }

}
