package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class bsb extends FrameLayout {
    public final int a;
    public final OneMeDraweeView b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;

    public bsb(Context context) {
        super(context);
        this.a = 40;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 4.0f));
        this.b = oneMeDraweeView;
        this.c = tu0.r(3, new xda(context, 15));
        this.o = tu0.r(3, new zja(context, 9, this));
        this.s0 = tu0.r(3, new lwa(8, this));
        addView(oneMeDraweeView);
    }

    @Override // android.view.ViewGroup
    public final void measureChildren(int i, int i2) {
        this.b.measure(i, i2);
        je7 je7Var = this.o;
        if (je7Var.a()) {
            ((View) je7Var.getValue()).measure(i, i2);
        }
    }

    public final void setDrawOverlay(boolean z) {
        OneMeDraweeView oneMeDraweeView = this.b;
        if (z) {
            ((la6) oneMeDraweeView.getHierarchy()).k((Drawable) this.s0.getValue());
        } else {
            ((la6) oneMeDraweeView.getHierarchy()).k(null);
        }
    }
}
