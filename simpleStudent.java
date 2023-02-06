public class simpleStudent extends Student {

    public simpleStudent(Responsibility responsibility) {
        super(responsibility);
    }

    @Override
    public void create() {
        System.out.println("Студент без должности добавлен");
        responsibility.fillResponsibility();
    }
}