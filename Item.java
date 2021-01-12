public class Item implements ItemADT {

    private String reference;
    private float depth, length, height, weight, volume;

    public Item(String reference, float depth, float length, float height, float weight) {
        this.reference = reference;
        this.depth = depth;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.volume = this.depth * this.height * this.length;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getReference() {
        return reference;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Reference: " + this.reference + " [" + this.depth + ", " + this.height + ", " + this.length + ", "
                + this.weight + "]";
    }

}
