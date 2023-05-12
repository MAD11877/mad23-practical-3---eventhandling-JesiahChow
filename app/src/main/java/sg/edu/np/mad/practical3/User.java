package sg.edu.np.mad.practical3;

public class User {

    public int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean IsFollowed;

    public boolean isFollowed() {
        return IsFollowed;
    }

    public void setFollowed(boolean followed) {
        IsFollowed = followed;
    }

    public User(String name, String description){
        this.name = name;
        this.description = description;

    }
}
