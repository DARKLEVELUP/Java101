public class UsingOOP {
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.name = "Peter";
        s1.age = 17;
        s1.hobby = "Coding";
        s1.wordToSay = "Hello Josh";
        
        s2.name = "Josh";
        s2.age = 12;
        s2.hobby = "Gaming";
        s2.wordToSay = "Hello Peter";
        
        s1.say();
        s2.say();
    }
}
