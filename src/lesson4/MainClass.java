package lesson4;

public class MainClass {
    public static void main(String[] args) {
        PhoneClass phoneClass = new PhoneClass();
        phoneClass.add("+79001112222","Oleg");
        phoneClass.add("+79001113333","Tanya");
        phoneClass.add("+79001114444","Olga");
        phoneClass.add("+79001115555","Anton");
        phoneClass.add("+79001116666","Anya");
        phoneClass.add("+79001117777","Vika");
        phoneClass.add("+79001112222","Tanya");

        System.out.println(phoneClass.getPhoneByFIO("Tanya"));
        System.out.println(phoneClass.getPhoneByFIO("Olga"));
    }
}
