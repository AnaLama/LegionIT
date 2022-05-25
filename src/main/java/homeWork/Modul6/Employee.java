package homeWork.Modul6;

public abstract class Employee {
    private String name;
    private final int id;
    private String title;
    private final String dob;
    private double salary;
    private String address;

    public Employee(String empName, int empId, String empTitle, String empDob, double empSalary, String empAddress) {
        this.name = empName;
        this.id = empId;
        this.title = empTitle;
        this.dob = empDob;
        this.salary = empSalary;
        this.address = empAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDob() {
        return dob;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary() {
        System.out.println(name + " ," + title + ", received " + "$" + salary);
    }

    public String printCard() {
        String txt = String.format("The employee name: %s, title: %s, salary: %f", name, title, salary);
        return txt;
    }

    public void getSalary(String name) {
        System.out.println(name + " gets salary " + getSalary());
    }

}
