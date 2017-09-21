package Iterator;

public class MyTeacher extends Teacher{
    MyStudentList studentList;

    @Override
    public void createStudentList() {
        studentList = new MyStudentList(5);
        studentList.add(new Student("赤井亮太", Sex.MEN));
        studentList.add(new Student("赤羽里見", Sex.WOMEN));
        studentList.add(new Student("岡田未央", Sex.WOMEN));
        studentList.add(new Student("西森俊介", Sex.MEN));
        studentList.add(new Student("中の森玲奈", Sex.WOMEN));
    }

    @Override
    public void callStudents() {
        Iterator itr = studentList.iterator();

        while(itr.hasNext()) {
            System.out.println(((Student)itr.next()).getName());
        }
    }
}
