package proxyModel;

public class GamerPlayProxy implements IGamerPlayer{

    private IGamerPlayer iGamerPlayer = null;

    public GamerPlayProxy(IGamerPlayer iGamerPlayer) {
        this.iGamerPlayer = iGamerPlayer;
    }

    @Override
    public void login(String user, String password) {
        iGamerPlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        iGamerPlayer.killBoss();
    }

    @Override
    public void upGrade() {
        iGamerPlayer.upGrade();
    }
}
