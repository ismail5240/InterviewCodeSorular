package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.üçüncüKısım;

public class Soru5_sayfa35 {
    public static void main(String[] args) throws InterruptedException{

        //Garbage Collector-->Çöp toplayıcı


        GarbageCollector t1=new GarbageCollector();
        GarbageCollector t2=new GarbageCollector();

        //Nullifying the reference variabe -->Referans değişkeni geçersiz kılmak
        t1=null;

        //Requesting JVM for runnig Garbage Collector -->Çöp Toplayıcıyı çalıştırmak için JVM talep etme
        System.gc();

        //Nullifying the reference variable -->Referans değişkeni geçersiz kılmak
        t2=null;

        //Reguesting JVM for running Garbege Collector -->Çöp Toplayıcıyı çalıştırmak için JVM talep etme
        Runtime.getRuntime().gc();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbege Collector called");
        System.out.println("Object garbage Collector"+ this);
    }
}
