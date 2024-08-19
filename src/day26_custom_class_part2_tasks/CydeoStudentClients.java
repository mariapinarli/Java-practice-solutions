package day26_custom_class_part2_tasks;

public class CydeoStudentClients {
    public static void main(String[] args){

        CydeoStudent student1 = new CydeoStudent("Maria", 35, 7,'A', 7,7 );
        System.out.println(student1);

        CydeoStudent student2 = new CydeoStudent("Eda", 45, 140, 'B', 100, 4);
        System.out.println(student2);

        student1.study();
        student2.study();

        student1.attendClass();
        student2.attendClass();

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();






    }
}
