public class Main {
    public static void main(String[] args) {
        SMS sms=new SMS();
        Producer producer=new Producer(sms);
        Consumer consumer=new Consumer(sms);
        producer.start();
        consumer.start();
    }
}
