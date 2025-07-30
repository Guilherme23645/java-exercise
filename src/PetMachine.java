public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeShower() {
        if (this.pet == null) {
            System.out.println("Não há nenhum pet na máquina");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.printf("O pet %s está limpo%n",pet.getName());
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A máquina alcançou sua capacidade máxima de água");
            return;
        }

        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A máquina alcançou sua capacidade máxima de shampoo");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja");
            return;
        }

        if (this.hasPet()) {
            System.out.printf("O pet %s está já está na máquina%s", this.pet.getName());
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.printf("O pet %s está limpo%n",this.pet.getName());
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}