package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class gf extends g1e {
    public final int j;
    public int k;

    public gf(View view, x27 x27Var, int i, m56 m56Var, int i2) {
        super(view, x27Var, (i2 & 16) != 0 ? null : m56Var, 7);
        this.j = 8;
        this.k = -1;
        zmf.l(view, new ff(i, this));
    }

    public static final x6g f(gf gfVar, x6g x6gVar) {
        if (gfVar.f == 0) {
            return x6gVar;
        }
        v27 v27VarF = x6gVar.a.f(7);
        if (v27VarF.d > gfVar.f) {
            return x6gVar;
        }
        o6g n6gVar = Build.VERSION.SDK_INT >= 30 ? new n6g(x6gVar) : new m6g(x6gVar);
        n6gVar.c(7, v27.b(v27VarF.a, v27VarF.b, v27VarF.c, gfVar.f));
        return n6gVar.b();
    }

    @Override // defpackage.g1e
    public final void b(x6g x6gVar, yq0 yq0Var) {
        v6g v6gVar = x6gVar.a;
        v27 v27VarF = v6gVar.f(this.d);
        int i = this.j;
        v27 v27VarF2 = v6gVar.f(i);
        if (v6gVar.o(i)) {
            v27VarF = v27VarF2;
        }
        a(v27VarF, yq0Var);
    }

    @Override // defpackage.g1e
    public final void c(x6g x6gVar) {
        if (this.k != -1) {
            o6g n6gVar = Build.VERSION.SDK_INT >= 30 ? new n6g(x6gVar) : new m6g(x6gVar);
            n6gVar.c(8, v27.e);
            n6gVar.h(8, false);
            x6gVar = n6gVar.b();
        }
        super.c(x6gVar);
    }

    @Override // defpackage.g1e
    public final x6g d(x6g x6gVar) {
        return x6gVar;
    }

    @Override // defpackage.g1e
    public final void e() {
        this.g = false;
        View view = this.a;
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new ef(view, 0));
        } else {
            WeakHashMap weakHashMap = zmf.a;
            mmf.c(view);
        }
    }

    public void g(x6g x6gVar, l7b l7bVar) {
    }

    public abstract x6g h(x6g x6gVar);

    public abstract void i();

    public void j() {
    }
}
