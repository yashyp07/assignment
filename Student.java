public class Student{
    String USN;
    String name;
    
    Student(String USN, String name) {
        this.USN = USN;
        this.name = name;
    }

    public String getUSN() {
        return this.USN;
    }

    public void setUSN(String USN) {
        this.USN = USN;
        System.out.println("USN has been set");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name has been set");
    }
}
