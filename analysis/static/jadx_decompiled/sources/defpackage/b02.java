package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b02 extends hqd {
    public final k56 F0;
    public final FrameLayout G0;
    public final AppCompatTextView H0;
    public final khe I0;

    public b02(Context context, k56 k56Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(tu0.G(30 * fk4.d().getDisplayMetrics().density));
        super(frameLayout);
        this.F0 = k56Var;
        this.G0 = frameLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(jca.m);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        appCompatTextView.setLayoutParams(layoutParams);
        i4f.o.b(appCompatTextView, du4.b);
        v3c.y(new br(3, (Continuation) null, 3), appCompatTextView);
        this.H0 = appCompatTextView;
        this.I0 = new khe(new a5(context, 25));
        frameLayout.addView(appCompatTextView);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        if (ol7Var instanceof f02) {
            AppCompatTextView appCompatTextView = this.H0;
            f02 f02Var = (f02) ol7Var;
            appCompatTextView.setText(f02Var.getName().b(appCompatTextView.getContext()));
            boolean zR = f02Var.r();
            khe kheVar = this.I0;
            if (zR) {
                ay7.b(this.G0, (View) kheVar.getValue(), -1);
                ((View) kheVar.getValue()).setVisibility(0);
                tu0.K((View) kheVar.getValue(), 300L, new c5(14, this));
            } else if (kheVar.a()) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) kheVar.getValue();
                appCompatImageView.setVisibility(8);
                appCompatImageView.setOnClickListener(null);
            }
        }
    }
}
