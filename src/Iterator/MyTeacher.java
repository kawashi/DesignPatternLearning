package Iterator;

public class MyTeacher extends Teacher{
    StudentList studentList;

    @Override
    public void createStudentList() {
        studentList = new StudentList(5);
        studentList.add(new Student("赤井亮太", Sex.MEN));
        studentList.add(new Student("赤羽里見", Sex.WOMEN));
        studentList.add(new Student("岡田未央", Sex.WOMEN));
        studentList.add(new Student("西森俊介", Sex.MEN));
        studentList.add(new Student("中の森玲奈", Sex.WOMEN));
    }

    @Override
    public void callStudents() {
        for( int i=0 ; i < studentList.getLastNum() ; i++ ) {
            System.out.println(studentList.getStudentAt(i).getName());
        }
    }
}
