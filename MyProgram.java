import java.util.Scanner;

public class MyProgram {

    public String getUSN(Student s) {
        return s.getUSN();
    }
    public void setUSN(Student s, String usn) {
        s.setUSN(usn);
    }
    public int getSemester(UGStudent s) {
        return s.getSemester();
    }
    public void setSemester(UGStudent s, int sem) {
        s.setSemester(sem);
    }
    public String getBranch(UGStudent s) {
        return s.getBranch();
    }
    public void setBranch(UGStudent s, String branch) {
        s.setBranch(branch);
    }
    public String getSpecialization(PGStudent s) {
        return s.getSpecialization();
    }
    public void setSpecialization(PGStudent s, String sp) {
        s.setSpecialization(sp);
    }
    public String getUGDegree(PGStudent s) {
        return s.getUGDegree();
    }
    public void setUGDegree(PGStudent s, String ugd) {
        s.setUGDegree(ugd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students");
        start : {
            int val = sc.nextInt();
            if(val < 10) {
                System.out.println("Value must be greater than 10");
                break start;
            } else {
                Student[] students = new Student[val];
                for(int i = 1; i <= val; i++) {
                    System.out.println("Enter student USN");
                    String USN = sc.next();
                    System.out.println("Enter student name");
                    String name = sc.next();
                    System.out.println("Enter 1 for normal student, 2 for ug and 3 for pg");
                    int ch = sc.nextInt();
                    switch(ch) {
                        case 1 :
                            students[i] = new Student(USN, name);
                            break;
                        case 2 :
                            System.out.println("Enter semester");
                            int sem = sc.nextInt();
                            System.out.println("Enter branch");
                            String branch = sc.next();
                            students[i] = new UGStudent(USN, name, sem, branch);
                            break;
                        case 3 : 
                            System.out.println("Enter specialization");
                            String s = sc.next();
                            System.out.println("Enter ug degree");
                            String ugd = sc.next();
                            students[i] = new PGStudent(USN, name, s, ugd);
                            break;
                        default : 
                            System.out.println("Wrong choice");
                    }
                }
            }   
            
            MyProgram obj = new MyProgram();
            
            /*
             * Perform any operations as per your wish
             * Here is an example :
             * obj.getUSN(student[2]);
             * OR
             * obj.setBranch(student[7],"Information Science and Engineering")
             */

        }
        sc.close();
    }

}
