package day21_arrays_tasks;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {


        /*
        String[] names = {"Anna","Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < names.length; i++ ){

            int score = scores[i];
            char grade = 'F';

            if( score >= 90){
                grade = 'A';
            } else if ( score >= 80) {
                grade = 'B';
            } else if ( score >= 75) {
                grade = 'C';
            } else if ( score >= 60) {
                grade = 'D';
            }

            grades[i] =  grade;

            System.out.println(names[i] + "'s score is " + score + " , and grade is " + grade);


        }

         */

        /*
        String[] students = {"student1", "student2", "student3"};
        int[] score = {90, 90, 0};
        String[] grade = new String[score.length];

        int gradeIndex = 0;

        for (int each : score) {
            if (each <= 100 && each >= 90) {
                grade[gradeIndex] = "A";
            } else if (each < 90 && each >= 80) {
                grade[gradeIndex] = "B";
            } else if (each < 80 && each >= 70) {
                grade[gradeIndex] = "C";
            } else if (each < 70 && each >= 60) {
                grade[gradeIndex] = "D";
            } else if (each < 60 && each >= 0) {
                grade[gradeIndex] = "F";
            }
            gradeIndex++;
        }


        System.out.println("grade: " + Arrays.toString(grade));

         */

        String[] students = {"student1", "student2", "student3"};
        int[] score = {90, 90, 0};
        String[] grade = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            if (score[i] <= 100 && score[i] >= 90) {
                grade[i] = "A";
            } else if (score[i] < 90 && score[i] >= 80) {
                grade[i] = "B";
            } else if (score[i] < 80 && score[i] >= 70) {
                grade[i] = "C";
            } else if (score[i] < 70 && score[i] >= 60) {
                grade[i] = "D";
            } else if (score[i] < 60 && score[i] >= 0) {
                grade[i] = "F";
            }
        }

        System.out.println("grade: " + Arrays.toString(grade));



    }
}

/*
4. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

    4.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */