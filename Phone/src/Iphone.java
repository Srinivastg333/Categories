public class Iphone implements Repairable,Excahngeable,Sellable,Lostable{

   private String Model;
   private String Name;
   private double Price;
  private String Camera;
  private String DisplayType;

  private IphoneType iphoneType;
  private String Storage;

  public Iphone(String Model, String Name,double Price,String Camera,String DisplayType,IphoneType iphoneType,String Storage){
      this.Model=Model;
      this.Name=Name;
      this.Price=Price;
      this.Camera=Camera;
      this.DisplayType=DisplayType;
      this.iphoneType=iphoneType;
      this.Storage=Storage;
  }


  public String toString(){
      return "Model: "+Model+" Name: "+Name+" Price: $"+Price+ "Camera: "+Camera+" DisplayType: "+DisplayType+" IphoneType: "+iphoneType+" Storage: "+Storage;
  }
    @Override
    public void Exchangable() {
        System.out.println("Iphone 10 ProMax Can be Exchangeable If any Damage happenes here");
    }

    @Override
    public void Repairable() {
        System.out.println("Iphone 12 Can be Repairable if all related damages are done here");
    }

    @Override
    public void Sellable() {
        System.out.println("Iphone 14 ProMax wish to sell at your Negosible price it can be done here");
    }

    @Override
    public void Lostable() {
        System.out.println("Iphone 13 proMax as Losted can be climed by Insurence policyes done here");
    }
}
