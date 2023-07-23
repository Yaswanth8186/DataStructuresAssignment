//Question 10: Java Priority Queue
//Description: Solve the HackerRank Problem given as a link below

//HackerRank

//Sample Input 
//12
//ENTER John 3.75 50
//ENTER Mark 3.8 24
//ENTER Shafaet 3.7 35
//SERVED
//SERVED
//ENTER Samiha 3.85 36
//SERVED
//ENTER Ashley 3.9 42
//ENTER Maria 3.6 46
//ENTER Anik 3.95 49
//ENTER Dan 3.95 50
//SERVED

//Sample Output
//Dan
//Ashley
//Shafaet
//Maria

//java program

import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;
    Student( String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa =  cgpa;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getCGPA() {
        return this.cgpa;
    }
    public int compareTo(Student s) {
        if(cgpa == s.getCGPA()) {
            if(name.compareTo(s.getName()) == 0) {
                if(id == s.getId())
                    return 0;
                else if(id > s.getId())
                    return 1;
                else
                    return -1;
            }else{
                return name.compareTo(s.getName());
            }
        }else if(cgpa > s.getCGPA())
            return -1;
        else
            return 1;
    }
}
class Priorities{
    public ArrayList<Student> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        for(String i:events)
        {
            String[] s = new String[4];
            s = i.split(" ");
            if(s.length>1) {
                pq.add(new Student(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));
            }else {
                pq.poll();
            }
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Student>(pq);
    }
}
public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();  
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }        
        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
