package generic;

public class Person <T extends Number ,U> { // T chỉ thuộc quyền của lớp Number hoặc là những lớp con của Number
    private T id;
    private U name;

    public Person (T id, U name){
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

   

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    
}
