public class Printer {

    private int paperLeft;
    private int tonerVolume;

    public Printer(int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public boolean hasPaper(){
        if(paperLeft > 0){
            return true;
        } else {
            return false;
        }

    }

    public int getPaperLeft(){
        return this.paperLeft;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void useAllPaper(){
        this.paperLeft -= this.paperLeft;
    }

    public String print(int pages, int copies){
        if(this.paperLeft > 0) {
            int printed = pages * copies;
            this.paperLeft -= printed;
            this.tonerVolume -=1;
            return "Printed";
        } else {
           return "No Paper Left";
        }

    }


}
