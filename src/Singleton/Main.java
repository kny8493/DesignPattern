package Singleton;

public class Main extends Thread{
    public static void main (String[] str) {
        System.out.println("시작");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2) {
            System.out.println("같음");
            System.out.println(s1);
            System.out.println(s2);
        } else {
            System.out.println("다름");
        }


        for(int i=0 ;i<10;i++) {
            int ticketMater = TicketMater.getNextTicket();
            System.out.println(TicketMater.getInstance() +"||" + TicketMater.getNextTicket());
        }

        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
    }
    public void run() {
        Singleton si = Singleton.getInstance();
        System.out.println(getName() +"||"+si);
    }
    public Main(String name) {
        super(name);
    }
}
