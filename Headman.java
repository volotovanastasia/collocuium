public class Headman extends Student {

    public Headman(Responsibility responsibility) {
        super(responsibility);
    }

    @Override
    public void create() {
        System.out.println("Староста добавлен");
        responsibility.fillResponsibility();
    }
}