public class Calculator{
    private Floor floor = new Floor(0,0);
    private Carpet carpet = new Carpet(4000);

    public Calculator(Floor floor, Carpet carpet) {

        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }

}
