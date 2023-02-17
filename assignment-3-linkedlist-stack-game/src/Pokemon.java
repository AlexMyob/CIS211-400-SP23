public class Pokemon {
    private int indexNumber;
    private String name;
    private String typeOne;
    private String typeTwo;
    private int total;
    private int hp;
    private int attack;
    private int defense;
    private int attackSpeed;
    private int defenceSpeed;
    private int speed;
    private int generation;
    private boolean isLegendary;
    public Pokemon(int indexNumber, String name, String typeOne, String typeTwo, int total, int hp, int attack,
                   int defense, int attackSpeed, int defenceSpeed, int speed, int generation, boolean isLegendary) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.attackSpeed = attackSpeed;
        this.defenceSpeed = defenceSpeed;
        this.speed = speed;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }

    public String getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getDefenceSpeed() {
        return defenceSpeed;
    }

    public void setDefenceSpeed(int defenceSpeed) {
        this.defenceSpeed = defenceSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }
}
