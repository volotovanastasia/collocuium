public abstract class Student {
    protected Responsibility responsibility;

    public Student(Responsibility responsibility) {
        this.responsibility = responsibility;
    }

    public abstract void create();
}
