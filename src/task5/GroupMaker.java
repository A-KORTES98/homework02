package task5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by anton on 04.10.17.
 */
public class GroupMaker {

    public static void main(String[] args) {
        Student[] studs = {
                new Student().addSubject(Subject.MATH),
                new Student(Subject.MATH).addSubject(Subject.OOP).addSubject(Subject.PHILOSOPHY),
                new Student(Subject.OOP),
                new Student(Subject.MATH).addSubject(Subject.OPERATINGSYSTEMS),
                new Student(Subject.OOP),
                new Student(Subject.OOP).addSubject(Subject.PHILOSOPHY)
        };

        System.out.println("Dimensiona of OOP student's group: " + makeGroup(Arrays.asList(studs), Subject.OOP).size());
    }

    public static List<Student> makeGroup(List<Student> students, Subject targetSub){
        LinkedList<Student> mathGroup = new LinkedList<>();
        mathGroup.addAll(students.stream().
                filter(x -> x.contain(targetSub)).
                collect((Collectors.toList())));
        return mathGroup;
    }


}
