package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class b9e implements dad {
    public final /* synthetic */ c9e a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o9f d;
    public final /* synthetic */ vb0 e;
    public final /* synthetic */ vb0 f;

    public /* synthetic */ b9e(c9e c9eVar, String str, String str2, o9f o9fVar, vb0 vb0Var, vb0 vb0Var2) {
        this.a = c9eVar;
        this.b = str;
        this.c = str2;
        this.d = o9fVar;
        this.e = vb0Var;
        this.f = vb0Var2;
    }

    @Override // defpackage.dad
    public final void a(fad fadVar) {
        c9e c9eVar = this.a;
        if (c9eVar.c() == null) {
            return;
        }
        c9eVar.F();
        c9eVar.E(c9eVar.G(this.b, this.c, this.d, this.e, this.f));
        c9eVar.q();
        aqf aqfVar = c9eVar.q;
        aqfVar.getClass();
        kq0.e();
        Iterator it = aqfVar.a.iterator();
        while (it.hasNext()) {
            aqfVar.c((l9f) it.next());
        }
    }
}
