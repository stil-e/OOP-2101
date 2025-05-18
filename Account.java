abstract class Account {

    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute();
    }
}

class Admin extends Account {
    private String AuthPassword;

    public Admin(int _id, String _name, String _password) {
        id = _id;
        name = _name;
        AuthPassword = _password;
    }
}

class User extends Account {
    public User(int _id, String _name) {
        id = _id;
        name = _name;
    }
}

interface DataSource {
    void execute();
}

class Delete implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been deleted.");
    }
}

class Update implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been Updated Successfully!");
    }
}

class View implements DataSource {
    @Override
    public void execute() {
        System.out.println("Some data to be displayed.");
    }
}

public class MainApplication {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(190130, "Sharon", "x11@L42%3");
        User curUser = new User(4365, "James");

        curAdmin.performOperation(new Update()); // Admin updates the data.
        curUser.performOperation(new View());    // User views the data.
    }
}
