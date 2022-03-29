public class Person{
    private String name;
    private String Aim;  //Private = restricted access

    //Getter
    public String getName(){
        return name;
    }

    // setter
    public void setName(String newName){
        this.name = newName;
    }

    public void setAim(String newAim) {
        this.Aim = newAim;
    }

    public String getAim() {
        return Aim;
    }
}
