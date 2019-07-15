public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public Boolean hasVolume(){
        if(this.volume > 0)
        {
            return true;
        } else {
            return false;
        }
        };

    public int volumeLeft(){
        return this.volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        this.volume -= this.volume;
    }

    public void fill(){
        this.volume = 100;
    }


}

