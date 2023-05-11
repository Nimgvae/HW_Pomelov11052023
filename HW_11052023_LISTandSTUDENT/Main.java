package HW_11052023_LISTandSTUDENT;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task1
//        MyList<Student> studentMyList= new MyList<>();
//        studentMyList.add(new Student("Eugen","Korschun", (short) 1,2.2));
//        studentMyList.add(new Student("Eugen","Korschun", (short) 1,2.2));
//        studentMyList.add(new Student("Natalie","Romanko", (short) 3,1.2));
//        studentMyList.add(new Student("Stas","Stalin", (short) 4,1.0));
//        studentMyList.add(new Student("Vova","Lennin", (short) 5,1.0));
//        studentMyList.add(new Student("Inna","Weber", (short) 2,3.2));
//        studentMyList.add(new Student("Olga","Schtirlitz", (short) 1,4.2));
//        System.out.println(studentMyList.toString());
//        studentMyList.remove(0);
//        System.out.println(studentMyList.toString());

        //Task2
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Vasja","Korschun", (short) 1,2.2));
        studentList.add(new Student("Eugen","Korschun", (short) 2,2.2));
        studentList.add(new Student("Natalie","Romanko", (short) 3,1.2));
        studentList.add(new Student("Stas","Stalin", (short) 4,1.0));
        studentList.add(new Student("Vova","Lennin", (short) 5,1.0));
        studentList.add(new Student("Inna","Weber", (short) 2,3.2));
        studentList.add(new Student("Olga","Schtirlitz", (short) 1,4.2));
        System.out.println(studentList.toString());
        //удаляем Васю
        removeStudentsByName(studentList, "Vasja");
        System.out.println(studentList.toString());
        //Удаляем всех ниже 3 Курса
        removeStudentlessThanThree(studentList);
        System.out.println(studentList.toString());



    }

    public static void removeStudentlessThanThree(List<Student> list){
        Iterator<Student> iterStudent = list.iterator();

        while (iterStudent.hasNext()){
            Student student = iterStudent.next();
            if(student.getYear()<3){
                iterStudent.remove();
            }
        }
    }
    public static void removeStudentsByName(List<Student> students, String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(name)) {
                iterator.remove();
            }
        }
    }




}
