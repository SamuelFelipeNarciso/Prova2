package br.com.starlog.main;

import br.com.starlog.model.Carga;

public class App {
    Carga.c1 = new Carga("ORB-101-SP", "CRIOGENICA", 2.5, 250.00);
    Carga.c2 = new Carga("ORB-102-RJ", "PADRAO", 8.0, 120.00);
    Carga.c3 = new Carga("ORB-103-MG", "CRIOGENICA", 12.0, 850.00);
    Carga.c4 = new Carga("ORB-104-PR", "BIOLOGICA", 15.0, 300.00);

    modulo = new ModuloCarga("MOD-ALFA-01", 3);
    base = new BaseLancamento();
}
