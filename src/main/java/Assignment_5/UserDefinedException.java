package Assignment_5;

public class UserDefinedException {

    private String uname;

    private String password;

    UserDefinedException(String uname, String password){
        this.uname = uname;
        this.password = password;
    }

    void login(String uname, String password){
        if ((uname == this.uname) && (password == this.password)){
            System.out.println("User is logged in");
        }
        else{
            throw new MyException("Invalid credentials! Please enter valid username and password");
        }
    }

}