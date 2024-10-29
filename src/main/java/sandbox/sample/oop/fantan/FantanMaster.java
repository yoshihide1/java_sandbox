package sandbox.sample.oop.fantan;

import sandbox.sample.oop.framework.trump.Master;

public class FantanMaster extends Master {

    /** パスできる制限回数 */
    public static final int PASS_LIMIT = 3;

    /**
     * パスを宣言する
     * 
     * @param player パスするプレイヤー
     */
    public void pass(FantanPlayer player) {
        System.out.println(player + "さんは" + player.getPass() + "回目のパスをしました！");

        if (player.getPass() > PASS_LIMIT) {
            System.out.println("パスの制限を超えたため" + player + "さんは負けです！！");
            deregisterPlayer(player);
        }
    }

}
