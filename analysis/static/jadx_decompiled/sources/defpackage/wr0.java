package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.settings.view.BrightnessSeekBar;

/* loaded from: classes2.dex */
public final class wr0 extends dec {
    public final BrightnessSeekBar F0;
    public gcd G0;
    public boolean H0;

    public wr0(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) view.findViewById(xxb.row_setting_brightness__seek_bar);
        this.F0 = brightnessSeekBar;
        brightnessSeekBar.setMax(100);
        brightnessSeekBar.setOnSeekBarChangeListener(new vr0(this, frgBaseSettings));
        Context context = view.getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        ngg.G(brightnessSeekBar.getProgressDrawable(), smeVarR.k);
        ngg.G(brightnessSeekBar.getThumb(), smeVarR.k);
        view.findViewById(xxb.row_setting__separator).setBackgroundColor(smeVarR.H);
        ImageView imageView = (ImageView) view.findViewById(xxb.row_setting_brightness__iv_brigthness_low);
        int i = smeVarR.F;
        imageView.setColorFilter(i);
        ((ImageView) view.findViewById(xxb.row_setting_brightness__iv_brigthness_high)).setColorFilter(i);
    }
}
