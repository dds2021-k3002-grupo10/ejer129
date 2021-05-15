package entities;
import java.util.List;
public class Clientes {
    private String Nombre;
    private int NumeroDNI;
    private List<Cuentas> CuentasCliente;

    public Clientes(String Nombre, int NumeroDNI, List<Cuentas> CuentasCliente) {
        this.Nombre = Nombre;
        this.NumeroDNI = NumeroDNI;
        this.CuentasCliente = CuentasCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroDNI() {
        return NumeroDNI;
    }

    public void setNumeroDNI(int NumeroDNI) {
        this.NumeroDNI = NumeroDNI;
    }

    public List<Cuentas> getCuentasCliente() {
        return CuentasCliente;
    }

    public void setCuentasCliente(List<Cuentas> CuentasCliente) {
        this.CuentasCliente = CuentasCliente;
    }

}
