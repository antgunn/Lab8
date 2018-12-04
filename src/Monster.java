public class Monster extends Position {

    private int maxHealth;
    private int currentHealth;

    public Monster(int row, int col) {
        super(row, col);
        maxHealth = 10;
        this.currentHealth = maxHealth;
    }

    public void move() {

    }

    public void moveForward() {

    }


    public void moveBack() {

    }

    public void moveLeft() {

    }

    public boolean checkNextPos() {
        // Check Right


        return false;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
}
