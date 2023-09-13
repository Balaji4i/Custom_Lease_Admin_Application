package fusion.um.model.POJO;

public class pojo_seg3 {
    public pojo_seg3(String id, String name) {
        this.Id = id;
        this.Name = name;

    }
    private String Id;
    private String Name;

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
}
