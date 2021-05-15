package service;

import entities.Clientes;
import entities.Cuentas;

import java.util.List;

public class ClienteServiceImpl {

    public Clientes buscaCliente(int nroDocumento, List<Clientes> listaClientes) {
        Clientes cliente = null;

        for (Clientes clients : listaClientes) {
            if (clients.getNumeroDNI() == nroDocumento) {
                /*guardo el objeto Cliente - suponiendo para este ejercicio que no hay repeticion*/
                cliente = clients;
            }
        }
        return cliente;
    }

    public int cantidadCuentas(List<Cuentas> listaClientes, float saldo) {
        CuentaServiceImpl cuentaServiceImpl = new CuentaServiceImpl();
        int contador = 0;
        for (Cuentas cuenta : listaClientes) {
            float saldoCuenta = cuentaServiceImpl.getSaldo(cuenta);
            if (saldoCuenta > saldo) {
                contador++;
            }
        }

        return contador;

    }
}
