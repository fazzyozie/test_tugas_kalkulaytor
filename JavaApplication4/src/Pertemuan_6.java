
public class Pertemuan_6 {
    static int size=4;
    static String[]queue = new String[size];
    static int rear=-1;
    
    public static void main(String[] args) {
        enqueue("A");display();
        enqueue("B");display();
        enqueue("C");display();
        enqueue("D");display();
        enqueue("E");
        dequeue();display();
        dequeue();display();
        dequeue();display();
        dequeue();display();
        dequeue();
        
    }  
    
    public static void dequeue(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
        }
        else{
            System.out.println("Keluarkan "+queue[0]);
            for(int i=0;i<rear;i++){
                queue[i]=queue[i+1];
            }
            rear--;// rear=rear-1;
        }
    }
    
    public static boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void display(){
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i]+",");
        }
        System.out.println("");
    }
    
    public static void enqueue(String x){
        if(isFull()){
            System.out.println("Antrian Penuh");
        }
        else{
            rear=rear+1;
            queue[rear]=x;
        }
    }
    
    public static boolean isFull(){
        if(rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    

}
