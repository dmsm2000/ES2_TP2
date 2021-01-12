import java.util.LinkedList;

public interface ContainerADT {

    public int getNumOfItems();

    public Types getType();

    public Item[]  getItems();

    public void setItems(Item[]  items);

    public void setType(Types type);

    public String toString();
}
