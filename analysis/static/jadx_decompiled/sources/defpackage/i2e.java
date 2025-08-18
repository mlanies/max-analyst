package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class i2e extends FrameLayout {
    public final ey1 a;
    public f4e b;
    public z2e c;

    public i2e(Context context) {
        super(context, null);
        ey1 ey1Var = new ey1(context);
        this.a = ey1Var;
        setClipToPadding(false);
        addView((OneMeDraweeView) ey1Var.b, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(z2e z2eVar) {
        z2e z2eVar2 = this.c;
        boolean z = true;
        if (z2eVar2 != null) {
            if (z2eVar2.s0 == z2eVar.s0 && z2eVar2.t0 == z2eVar.t0) {
                z = false;
            }
        }
        this.c = z2eVar;
        f4e f4eVar = this.b;
        if (f4eVar != null) {
            f4eVar.b(z2eVar);
        }
        String str = z2eVar.o;
        ey1 ey1Var = this.a;
        ey1Var.getClass();
        wv6 wv6VarB = wv6.b(str);
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) ey1Var.b;
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.o(wv6VarB, null);
        oneMeDraweeView.setVisibility(0);
        if (z) {
            requestLayout();
        }
    }

    public final f4e getSizeConfigurator() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        f4e f4eVar = this.b;
        jt jtVarA = f4eVar != null ? f4eVar.a(i, i2) : null;
        if (jtVarA != null) {
            i = jtVarA.b;
        }
        if (jtVarA != null) {
            i2 = jtVarA.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(f4e f4eVar) {
        this.b = f4eVar;
    }
}
