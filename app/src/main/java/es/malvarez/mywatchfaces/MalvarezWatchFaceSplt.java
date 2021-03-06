package es.malvarez.mywatchfaces;

import com.ingenic.iwds.slpt.view.core.SlptLayout;

import es.malvarez.mywatchfaces.widget.CirclesWidget;
import es.malvarez.mywatchfaces.widget.HeartRateWidget;
import es.malvarez.mywatchfaces.widget.MalvarezClock;

/**
 * Splt version of the watch.
 */

public class MalvarezWatchFaceSplt extends AbstractWatchFaceSlpt {

    public MalvarezWatchFaceSplt() {
        super(
                new MalvarezClock(),
                new CirclesWidget(),
                new HeartRateWidget()
        );
    }

    @Override
    protected void initWatchFaceConfig() {

    }


}
