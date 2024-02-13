public class Employee {
    private String firstName;
    private String lastName;
    protected int age;
    private char firstFirstNameLetter;
    private String bankName;
    private float accountBilance;
    private String isExists;
    private int pesel;

    public Employee(String firstName, String lastName, int age, char firstFirstNameLetter, String bankName, float accountBilance, String isExists, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.firstFirstNameLetter = firstFirstNameLetter;
        this.bankName = bankName;
        this.accountBilance = accountBilance;
        this.isExists = isExists;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getFirstFirstNameLetter() {
        return firstFirstNameLetter;
    }

    public void setFirstFirstNameLetter(char firstFirstNameLetter) {
        this.firstFirstNameLetter = firstFirstNameLetter;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public float getAccountBilance() {
        return accountBilance;
    }

    public void setAccountBilance(float accountBilance) {
        this.accountBilance = accountBilance;
    }

    public String isExists() {
        return isExists;
    }

    public void setExists(String exists) {
        isExists = exists;
    }

    public int getpesel() {
        return pesel;
    }

    public void setpesel(int pesel) {
        this.pesel = pesel;
    }

    /********************************************************
     * nazwa funkcji: getEmployeeInfo
     * parametry wejściowe: -
     * wartość zwracana: Opis pracownika w banku [w konsoli]
     * autor: Jan Kapuściński
     * ****************************************************/
    public void getEmployeeInfo(){
        System.out.println("Employee: " + firstName + " " + lastName + ", age: " + age + "FirstNameFirstLetter: " + firstFirstNameLetter);
        System.out.println("BankInfo: " + bankName + "\n" +
                "AccoutBilance: " + accountBilance + "\n" +
                "IsExist?: " + isExists + "\n" +
                "PESEL: " + pesel + "\n");
    }
}
