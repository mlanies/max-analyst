package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class c05 extends gf {
    public final View l;
    public final Rect m;
    public int n;
    public int o;
    public int p;
    public boolean q;

    public c05(ni0 ni0Var, View view) {
        super(ni0Var, new x27(0, null, 3), 1, null, 56);
        this.l = view;
        this.m = new Rect();
    }

    @Override // defpackage.gf
    public final void g(x6g x6gVar, l7b l7bVar) {
        v6g v6gVar = x6gVar.a;
        int i = v6gVar.f(8).d;
        int i2 = v6gVar.f(7).d;
        boolean z = i == 0;
        int i3 = ((v27) l7bVar.c).d;
        this.p = i3;
        Rect rect = this.m;
        this.o = Math.abs(((this.a.getHeight() + ((z ? (rect.bottom + i2) - i3 : (rect.bottom + i3) - i2) - rect.top)) / 2) - this.n);
    }

    @Override // defpackage.gf
    public final x6g h(x6g x6gVar) {
        if (this.q) {
            return x6gVar;
        }
        v6g v6gVar = x6gVar.a;
        v27 v27VarF = v6gVar.f(this.j);
        v27 v27VarF2 = v6gVar.f(this.d);
        v27 v27VarB = v27.b(v27VarF.a - v27VarF2.a, v27VarF.b - v27VarF2.b, v27VarF.c - v27VarF2.c, v27VarF.d - v27VarF2.d);
        this.a.setTranslationY((v27.b(Math.max(v27VarB.a, 0), Math.max(v27VarB.b, 0), Math.max(v27VarB.c, 0), Math.max(v27VarB.d, 0)).d / (this.p - r0)) * this.o);
        return x6gVar;
    }

    @Override // defpackage.gf
    public final void i() {
        this.a.setTranslationY(0.0f);
        this.q = false;
    }

    @Override // defpackage.gf
    public final void j() {
        this.l.getGlobalVisibleRect(this.m);
        this.n = this.a.getBottom();
    }
}
