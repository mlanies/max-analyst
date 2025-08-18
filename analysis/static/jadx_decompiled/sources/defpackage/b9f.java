package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class b9f implements bb3, d38 {
    public final /* synthetic */ c9f a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ b9f(c9f c9fVar, d7f d7fVar) {
        this.a = c9fVar;
        this.b = d7fVar;
    }

    @Override // defpackage.bb3
    public void b(ra3 ra3Var) {
        ((Map) this.a.b).remove(this.b);
        ra3Var.b();
    }

    @Override // defpackage.d38
    public void d(j28 j28Var) {
        v6f v6fVar = (v6f) ((Map) this.a.b).get(this.b);
        if (v6fVar != null) {
            if (j28Var.h()) {
                return;
            }
            j28Var.a(v6fVar);
        } else {
            if (j28Var.h()) {
                return;
            }
            j28Var.b();
        }
    }
}
