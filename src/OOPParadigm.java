/*
* Encapsulamento: Protege os dados dentro de uma classe
* Herança: Permite criar novas classes com base em outras
* Polimorfismo: Permite a reutilização de métodos de forma flexível
* Abstração: Define apenas os detalhes essenciais de um objeto
* */

// Classe que representa um objeto "Car"
class Car {
    private String model;
    private int year;

//    Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

//    Método para exibir detalhes do carro
    public void showInfo() {
        System.out.println("Modelo: " + model + ", Ano: " + year);
    }
}

public class OOPParadigm {
    public static void main(String[] args) {
//        Criando um objeto da classe "Carro"
        Car myCar = new Car("Honda Civic", 2023);
        myCar.showInfo();
    }
}
