package dao;

import entities.Clientes;
import entities.Cuentas;

import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl {
    /*Singleton*/
    public static ClienteDaoImpl instancia = null;
    private List cliente = null;

    private ClienteDaoImpl() {
    }

    public static ClienteDaoImpl getInstance() {
        if (instancia == null) {
            instancia = new ClienteDaoImpl();
        }
        return instancia;
    }

    public List getClientes() {

        if (cliente == null) {
            cliente = new ArrayList();
            /*primer client con sus cuentas*/
            ArrayList<Cuentas> cuenta = new ArrayList<>();
            cuenta.add(new Cuentas("hsbc", 1000));
            cuenta.add(new Cuentas("icbc", 2000));
            cuenta.add(new Cuentas("rio", 3000));
            cuenta.add(new Cuentas("galicia", 4000));
            /*agrego*/
            cliente.add(new Clientes("CARLOS", 111, cuenta));

            /*Segundo cliente con sus cuentas*/
            ArrayList<Cuentas> cuenta2 = new ArrayList<>();
            cuenta2.add(new Cuentas("cuenta1", 1000));
            cuenta2.add(new Cuentas("cuenta2", 2000));
            cuenta2.add(new Cuentas("cuenta3", 3000));
            /*agrego*/
            cliente.add(new Clientes("ALEX", 222, cuenta2));

        }
        return cliente;

    }

}
