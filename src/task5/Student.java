package task5;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 04.10.17.
 */
public class Student {

    List<Subject> subjects;

    Student(){
        subjects = new LinkedList<>();
    }

    Student(Subject sub){
        this();
        subjects.add(sub);
    }

    Student(List<Subject> subList){
        subjects = subList;
    }

    public Student addSubject(Subject sub){
        if (subjects == null){
            subjects = new LinkedList<>();
        }
        subjects.add(sub);
        return this;
    }

    public boolean contain(Subject sub){
        return subjects == null
                ? false
                : subjects.contains(sub)
                    ? true
                    : false;
    }
}
