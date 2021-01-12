public class Analise {

    private float numeroMedioDeArtigosPorCliente(OrdersCollection o) {

        int countItems = 0;

        for (int i = 0; i < o.getOrders().length; i++) {
            for (int j = 0; j < o.getOrders()[i].getContainers().length; j++) {
                countItems += o.getOrders()[i].getContainers()[j].getItems().size();
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
                countItems += o.getOrders()[i].getContainers()[j].getItems().size();
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
                volumeTotal += o.getOrders()[i].getContainers()[j].getItemsArray()[i].getVolume();
            }
        }

        return volumeTotal / numContainers;
    }

    public void analisar(OrdersCollection o) {

    }

}
