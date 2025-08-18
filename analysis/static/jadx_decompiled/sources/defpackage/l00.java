package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class l00 extends dq7 {
    public die Y;

    @Override // defpackage.dq7
    public final void a() {
        super.a();
        die dieVar = this.Y;
        if (dieVar != null) {
            cqc.b((sd7) dieVar.o);
        }
        this.Y = null;
    }

    @Override // defpackage.dq7
    public final void c() {
        Uri uri;
        p4d p4dVar = this.b;
        up7 up7Var = this.X;
        awa awaVarE = p4dVar.e(up7Var);
        if (awaVarE == null) {
            uri = Uri.parse(up7Var.o);
        } else {
            uri = awaVarE.b;
            if (uri == null && (uri = awaVarE.a) == null) {
                uri = Uri.parse(up7Var.o);
            }
        }
        this.a.N(up7Var, uri, 0, awaVarE != null ? awaVarE.X : null);
    }
}
