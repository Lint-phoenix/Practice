import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CabDriver {
    private String name;
    private String mobNo;
    private boolean isLoggedIn;

    static List<CabDriver> driverDatabase = new ArrayList<>();

    public CabDriver(String name, String mobNo) {
        this.name = name;
        this.mobNo = mobNo;
        this.isLoggedIn = false;
    }

    public String getName() {
        return name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void login() {
        this.isLoggedIn = true;
        System.out.println(name + " logged in successfully!");
    }

    public void acceptRide(String passenger, String pickup, String drop) {
        if (isLoggedIn) {
            System.out.println(name + " accepted ride for " + passenger +
                    " from " + pickup + " to " + drop);
        } else {
            System.out.println("Driver must login first!");
        }
    }

    public void rejectRide(String passenger) {
        if (isLoggedIn) {
            System.out.println(name + " rejected ride for " + passenger);
        } else {
            System.out.println("Driver must login first!");
        }
    }

    public static void registerDriver(CabDriver driver) {
        driverDatabase.add(driver);
        System.out.println("Driver " + driver.getName() + " registered.");
    }

    public static CabDriver findDriver(String mobNo) {
        for (CabDriver d : driverDatabase) {
            if (d.getMobNo().equals(mobNo)) {
                return d;
            }
        }
        return null;
    }
}

class CabApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CabDriver d1 = new CabDriver("Ravi", "99999");
        CabDriver d2 = new CabDriver("Anil", "88888");
        CabDriver.registerDriver(d1);
        CabDriver.registerDriver(d2);

        System.out.println("Enter driver phone number to login:");
        String mob = sc.nextLine();
        CabDriver driver = CabDriver.findDriver(mob);

        if (driver != null) {
            driver.login();
            
            System.out.println("Ride request: Passenger = Neha, Pickup = MG Road, Drop = Indiranagar");
            System.out.println("Accept ride? (yes/no)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                driver.acceptRide("Neha", "MG Road", "Indiranagar");
            } else {
                driver.rejectRide("Neha");
            }
        } else {
            System.out.println("Driver not found!");
        }

        sc.close();
    }
}
