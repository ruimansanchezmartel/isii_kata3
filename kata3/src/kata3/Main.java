package kata3;

public class Main {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
}
