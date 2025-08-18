package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.settings.view.LedSeekBar;

/* loaded from: classes2.dex */
public final class we7 extends dec {
    public final LedSeekBar F0;
    public final FrgBaseSettings G0;
    public final SwitchCompat H0;
    public final View I0;
    public final View J0;
    public final TextView K0;
    public gcd L0;

    public we7(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        Context context = view.getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        this.G0 = frgBaseSettings;
        LedSeekBar ledSeekBar = (LedSeekBar) view.findViewById(xxb.row_setting_led__ls_seekbar);
        this.F0 = ledSeekBar;
        TextView textView = (TextView) view.findViewById(xxb.row_setting_led__title);
        this.K0 = textView;
        textView.setTextColor(smeVarR.F);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(xxb.row_setting_led__cb_check);
        this.H0 = switchCompat;
        ngg.h(smeVarR, switchCompat);
        View viewFindViewById = view.findViewById(xxb.row_setting__separator);
        this.I0 = viewFindViewById;
        viewFindViewById.setBackgroundColor(smeVarR.H);
        view.findViewById(xxb.row_setting_led__separator_small).setBackgroundColor(smeVarR.K);
        this.J0 = view.findViewById(xxb.row_setting_led__ll_led_container);
        ledSeekBar.setListener(new d74(this, 19, frgBaseSettings));
        view.findViewById(xxb.row_setting_led__ll_root).setOnClickListener(new xx5(9, this));
    }
}
