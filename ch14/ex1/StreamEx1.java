package ch14.ex1;

import java.util.Comparator;
import java.util.stream.Stream;

class StreamEx1 {
    public static void main(String args[]) {
        Stream<Student> studentStream = Stream.of(
                new Student("lee", 3, 300),
                new Student("kim", 1, 200),
                new Student("ahn", 2, 100),
                new Student("park", 23, 150),
                new Student("so", 1, 200),
                new Student("na", 3, 290),
                new Student("kam", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }


}
