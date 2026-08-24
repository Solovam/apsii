public class Principal {
    Veiculo v1 = new Veiculo("Corolla", 2018);
    Veiculo v2 = new Veiculo("Onix", 2016);

    Carro c1 = new Carro("Camaro", 2018, 2);

    Moto m1 = new Moto("CB300", 2016, 300)

    System.out.println(v1.imprimirDetalhes());
    System.out.println(c1.imprimirDetalhes());
    System.out.println(m1.imprimirDetalhes());
}
