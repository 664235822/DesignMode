package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // write your code here

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.hashCode());
    }
}
