package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class m4e extends ppd {
    public final Executor X;
    public final ad7 Y;
    public gw7 Z;
    public final rxd s0;
    public final o9g t0;

    public m4e(ExecutorService executorService, ad7 ad7Var) {
        super(executorService);
        this.X = executorService;
        this.Y = ad7Var;
        this.s0 = new rxd(29, new y8(this));
        this.t0 = new o9g(26, this);
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        return ((ol7) C(i)).getI0();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i != jca.r) {
            if (i == tga.k) {
                return new b02(viewGroup.getContext(), new e09(0, this.Y, ad7.class, "onRecentClearClick", "onRecentClearClick()V", 0, 11));
            }
            if (i != tga.l) {
                return rxd.V(this.s0, viewGroup.getContext(), i);
            }
            return new vt3(viewGroup.getContext(), this.Z, (ExecutorService) this.X, this.t0);
        }
        Context context = viewGroup.getContext();
        e09 e09Var = new e09(0, this.Y, ad7.class, "onFakeSearchClick", "onFakeSearchClick()V", 0, 10);
        TextView textView = new TextView(context);
        textView.setId(jca.e);
        int iG = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setClipToOutline(true);
        textView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 10.0f));
        textView.setText(context.getString(yoc.x0));
        Drawable drawableB = kt3.b(context, yfa.r);
        ArrayList arrayList = qqe.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(tu0.G(8 * fk4.d().getDisplayMetrics().density));
        textView.setPadding(iG2, iG, iG2, iG);
        i4f.l.b(textView, du4.b);
        v3c.y(new v9(3, null, 26), textView);
        tu0.K(textView, 300L, new m6(26, e09Var));
        return new az0(textView, 18);
    }
}
