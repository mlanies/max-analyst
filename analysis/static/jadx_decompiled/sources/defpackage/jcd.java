package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ru.ok.messages.settings.FrgBaseSettings;

/* loaded from: classes2.dex */
public class jcd extends dec {
    public final bk4 F0;
    public final ImageView G0;
    public final TextView H0;
    public final TextView I0;
    public final TextView J0;
    public final View K0;
    public final View L0;
    public gcd M0;
    public final FrgBaseSettings N0;
    public final sme O0;

    public jcd(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        vl vlVar = vl.o;
        this.F0 = bk4.b();
        Context context = view.getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        this.O0 = smeVarR;
        view.setBackground(hm9.L(0, smeVarR.i));
        ImageView imageView = (ImageView) view.findViewById(xxb.row_setting__iv_icon);
        this.G0 = imageView;
        if (imageView != null) {
            imageView.setColorFilter(smeVarR.w);
        }
        TextView textView = (TextView) view.findViewById(xxb.row_setting__tv_title);
        this.H0 = textView;
        if (textView != null) {
            textView.setTextColor(smeVarR.k);
        }
        TextView textView2 = (TextView) view.findViewById(xxb.row_setting__tv_subtitle);
        this.I0 = textView2;
        int i = smeVarR.M;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        TextView textView3 = (TextView) view.findViewById(xxb.row_setting__tv_description);
        this.J0 = textView3;
        if (textView3 != null) {
            textView3.setTextColor(i);
        }
        View viewFindViewById = view.findViewById(xxb.row_setting__separator);
        this.K0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(smeVarR.H);
        }
        View viewFindViewById2 = view.findViewById(xxb.row_setting__small_separator);
        this.L0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setBackgroundColor(smeVarR.K);
        }
        this.N0 = frgBaseSettings;
        if (frgBaseSettings != null) {
            view.setOnClickListener(new elb(4, this));
        }
    }

    public void A(gcd gcdVar, boolean z) {
        this.M0 = gcdVar;
        gcdVar.getClass();
        View view = this.a;
        view.setEnabled(true);
        view.setAlpha(1.0f);
        ImageView imageView = this.G0;
        if (imageView != null) {
            this.M0.getClass();
            imageView.setVisibility(8);
        }
        TextView textView = this.H0;
        if (textView != null) {
            textView.setText(this.M0.b);
            this.M0.getClass();
            textView.setEnabled(true);
            this.M0.getClass();
            int i = this.M0.Y;
            sme smeVar = this.O0;
            if (i == 3) {
                textView.setTextColor(smeVar.k);
            } else {
                textView.setTextColor(smeVar.F);
            }
            this.M0.getClass();
            textView.setTypeface(null, 0);
            this.M0.getClass();
            textView.setSingleLine(false);
            textView.setMaxLines(999);
        }
        TextView textView2 = this.I0;
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.M0.c)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.M0.c);
                textView2.setVisibility(0);
            }
        }
        View view2 = this.K0;
        if (view2 != null) {
            view2.setVisibility(this.M0.Z ? 0 : 8);
        }
        View view3 = this.L0;
        if (view3 != null) {
            view3.setVisibility(!this.M0.Z ? 0 : 8);
            j47.V(view3, z ? 0 : this.F0.o);
        }
        TextView textView3 = this.J0;
        if (textView3 != null) {
            if (TextUtils.isEmpty(this.M0.o)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(this.M0.o);
                textView3.setVisibility(0);
            }
        }
        int i2 = this.M0.Y;
    }
}
