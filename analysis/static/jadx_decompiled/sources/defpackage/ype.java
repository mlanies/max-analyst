package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ru.ok.messages.settings.FrgBaseSettings;

/* loaded from: classes2.dex */
public final class ype extends jcd {
    public final TextView P0;

    public ype(ViewGroup viewGroup, LayoutInflater layoutInflater, FrgBaseSettings frgBaseSettings) {
        super(viewGroup, frgBaseSettings);
        TextView textView = (TextView) layoutInflater.inflate(yyb.row_setting_text, viewGroup, false);
        this.P0 = textView;
        Context context = textView.getContext();
        khe kheVar = sme.a0;
        textView.setTextColor(fm9.R(context).F);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(xxb.row_setting__fl_value);
        frameLayout.addView(textView);
        frameLayout.setVisibility(0);
    }

    @Override // defpackage.jcd
    public final void A(gcd gcdVar, boolean z) {
        super.A(gcdVar, z);
        Object obj = gcdVar.X;
        TextView textView = this.P0;
        if (obj == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText((String) obj);
        }
    }
}
