public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;


    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    @Override
    public void takeOff(){
      this.flying=true;
      System.out.println(this.getName() +" take off !");
    }
    @Override
    public int ascend(int meters){
      this.altitude += meters;
      System.out.println(this.getName()+" flying at "+this.altitude);
      return altitude;
    }
    @Override
    public int descend(int meters){
      this.altitude -= meters;
      System.out.println("and descends at "+this.altitude);
      return altitude;
    }
    @Override
    public void land(){
      if (this.altitude<=0){
       System.out.println("he should then touch the ground");
     }else{
       System.out.println("he's still flying");
     }
    }
}
