package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class iw7 extends FrameLayout {
    public final ey1 a;
    public final dw7 b;
    public boolean c;
    public boolean o;
    public f4e s0;

    public iw7(Context context) {
        super(context, null);
        ey1 ey1Var = new ey1(context);
        this.a = ey1Var;
        dw7 dw7Var = new dw7(context, null);
        dw7Var.setId(tga.b);
        dw7Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = dw7Var;
        addView((OneMeDraweeView) ey1Var.b);
        addView(dw7Var);
    }

    public final void a(z2e z2eVar, int i) throws InterruptedException, IOException {
        f4e f4eVar = this.s0;
        if (f4eVar != null) {
            f4eVar.b(z2eVar);
        }
        String str = z2eVar.X;
        ey1 ey1Var = this.a;
        dw7 dw7Var = this.b;
        if (str == null || str.length() == 0) {
            dw7Var.c();
            dw7Var.setVisibility(8);
            ((OneMeDraweeView) ey1Var.b).setVisibility(0);
        } else {
            dw7Var.setAutoRepeat(true);
            dw7Var.setOnFirstFrameListener(new z16(15, this));
            dw7Var.setFailureListener(new kp7(4));
            dw7Var.setVisibility(0);
            this.c = true;
            boolean zF = dw7Var.f(i, i, str);
            this.c = false;
            z = zF && !this.o;
            this.o = false;
        }
        if (z) {
            ey1Var.getClass();
            wv6 wv6VarB = wv6.b(z2eVar.o);
            OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) ey1Var.b;
            int i2 = OneMeDraweeView.B0;
            oneMeDraweeView.o(wv6VarB, null);
            oneMeDraweeView.setVisibility(0);
        }
    }

    public final void b(gw7 gw7Var) {
        if (gw7Var.a == null) {
            gw7Var.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = gw7Var.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final f4e getSizeConfigurator() {
        return this.s0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        f4e f4eVar = this.s0;
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
        this.s0 = f4eVar;
    }
}
