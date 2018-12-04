public class Tower {

    private Position towerPos;
    private int damage;

    public Tower(Position pos) {
        this.towerPos = pos;
        damage = 1;
    }

    public Position getTowerPos() {
        return towerPos;
    }

    public void setTowerPos(Position towerPos) {
        this.towerPos = towerPos;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
