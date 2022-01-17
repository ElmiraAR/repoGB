/*
* Java 1. Homework #5
*
* @author Elmira Arslanova
* @version 10.01.2022-17.01.2022
*
*/

class GBJavaLesson5 {
    public static void main(String[] args) {
        filtrPerson();
    }

    static void filtrPerson() {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov", "Engineer", "ivi@mailbox.com", "25877", 400, 40);
        persArray[1] = new Person("Petrov", "Engineer", "ivi@mailbox.com", "11111", 600, 60);
        persArray[2] = new Person("Sidorov", "Engineer", "ivi@mailbox.com", "2222", 100, 20);
        persArray[3] = new Person("Ishmuhametov", "Engineer", "ivi@mailbox.com", "3333", 700, 45);
        persArray[4] = new Person("Fedorov", "Engineer", "ivi@mailbox.com", "4444", 100, 25);
        for (int i=0; i<persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}

class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int wages;
    private int age;

    Person (String fullName, String position, String email, String phoneNumber, int wages, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;
    }

    public void setFullName(String fullName) {
        if (fullName != null) {
            this.fullName = fullName;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + wages + ", " + age;
    }
}