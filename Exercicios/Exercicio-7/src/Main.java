import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float temperaturaCelsius, temperaturaFahrenheit;
        char resp;
                
        do {
            System.out.print("Informe a temperatura em Celsius: ");
            temperaturaCelsius = sc.nextFloat();
            
         
            temperaturaFahrenheit = convertTemp(temperaturaCelsius);
            System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
            
            
            System.out.println("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
            
        } while(resp != 'n');
        
        sc.close();
    }
    
    public static float convertTemp(float tempCelsius) {        
        return  (9.0f * tempCelsius / 5.0f) + 32.0f;  
    }
}
