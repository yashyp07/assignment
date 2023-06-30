public class UGStudent extends Student{
    int semester;
    String branch;
    UGStudent(String USN, String name, int semester, String branch) {
        super(USN, name);
        this.semester = semester;
        this.branch = branch;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
        System.out.println("New semester set");
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
        System.out.println("Branch has been set");
    }

}
