import java.util.LinkedList;

public class Container implements ContainerADT {

    private Types type;
    private Item[] items;

    public Container(Types type, Item[] items) {
        this.type = type;
        this.items = items;
    }

    public int getNumOfItems() {
        return this.items.length;
    }

    public Types getType() {
        return type;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + this.type.toString() + " -> " + this.items.toString();
    }

}
