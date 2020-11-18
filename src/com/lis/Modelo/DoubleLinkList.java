package Modelo;

public class DoubleLinkList {
    private DoubleLink head;
    private DoubleLink tail;
    int size;

    public DoubleLinkList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public DoubleLink getHead() {
        return head;
    }

    public void setHead(DoubleLink head) {
        this.head = head;
    }

    public DoubleLink getTail() {
        return tail;
    }

    public void setTail(DoubleLink tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return (getHead() == null);
    }
    
    public void insertFirst(Movie movie){
        DoubleLink newLink = new DoubleLink(movie);
        if(isEmpty()){
            setHead(newLink);
            setTail(getHead());
        }else{
            newLink.setNext(getHead());
            getHead().setPrev(newLink);
            setHead(newLink);
        }
        setSize(getSize()+1);
    }
    
    public DoubleLink deleteFirst(){
        DoubleLink deleted = null;
        if(!isEmpty()){
            deleted = getHead();
            if(getHead().equals(getTail())){
                setHead(null);
                setTail(null);
            }else{
                getHead().getNext().setPrev(null);
                setHead(getHead().getNext());
            }
            setSize(getSize()-1);
        }
        return deleted;
    }
    
    public void insertLast(Movie movie){
        if(!isEmpty()){
            DoubleLink newLink = new DoubleLink(movie);
            newLink.setPrev(getTail());
            getTail().setNext(newLink);
            setTail(newLink);
            setSize(getSize()+1);
        }else{
            insertFirst(movie);
        }
    }
    
    public DoubleLink deleteLast(){
        DoubleLink deleted = null;
        if(!isEmpty() && getHead() != getTail()){
            deleted = getTail();
            getTail().getPrev().setNext(null);
            setTail(getTail().getPrev());
            setSize(getSize()-1);
        }else{
            return deleteFirst();
        }
        return deleted;
    }
    
    public int getIndex(DoubleLink link){
        DoubleLink temp = getHead();
        int index = -1;
        for (int i = 0; i < getSize(); i++) {
            if(temp.equals(link)){
                index = i;
                break;
            }
            temp = temp.getNext();
        }
        return index;
    }
    
    public DoubleLink getIndexLink(int index){
        DoubleLink indexLink = null;
        DoubleLink temp = getHead();
        if(index < getSize() && index >= 0){
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            indexLink = temp;
        }
        return indexLink;
    }
    
    public DoubleLink find(String id){
        DoubleLink desired = null;
        if(!isEmpty()){
            DoubleLink temp = getHead();
            while(temp.getNext() != null) {
                if(temp.getData().getId().equals(id)){
                    desired = temp;
                    break;
                }
                temp = temp.getNext();
            }
        }
        return desired;
    }
    
    public DoubleLink deleteThis(String id){
        DoubleLink deleted = null;
        if(!isEmpty()){
            DoubleLink temp = find(id);
            int index = getIndex(temp);
            if(index == 0){
                return deleteFirst();
            }else if(index == getSize()-1){
                return deleteLast();
            }else{
                deleted = temp;
                temp.getNext().setPrev(temp);
                temp.getPrev().setNext(temp.getNext());
                setSize(getSize()-1);
            }
        }
        return deleted;
    }
    
    public void insertIn(int index, Movie movie){
        DoubleLink newLink = new DoubleLink(movie);
        if(index < getSize() || index >= 0){
            if(index == 0){
                insertFirst(movie);
            }else if(index == getSize()-1){
                insertLast(movie);
            }else{
                DoubleLink temp = getIndexLink(index);
                newLink.setNext(temp);
                newLink.setPrev(temp.getPrev());
                temp.setPrev(newLink);
                temp.getPrev().setNext(newLink);
                setSize(getSize()+1);
            }
        }else{
            if(isEmpty()){
                System.out.println("La lista esta vacia");
            }else{
                System.out.println("posicion fuera de rango");
            }
        }
    }
    
    public DoubleLink deleteIn(int index, Object data){
        DoubleLink deleted = null;
        if(index < getSize() || index >= 0){
            if(index == 0){
                return deleteFirst();
            }else if(index == getSize()-1){
                return deleteLast();
            }else{
                deleted = getIndexLink(index);
                DoubleLink temp = deleted.getPrev();
                deleted.getNext().setPrev(temp);
                temp.setNext(deleted.getNext());
                setSize(getSize()-1);
            }
        }
        return deleted;
    }
    
    public void InsertBeforeThis(DoubleLink link, Movie movie){
        if(find(link.getData().getId())!= null){
            int index = getIndex(link);
            insertIn(index,movie);
        }else{
            System.out.println("no se encontro el nodo donde se quiere insertar");
        }
    }
    
    public DoubleLink deleteBeforeThis(DoubleLink link){
        int index = getIndex(link);
        if(index > 0 && index < getSize()){
            return deleteIn(index - 1, link.getData());
        }
        return null;
    }
    
    public void displayList(){
        DoubleLink temp = getHead();
        for (int i = 0; i < getSize(); i++) {
            System.out.println(temp.getData().toString());
            temp = temp.getNext();
        }
    }
}
