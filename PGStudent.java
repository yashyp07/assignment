public class PGStudent extends Student{
    String specialization;
    String UGDegree;

    PGStudent(String USN, String name, String specialization, String UGDegree) {
        super(USN, name);
        this.specialization = specialization;
        this.UGDegree = UGDegree;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
        System.out.println("Set new specialization");
    }

    public String getUGDegree() {
        return this.UGDegree;
    }

    public void setUGDegree(String UGDegree) {
        this.UGDegree = UGDegree;
        System.out.println("Set new UG Degree");
    } 
}
