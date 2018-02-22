package lesson8.studentsExampl;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(createHighestParent().firstName + " " + createHighestParent().lastName + " " +
                createHighestParent().group + " " + Arrays.toString(createHighestParent().coursesTaken));
        System.out.println(createLowestChild().firstName + " " + createLowestChild().lastName + " " +
                createLowestChild().group + " " + createLowestChild().coursesTaken + " " +
                createLowestChild().secretKey + " " + createLowestChild().email);
    }

    static Student createHighestParent() {

        Course course1 = new Course(new Date(20171411), "Java Core", 500, "Mudrevskyi",
                new Student[1]);


        Course[] courseArr = {course1};

        Student student = new Student("Ivan", "Ivanov", 3, courseArr);

        return student;
    }

    static SpecialStudent createLowestChild() {
        SpecialStudent sStudent = new SpecialStudent("Petr", "Petrov", 5, new Course[1],
                123456789, "bova_82@mail.ru");
        return sStudent;
    }
}