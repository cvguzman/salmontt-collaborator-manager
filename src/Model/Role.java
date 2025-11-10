package Model;

public enum Role {
    ENGINEER("Ingeniero/a"),
    MARKETING("Marketing"),
    MANAGER("Manager");

    private  String roleName;
    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(Role role) {
        this.roleName = roleName;
    }

}

