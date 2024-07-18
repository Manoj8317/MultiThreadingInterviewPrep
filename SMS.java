public class SMS {
    int buffer;
    boolean flag=false;
    synchronized public void produceItem(int t){
        if(flag==true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produced Item "+t);
        buffer=t;
        flag=true;
        notify();
    }

   synchronized public int consumeItem(){
    if(flag==false){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        System.out.println("Consumed Item "+buffer);
        flag=false;
        notify();
        return buffer;
    }
}
