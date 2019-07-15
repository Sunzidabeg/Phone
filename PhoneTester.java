package phonejava;


public class PhoneTester {
    
        public static void main(String[] args) {
        Galaxy S9 = new Galaxy("S9", 63, "Verizon", "Ring Ring Ring!");
        IPhone x = new IPhone("X", 100, "T-Mobile", "Ring");

        S9.displayInfo();
        System.out.println(S9.ring());
        System.out.println(S9.unlock());

        x.displayInfo();
        System.out.println(x.ring());
        System.out.println(x.unlock());
    }
}


    
    
    
    
    
    
    

