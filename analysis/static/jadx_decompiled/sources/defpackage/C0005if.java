package defpackage;

/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0005if extends gf {
    @Override // defpackage.gf
    public final x6g h(x6g x6gVar) {
        v6g v6gVar = x6gVar.a;
        v27 v27VarF = v6gVar.f(this.j);
        v27 v27VarF2 = v6gVar.f(this.d);
        v27 v27VarB = v27.b(v27VarF.a - v27VarF2.a, v27VarF.b - v27VarF2.b, v27VarF.c - v27VarF2.c, v27VarF.d - v27VarF2.d);
        v27 v27VarB2 = v27.b(Math.max(v27VarB.a, 0), Math.max(v27VarB.b, 0), Math.max(v27VarB.c, 0), Math.max(v27VarB.d, 0));
        this.a.setTranslationY(v27VarB2.b - v27VarB2.d);
        return x6gVar;
    }

    @Override // defpackage.gf
    public final void i() {
        this.a.setTranslationY(0.0f);
    }
}
