package proxyModel;

public class GamerPlayer implements IGamerPlayer {
    private String name =  "";

    public GamerPlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录的用户名为"+user+"的用户："+this.name+"登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"正在杀怪");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name+"又升了一级");
    }
}
