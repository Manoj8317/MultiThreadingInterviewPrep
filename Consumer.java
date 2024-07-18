public class Consumer extends Thread{
    SMS sms;
    Consumer(SMS sms){
        this.sms=sms;
    }

    @Override
    public void run() {
        while (true) {
            int t=sms.consumeItem();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
