package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class w6c implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ y6c a;
    public final /* synthetic */ dec b;
    public final /* synthetic */ long c;
    public final /* synthetic */ v6c o;

    public w6c(View view, y6c y6cVar, dec decVar, long j, v6c v6cVar, boolean z) {
        this.a = y6cVar;
        this.b = decVar;
        this.c = j;
        this.o = v6cVar;
        this.X = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.f(this.b.h())) {
            return;
        }
        this.a.f.remove(Long.valueOf(this.c));
        this.a.e.remove(this.o);
        View viewFindViewById = this.b.a.findViewById(this.o.c.a.toString().hashCode());
        Rect rectC = y6c.c(this.a, viewFindViewById);
        if (rectC == null) {
            return;
        }
        String str = this.a.d;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Play pending reaction effect, by place:" + rectC + ", onCreation:" + this.X, null);
        }
        y6c y6cVar = this.a;
        v6c v6cVar = this.o;
        y6c.d(y6cVar, v6cVar.b, v6cVar.a, rectC);
        if (this.X) {
            this.b.a.addOnLayoutChangeListener(new x6c(this.a, viewFindViewById, this.c));
        }
    }
}
