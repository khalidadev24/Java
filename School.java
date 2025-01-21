public class School {
    String name;
    String address;
    int numberOfStudents;
    //constractors
    public School(String name, String address, int numberOfStudents){
        this.name = name;
        this.address = address;
        this.numberOfStudents = numberOfStudents;

    }
    public String getName() { return name; } public void setName(String name) { this.name = name; }
    public String getAddress() { return address; } public void setAddress(String address) { this.address = address; }
    public int getNumberOfStudents() { return numberOfStudents; }
    public void setNumberOfStudents(int numberOfStudents)
    { this.numberOfStudents = numberOfStudents; }



    public static void main(String[] args) {
        //here we create instance

        School sc = new School("Greenwood High", "123 Main St", 500);
        // Print the details of the school
        System.out.println(sc);


    }
}
