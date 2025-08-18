package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n12 extends z1f {
    public boolean a = false;
    public final ViewGroup b;

    public n12(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.z1f, defpackage.v1f
    public final void b() {
        gnf.b(this.b, false);
    }

    @Override // defpackage.z1f, defpackage.v1f
    public final void c(w1f w1fVar) {
        if (!this.a) {
            gnf.b(this.b, false);
        }
        w1fVar.D(this);
    }

    @Override // defpackage.z1f, defpackage.v1f
    public final void f() {
        gnf.b(this.b, true);
    }

    @Override // defpackage.z1f, defpackage.v1f
    public final void g(w1f w1fVar) {
        gnf.b(this.b, false);
        this.a = true;
    }
}
