package wk2;

public class Author {
    public String firstName;
    public String lastName;

    public Author(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    public void setFirstName (String fName){
        this.firstName = fName;
    }
    public void setLastName (String lName){
        this.lastName = lName;
    }
    public String getFirstName(){
        return this.firstName ;
    }
    public String getLastName(){
        return this.lastName ;
    }
    public void StringtoString(){
        System.out.println("First Name of the author is " +firstName);
        System.out.println("Last Name of the author is " +lastName);
    }
    public static void main(String[] args) {
        Author A1 = new Author("Geromino", "Stilton");
        A1.StringtoString();
        A1.setFirstName("Thea");
        A1.setLastName("Stilton");
        A1.getFirstName();
        A1.getLastName();
        A1.StringtoString();
    }
}
