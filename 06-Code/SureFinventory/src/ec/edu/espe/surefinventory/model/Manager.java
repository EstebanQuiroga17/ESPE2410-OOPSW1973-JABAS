
package ec.edu.espe.surefinventory.model;

import ec.edu.espe.surefinventory.utils.JsonFileManager;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author abner
 */
public class Manager {
    private String userName;
    private String password;

    public Manager(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" + "username=" + userName +
                ", password=" + password + '}';
        
    }
    
    public void changeMenu(Menu menu){               
        System.out.println("El menú ha sido actualizado: "  );
        JsonFileManager.printJson(menu.getProductList());
    }
    
     public Order takeOrder(Customer customer, ArrayList<Dish> dishes) {
        int itemQuantity = dishes.size(); // Calculate quantity based on list size
        int id = (int) (Math.random() * 10000); // Generate a unique ID
        Order order = new Order(itemQuantity, id, dishes, customer);
        System.out.println("Orden tomada del cliente: " + customer.getName());
    return order;
}
      
      public Cashier createCashier(String username, String password){
        Cashier cashier = new Cashier(username, password);
        System.out.println("Nuevo cajero creado con username: " + username);
        return cashier;    
    }
      
      public static boolean logIn(){
          
        Path filePath = Paths.get("data","manager.json");
        JsonFileManager jsonFileManager = new JsonFileManager(filePath);
        
        ArrayList<Manager> managers = jsonFileManager.decerializeJson(Manager.class);
        
        if (managers == null || managers.isEmpty()) {
            System.out.println(" No existe ningun usuario. ");
            return false;
        }
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre de usuario: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Ingresa tu contrasena: ");
        String inputPassword = scanner.nextLine();
        
        for (Manager manager : managers) {
            if (manager.getUsername().equals(inputUsername) && manager.getPassword().equals(inputPassword)) {
                System.out.println("Que bueno verte " + inputUsername + "!");
                return true;
            }
        }
        
        System.out.println("Algo anda mal! --> Revisa tu usuario o contrasena.");
        return false;
    }
      
      public void cancelOrder(Order order){
        System.out.println("La orden con ID " + order.getId() + " ha sido cancelada.");
    }
      public void addExpense(Expense expense){
        System.out.println("Se ha añadido un gasto: " + expense.toString());
      }
      
    public AccountingReport createAccountingReport(Calendar fromDate, Calendar toDate, ArrayList<Order> orders) {
        ArrayList<Invoice> incomes = new ArrayList<>();
        ArrayList<Expense> expenses = new ArrayList<>();

    
        int invoiceId = 1; // Start with ID 1 for invoices
        for (Order order : orders) {
        incomes.add(new Invoice("Nueva Factura", invoiceId++, order));
    }

        AccountingReport report = new AccountingReport(Calendar.getInstance(), incomes, expenses);
        System.out.println("Informe contable creado desde " + fromDate.getTime() + " hasta " + toDate.getTime());
        return report;
}

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return userName;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.userName = username;
    }
    
    
    

}
