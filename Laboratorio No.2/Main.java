import java.io.*;
public class Main {
    public static void main(String x[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Treenodo nodo = new Treenodo();
        crear(nodo, br);

    }

    public static void crear(Treenodo nodo, BufferedReader br) {

        String resp = "S";
        int dato = 0;
        boolean valid = true;
        Treenodo Izqptr, Derptr;

        do {
            try {
                valid = true;
                System.out.print("\tIngrese el dato: ");
                dato = Integer.parseInt(br.readLine());
            } 
            catch (NumberFormatException ioe) { valid = false; }
            catch (IOException ioe) { valid = false; }
            catch (Exception ioe) { valid = false; }
            System.out.println();
        } while (!valid);

        nodo.setDato(dato);

        do {
            try {
                valid = true;
                System.out.print("\tHay dato a la izquierda de (" + nodo.getDato() + ") S/N: ");
                resp = br.readLine();
                if (!(resp.equals("S") || resp.equals("N"))) { valid = false; }
            } 
            catch (IOException ioe) { valid = false; }
            catch (Exception ioe) { valid = false; } 
            System.out.println();
        } while (!valid);

        if (resp.equals("S")) {
            Izqptr = new Treenodo();
            crear(Izqptr, br);
        } else 
            Izqptr = null;
        
        
        do {
            try {
                valid = true;
                System.out.print("\tHay dato a la derecha de (" + nodo.getDato() + ") S/N: ");
                resp = br.readLine();
                if (!(resp.equals("S") || resp.equals("N"))) { valid = false; }
            } 
            catch (IOException ioe) { valid = false; }
            catch (Exception ioe) { valid = false; }
            System.out.println();
        } while (!valid);

        if (resp.equals("S")) {
            Derptr = new Treenodo();
            crear(Derptr, br);
        } else 
            Derptr = null;

        return;
    }
}