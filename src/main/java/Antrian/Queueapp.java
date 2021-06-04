package Antrian;
public class Queueapp {
    public static void main(String[] args) {
        Queue newqueue = new Queue(10);
        newqueue.enqueue(40);
        newqueue.show();
        newqueue.enqueue(33);
        newqueue.show();
        System.out.println("data paling depan = " + newqueue.peek());
        newqueue.enqueue(60);
        newqueue.show();
        System.out.println("data yang diambil dari antrian = " + newqueue.dequeue());
        newqueue.show();
        System.out.println("data yang diambil dari antrian = " + newqueue.dequeue());
        newqueue.show();
        newqueue.enqueue(54);
        newqueue.show();
        System.out.println("data paling depan = " + newqueue.peek());
    }
    
}
