package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class z8f implements bb3, d38 {
    public final /* synthetic */ a9f a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ z8f(a9f a9fVar, d7f d7fVar) {
        this.a = a9fVar;
        this.b = d7fVar;
    }

    @Override // defpackage.bb3
    public void b(ra3 ra3Var) {
        a9f a9fVar = this.a;
        d7f d7fVar = this.b;
        a9fVar.getClass();
        hm9.n("a9f", "removeUpload: upload=" + d7fVar);
        synchronized (a9fVar) {
            a9fVar.a.c(d7fVar).e(((y8f) a9fVar.b.getValue()).c(d7fVar)).a();
        }
        if (ra3Var.h()) {
            return;
        }
        ra3Var.b();
    }

    @Override // defpackage.d38
    public void d(j28 j28Var) {
        v6f v6fVar;
        a9f a9fVar = this.a;
        d7f d7fVar = this.b;
        a9fVar.getClass();
        hm9.n("a9f", "getUpload: upload=" + d7fVar);
        synchronized (a9fVar) {
            try {
                v6fVar = (v6f) a9fVar.a.d(d7fVar).b();
            } catch (Exception unused) {
                v6fVar = null;
            }
        }
        if (v6fVar == null) {
            try {
                f28 f28VarD = ((y8f) a9fVar.b.getValue()).d(d7fVar);
                c9f c9fVar = a9fVar.a;
                Objects.requireNonNull(c9fVar);
                v6fVar = (v6f) new e38(f28VarD, new gte(8, c9fVar), ft.e, ft.d).b();
            } catch (Exception unused2) {
            }
        }
        if (j28Var.h()) {
            return;
        }
        if (v6fVar == null) {
            j28Var.b();
        } else {
            j28Var.a(v6fVar);
        }
    }
}
