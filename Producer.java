public class Producer extends Thread {
    SMS sms;
    Producer(SMS sms){
        this.sms=sms;
    }

    @Override
    public void run() {
        int i=1;
        while(true){
            sms.produceItem(i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
