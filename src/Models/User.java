package Models;

import com.sun.javafx.scene.layout.region.Margins;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by denik on 28.01.2015.
 */

public class User extends Entity {

    private String username;
    private String password;

    private Set<Publication> publications = new HashSet<Publication>();
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private boolean enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
