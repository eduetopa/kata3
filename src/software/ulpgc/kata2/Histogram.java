package software.ulpgc.kata2;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

import java.awt.*;

public class Histogram {

    @Override
    public void show(Histogram histogram){
        HistogramDataset dataset = createDataset(histogram.data(), histogram.bins());

        JFreeChart chart = ChartFactory.createHistogram(
                histogram.title(),
                histogram.xAxis(),
                histogram.yAxis(),
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        setLayout(new BorderLayout());
        removeAll();
        add(new ChartPanel(chart), BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private HistogramDataset createDataset(double[] data, int bins){
        HistogramDataset dataset = new HistogramDataset();
        dataset.setType(HistogramType.RELATIVE_FREQUENCY);

        dataset.addSeries("Histogram", data, bins);

        return dataset;
    }
}
