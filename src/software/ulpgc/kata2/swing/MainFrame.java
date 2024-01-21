package software.ulpgc.kata2.swing;

public class MainFrame extends JFrame{

    private HistogramDisplay histogramDisplay;

    public MainFrame(){
        setTitle("Histogram");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelative(null);
        add(createHistogramDiisplay());
    }

    private Component createHistogramDisplay(){
        PanelHistogramDisplay display = new PanelHistogramDisplay();
        histogramDisplay =  display;
        return display;
    }

    public HistogramDisplay getHistogramDisplay(){
        return histogramDisplay;
    }
}
