import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getCgpa() {
        return this.cgpa;
    }

}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        Queue<Student> priorityQueue =  new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID)
        );
        for (int i = 0; i<= events.size()-1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(events.get(i));
            int n = sb.indexOf(" ");
            String action = "";
            if ( n != -1) {
            action = sb.substring(0,sb.indexOf(" "));
            } else {
                action = sb.substring(0);
            }

            switch (action) {
                case "ENTER":
                    sb.delete(0,sb.indexOf(" ")+1);
                    String name = sb.substring(0,sb.indexOf(" "));
                    sb.delete(0,sb.indexOf(" ")+1);
                    double cgpa = Double.parseDouble(sb.substring(0,sb.indexOf(" ")));
                    sb.delete(0,sb.indexOf(" ")+1);
                    int id = Integer.parseInt(sb.substring(0));
                    Student nextStudent = new Student (id,name,cgpa);
                    priorityQueue.add(nextStudent);
                    break;
                case "SERVED":
                    if (!priorityQueue.isEmpty()){
                    priorityQueue.remove();
                    break;}
            }
        }
        int qSize = priorityQueue.size();
        List <Student> stList = new ArrayList<>(qSize);
        while (!priorityQueue.isEmpty()) {
            stList.add(priorityQueue.remove());
        }
        return stList;


    }
}

public class test {
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