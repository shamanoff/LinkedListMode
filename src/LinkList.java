public class LinkList {
    private Link first;
    private static int sIndex=0;

    public LinkList() {
        first = null;
    }


    public void insertFirst(int dData){
        Link newLink = new Link(dData,sIndex);
        sIndex++;
        newLink.next=first;
        first=newLink;
    }

    public void delFirst(){
        if (first!=null)
            sIndex--;
        first=first.next;
    }

    public void displayList(){
        Link curent = first;
        while (curent!=null){
            curent.displayLink();
            curent=curent.next;
        }

    }







    public boolean isEmpty(){
        return (first==null);
    }
}
