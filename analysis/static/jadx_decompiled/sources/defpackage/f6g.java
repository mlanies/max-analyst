package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f6g implements View.OnApplyWindowInsetsListener {
    public final q42 a;
    public x6g b;

    public f6g(View view, q42 q42Var) {
        x6g x6gVarB;
        this.a = q42Var;
        WeakHashMap weakHashMap = zmf.a;
        x6g x6gVarA = pmf.a(view);
        if (x6gVarA != null) {
            x6gVarB = (Build.VERSION.SDK_INT >= 30 ? new n6g(x6gVarA) : new m6g(x6gVarA)).b();
        } else {
            x6gVarB = null;
        }
        this.b = x6gVarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v6g v6gVar;
        if (!view.isLaidOut()) {
            this.b = x6g.f(view, windowInsets);
            return g6g.i(view, windowInsets);
        }
        x6g x6gVarF = x6g.f(view, windowInsets);
        if (this.b == null) {
            WeakHashMap weakHashMap = zmf.a;
            this.b = pmf.a(view);
        }
        if (this.b == null) {
            this.b = x6gVarF;
            return g6g.i(view, windowInsets);
        }
        q42 q42VarJ = g6g.j(view);
        if (q42VarJ != null && Objects.equals((WindowInsets) q42VarJ.b, windowInsets)) {
            return g6g.i(view, windowInsets);
        }
        x6g x6gVar = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            v6gVar = x6gVarF.a;
            if (i > 256) {
                break;
            }
            if (!v6gVar.f(i).equals(x6gVar.a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return g6g.i(view, windowInsets);
        }
        x6g x6gVar2 = this.b;
        k6g k6gVar = new k6g(i2, (i2 & 8) != 0 ? v6gVar.f(8).d > x6gVar2.a.f(8).d ? g6g.e : g6g.f : g6g.g, 160L);
        k6gVar.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(k6gVar.a.a());
        v27 v27VarF = v6gVar.f(i2);
        v27 v27VarF2 = x6gVar2.a.f(i2);
        int iMin = Math.min(v27VarF.a, v27VarF2.a);
        int i3 = v27VarF.b;
        int i4 = v27VarF2.b;
        int iMin2 = Math.min(i3, i4);
        int i5 = v27VarF.c;
        int i6 = v27VarF2.c;
        int iMin3 = Math.min(i5, i6);
        int i7 = v27VarF.d;
        int i8 = i2;
        int i9 = v27VarF2.d;
        l7b l7bVar = new l7b(v27.b(iMin, iMin2, iMin3, Math.min(i7, i9)), v27.b(Math.max(v27VarF.a, v27VarF2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)), false, 16);
        g6g.f(view, k6gVar, windowInsets, false);
        duration.addUpdateListener(new e6g(k6gVar, x6gVarF, x6gVar2, i8, view));
        duration.addListener(new eh(k6gVar, 6, view));
        pla.a(view, new r8g(6, view, k6gVar, l7bVar, duration, false));
        this.b = x6gVarF;
        return g6g.i(view, windowInsets);
    }
}
