public class GenericClass <T>{
    private T genericField;

    public GenericClass(T value) {
        this.genericField = value;
    }

    public void printGenericField() {
        System.out.println("Generic Field: " + genericField);
    }

}
