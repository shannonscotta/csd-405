// Scott Shannon            Module 6 Assignment -- Division.java       16 April 2022
abstract class Division {

    protected String divisionName;
    protected String accountNumber;

    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}