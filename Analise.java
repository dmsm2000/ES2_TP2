public class Analise {

    private float numeroMedioDeArtigosPorCliente(OrdersCollection o) {

        int countItems = 0;

        for (int i = 0; i < o.getOrders().length; i++) {
            for (int j = 0; j < o.getOrders()[i].getContainers().length; j++) {
                countItems += o.getOrders()[i].getContainers()[j].getItems().length;
            }
        }

        return countItems / o.getNumClients();
    }

    private float numeroMedioDeArtigosPorEmbalagem(OrdersCollection o) {

        int countItems = 0;
        int numContainers = 0;

        for (int i = 0; i < o.getOrders().length; i++) {
            numContainers += o.getOrders()[i].getContainers().length;
            for (int j = 0; j < o.getOrders()[i].getContainers().length; j++) {
                countItems += o.getOrders()[i].getContainers()[j].getItems().length;
            }
        }

        return countItems / numContainers;
    }

    private float volumeMedioDosArtigosPorEmbalagem(OrdersCollection o) {

        float volumeTotal = 0;
        int numContainers = 0;

        for (int i = 0; i < o.getOrders().length; i++) {
            numContainers += o.getOrders()[i].getContainers().length;
            for (int j = 0; j < o.getOrders()[i].getContainers().length; j++) {
                for(int k = 0; k < o.getOrders()[i].getContainers()[j].getItems().length; k++){
                     volumeTotal += o.getOrders()[i].getContainers()[j].getItems()[k].getVolume();
                }
            }
        }

        return volumeTotal / numContainers;
    }

    private float volumeMedioDosArtigosPorCliente(OrdersCollection o){

        int volumeTotal = 0;

        for (int i = 0; i < o.getOrders().length; i++) {
            for (int j = 0; j < o.getOrders()[i].getContainers().length; j++) {
                for(int k = 0; k < o.getOrders()[i].getContainers()[j].getItems().length; k++){
                volumeTotal += o.getOrders()[i].getContainers()[j].getItems()[k].getVolume();
                }
            }
        }

        return volumeTotal / o.getNumClients();
    }

    private float pesoMedioDosArtigosPorCliente(OrdersCollection o){

        int pesoTotal = 0;

        for (int i = 0; i < o.getOrders().length; i++) {
            for (int j = 0; j < o.getOrders()[i].getContainers().length; j++) {
                for(int k = 0; k < o.getOrders()[i].getContainers()[j].getItems().length; k++){
                pesoTotal += o.getOrders()[i].getContainers()[j].getItems()[k].getWeight();
                }
            }
        }

        return pesoTotal / o.getNumClients();
    }

    private float pesoMedioDosArtigosPorEmbalagem(OrdersCollection o){

        float pesoTotal = 0;
        int numContainers = 0;

        for (int i = 0; i < o.getOrders().length; i++) {
            numContainers += o.getOrders()[i].getContainers().length;
            for (int j = 0; j < o.getOrders()[i].getContainers().length; j++) {
                for(int k = 0; k < o.getOrders()[i].getContainers()[j].getItems().length; k++){
                     pesoTotal += o.getOrders()[i].getContainers()[j].getItems()[k].getWeight();
                }
            }
        }

        return pesoTotal / numContainers;
    }

    private Item modaDosArtigosPorEmbalagem(OrdersCollection o){

        

        return null;
    }

    public void analisar(OrdersCollection o) {

    }

}
