package service;

import entities.Cuentas;

public class CuentaServiceImpl {

    public float getSaldo(Cuentas cuenta) {

        return cuenta.getValor();
    }
}
