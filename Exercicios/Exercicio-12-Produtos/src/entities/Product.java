package entities;

public class Product {

    public String Name;
    public double Price;
    public int Quantity;

    public double TotalValueInStock() {
        return Price * Quantity;
    }

    public void AddProducts(int quantity) {
        Quantity += quantity;
        
        System.out.print("\nUpdated data: " + View());    
    }

    public void RemoveProducts(int quantity) {
        Quantity -= quantity;
        
        System.out.print("\nUpdated data: " + View());    
    }

    public String View() {
        return Name + ", $ " + Price + ", " + Quantity + " units" + ", Total: $ " + TotalValueInStock();
    }
}
