package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private  ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        Integer sum = 0;
        for (Integer singleGrade : grades){
            if(!grades.isEmpty()){
                sum += singleGrade;
            }
        }
        return sum / grades.size();
    }


    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> student1grades = new ArrayList<>();
        Student daemon_rus= new Student("Daemon");
        Student coder_student = new Student("Rob");
        Student jdDillinger = new Student("JD");
        daemon_rus.addGrade(97);
        daemon_rus.addGrade(100);
        daemon_rus.addGrade(82);
        coder_student.addGrade(80);
        coder_student.addGrade(96);
        coder_student.addGrade(100);
        jdDillinger.addGrade(84);
        jdDillinger.addGrade(93);
        jdDillinger.addGrade(100);
//        System.out.println(grades);
//        System.out.println(student1grades);
        System.out.println(daemon_rus.getName() + " " + daemon_rus.getGradeAverage() );
        System.out.println(coder_student.getName() +  " " +  coder_student.getGradeAverage());
        System.out.println(jdDillinger.getName()+  " " + jdDillinger.getGradeAverage());

    }
}