package proxyModel;

public class Test {
    public static void main(String[] args) {
        IGamerPlayer player = new GamerPlayer("张三");

        player.login("ZhangSan","123456");
        player.killBoss();
        player.upGrade();

        IGamerPlayer proxyGamerPlayer = new GamerPlayProxy(player);
        proxyGamerPlayer.login("ZhangSan","123456");
        proxyGamerPlayer.killBoss();
        proxyGamerPlayer.upGrade();




    }
}
