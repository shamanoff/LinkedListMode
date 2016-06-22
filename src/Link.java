public class Link {

    int index;
    int dData;              //data

    Link next;

    public Link(int dData, int index) {
        this.index=index;
        this.dData = dData;
        next = null;
    }

    public void displayLink(){
        System.out.println("("+index+" "+dData+")");
    }
}
