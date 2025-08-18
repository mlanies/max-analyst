package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class x1f implements v1f {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ y1f c;

    public x1f(y1f y1fVar, ViewGroup viewGroup, gwe gweVar) {
        this.c = y1fVar;
        this.a = viewGroup;
        this.b = gweVar;
    }

    @Override // defpackage.v1f
    public final void a(w1f w1fVar) {
        this.a.removeCallbacks(this.b);
    }

    @Override // defpackage.v1f
    public final void b() {
    }

    @Override // defpackage.v1f
    public final void c(w1f w1fVar) {
        y1f y1fVar = this.c;
        y1fVar.Y.q();
        y1fVar.Y = null;
    }

    @Override // defpackage.v1f
    public final void f() {
    }

    @Override // defpackage.v1f
    public final void g(w1f w1fVar) {
        y1f y1fVar = this.c;
        y1fVar.Y.q();
        y1fVar.Y = null;
    }
}
