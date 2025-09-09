class UserEncap {
    private String username;
    public UserEncap(String username){ this.username = username; }
    public String getUsername(){ return username; }
    public void setUsername(String username){ this.username = username; }
}

public class Q18_MinimizePublicFields {
    public static void main(String[] args){
        UserEncap u = new UserEncap("archit");
        System.out.println(u.getUsername());
        u.setUsername("archit_ag");
        System.out.println(u.getUsername());
    }
}