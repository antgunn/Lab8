public class Tower extends Position {

    private int damage;

    public Tower(int row, int col) {
        super(row, col);
        damage = 1;
    }

    public void buildTower() {

    }

    public void attack() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
