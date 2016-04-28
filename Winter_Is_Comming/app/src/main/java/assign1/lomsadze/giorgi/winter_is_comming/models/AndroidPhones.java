package assign1.lomsadze.giorgi.winter_is_comming.models;

/**
 * Created by GiorgiL on 4/28/2016.
 */
public class AndroidPhones {
    private String name;
    private String image;

    public AndroidPhones(String name, String image) {
        this.image = image;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AndroidPhones{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
