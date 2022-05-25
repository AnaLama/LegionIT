package homeWork.Modul6;

public class BankMain {
    public static void main(String[] args) {

        Managers manager = new Managers("John Smith", 1, "20.10.89", "Toronto");
        Accountant accountant1 = new Accountant("Mary Johns", 2, "03.10,80", "Ottawa");
        Accountant accountant2 = new Accountant("Lily Cole", 3, "14.06.77", "London");
        Clerk clerk1 = new Clerk("Nancy Lee", 4, "30.01.03", "Toronto");
        Clerk clerk2 = new Clerk("Petr First", 5, "04.11.92", "Montreal");
        Clerk clerk3 = new Clerk("Evan Docker", 6, "12.09.01", "Gatineau");

        System.out.println(manager.printCard());
        System.out.println(accountant1.printCard());
        System.out.println(accountant2.printCard());
        System.out.println(clerk1.printCard());

        System.out.println();
        manager.hireEmp("Kate Moor");
        manager.fireEmp("Lily Cole");
        System.out.println();

        accountant1.createReport(accountant1.getName());
        accountant2.openAccount();
        System.out.println();

        clerk1.makeCall("Kate Moor");
        clerk3.answerCall();
        System.out.println();

        manager.getSalary(manager.getName());
        accountant1.getSalary(accountant1.getName());
    }

}
