/*Write a code to build a student management system that stores marks of 5 students ,
Calculate total & average . Use Collections.*/

import java.util.*;
class Student{
    String name;
    Collection<Integer> marks;

    public Student(String name, Collection<Integer> marks){
        this.name = name;
        this.marks = marks;
    }

    public int getTotalMarks(){
        int total = 0;
        for(int mark: marks){
            total += mark;
        }
        return total;
    }

    public double getAvgMarks(){
        int total = getTotalMarks();
        int count = 0;
        for(int mark: marks){
            count++;
        }
        return count==0 ? 0 : (double)total/count;
    }
}

public class Collections {
    public static void main(String[] args){
        Collection<Student> s = new ArrayList<>();

        s.add(new Student("Karthik", Arrays.asList(85,90,95)));
        s.add(new Student("Anita", Arrays.asList(88,91,92)));
        s.add(new Student("Keerthi", Arrays.asList(90,92,93)));
        s.add(new Student("Kiran", Arrays.asList(89,95,92)));
        s.add(new Student("Pavan", Arrays.asList(100,99,99)));

        System.out.println("\nStudent Records: ");
        for(Student K:s){
            System.out.println("Name: "+K.name);
            System.out.println("Total Marks: "+K.getTotalMarks());
            System.out.println("Averge Marks: "+Math.round(K.getAvgMarks()));
        }
    }
}
