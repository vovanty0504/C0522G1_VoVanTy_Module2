package on_tap.modle;

public abstract class BankAccount {
    private int id;
    private String code;
    private String name;
    private String data;

    public BankAccount() {
    }

    public BankAccount(int id, String code, String name, String data) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public abstract String info();

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
