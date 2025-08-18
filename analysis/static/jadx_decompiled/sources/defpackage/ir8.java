package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class ir8 {
    public final Context a;
    public final wq8 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public nr8 i;
    public gr8 j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final hr8 l = new hr8(0, this);

    public ir8(int i, int i2, wq8 wq8Var, Context context, View view, boolean z) {
        this.a = context;
        this.b = wq8Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final gr8 a() {
        gr8 yxdVar;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(xtb.abc_cascading_menus_min_smallest_width)) {
                yxdVar = new zz1(this.a, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                int i = this.e;
                boolean z = this.c;
                Context context2 = this.a;
                yxdVar = new yxd(this.d, i, this.b, context2, view, z);
            }
            yxdVar.l(this.b);
            yxdVar.r(this.l);
            yxdVar.n(this.f);
            yxdVar.g(this.i);
            yxdVar.o(this.h);
            yxdVar.p(this.g);
            this.j = yxdVar;
        }
        return this.j;
    }

    public final boolean b() {
        gr8 gr8Var = this.j;
        return gr8Var != null && gr8Var.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        gr8 gr8VarA = a();
        gr8VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            gr8VarA.q(i);
            gr8VarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            gr8VarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        gr8VarA.f();
    }
}
