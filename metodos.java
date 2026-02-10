import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);

    public objVehiculo [] LlenarRegistros(objVehiculo[] r){

        for(int i = 0; i < r.length; i++){
               objVehiculo o = new objVehiculo();
               System.out.println("Ingrese la marca: ");
               o.setMarca(sc.next());
               System.out.println("Ingrese tipo vehiculo: ");
               o.setTipo(sc.next());
               System.out.println("Ingrese el cilindraje: ");
               o.setCilindraje(sc.nextInt());
               if(o.getCilindraje() > 900 && o.getCilindraje() < 16000){
                o.setPagoAnterior(150.0000);
               }
               else if(o.getCilindraje()>=1700 && o.getCilindraje() <2000){
                o.setPagoAnterior(200.000);
               }
               else {
                o.setPagoAnterior(250.000);
               }
               o.setNumeroCelda(i+1);
               r[i] = o;
        }
        return r;
    }
    public objVehiculo[] CalcularNuevoPago(objVehiculo[] r){

        for (int i = 0; i < r.length; i++) {
            r[i].setPagoActual(r[i].getPagoAnterior() * 1.23);
        }
        return r;
    }

    public void Mostrarregistros(objVehiculo[] r){
        for (int i = 0; i < r.length; i++) {
            System.out.println("Marca: " + r[i].getMarca());
            System.out.println("TipoVehiculo: " + r[i].getTipo());
            System.out.println("cilindraje: " + r[i].getCilindraje());
            System.out.println("PagoAnterior: " + r[i].getPagoAnterior());
            System.out.println("PagoActual: " + r[i].getPagoActual());
            System.out.println("Numero de celda: " + r[i].getNumeroCelda());
            System.out.println("--------------------------");
        }
    }
}
