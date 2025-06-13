package chapter11.InheritanceAndPolymorphism.people;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ali");
        person.setAddress("Riyadh");
        person.setPhoneNumber("0500000000");
        person.setEmail("ali@example.com");

        Student student = new Student();
        student.setName("Sara");
        student.setAddress("Jeddah");
        student.setPhoneNumber("0555555555");
        student.setEmail("sara@example.com");
        student.setCalssStatus(student.SENIOR);

        Employee employee = new Employee();
        employee.setName("Mohammed");
        employee.setAddress("Dammam");
        employee.setPhoneNumber("0533333333");
        employee.setEmail("mohammed@example.com");
        employee.setOffice("Office 101");
        employee.setSalary(8000.0);
        employee.setDateHired();

        Faculty faculty = new Faculty();
        faculty.setName("Dr. Huda");
        faculty.setAddress("Mecca");
        faculty.setPhoneNumber("0544444444");
        faculty.setEmail("huda@example.com");
        faculty.setOffice("Office 201");
        faculty.setSalary(12000.0);
        faculty.setDateHired();
        faculty.setOfficeHours("8am-2pm");
        faculty.setRank("Professor");

        Staff staff = new Staff();
        staff.setName("Nasser");
        staff.setAddress("Tabuk");
        staff.setPhoneNumber("0566666666");
        staff.setEmail("nasser@example.com");
        staff.setOffice("Office 301");
        staff.setSalary(6000.0);
        staff.setDateHired();
        staff.setTitle("IT Administrator");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
