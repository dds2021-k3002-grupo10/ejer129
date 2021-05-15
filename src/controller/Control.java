package controller;

import dao.ClienteDaoImpl;
import entities.Clientes;
import entities.Cuentas;
import service.ClienteServiceImpl;

import java.util.List;

public class Control {
    ClienteDaoImpl listaClientes = null;
    public String mostrarClienteYCantidadCuentas(int nroDocumento, float saldo) {
        /*traemos la lista de clientes*/
        listaClientes = ClienteDaoImpl.getInstance();

        ClienteServiceImpl clienteServiceImpl = new ClienteServiceImpl();
        List<Clientes> clients = listaClientes.getClientes();
        /*por enunciado conocemos al cliente*/
        Clientes cliente = clienteServiceImpl.buscaCliente(nroDocumento, clients);

        List<Cuentas> listCuentas = cliente.getCuentasCliente();
        /*Traemos las cantides de cuentas si corresponde*/
        int cantidadCuentas = clienteServiceImpl.cantidadCuentas(listCuentas,saldo);

        return "El cliente " + cliente.getNombre() + " tiene " + cantidadCuentas + " cuentas que superan los " + saldo + "$";
    }
}
