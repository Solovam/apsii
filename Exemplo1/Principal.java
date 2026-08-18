public class Principal {

    public static void main(String[] args){

        Banco b3 = new Banco ("Murilo", "0000", 15); //Criar

        System.out.println(b3.getNome()); //Mostrar
        b3.setNome("Joaquim"); //Atualizar
        System.out.println(b3.getNome()); //Mostrar valor atualizado
    }
}
