package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a75 implements mgc {
    public final g03 a = new g03(15);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final u43 e;
    public final int f;
    public final wt g;

    public a75(boolean z, boolean z2, boolean z3, glc glcVar, int i, wt wtVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = glcVar;
        this.f = i;
        this.g = wtVar;
    }

    @Override // defpackage.mgc
    public final vj0[] a(Handler handler, o75 o75Var, o75 o75Var2, o75 o75Var3, o75 o75Var4) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        u43 u43Var = this.e;
        if (!z) {
            arrayList.add(new i65((glc) u43Var, this.a, this.g));
        }
        if (!this.c) {
            int i = this.f;
            arrayList.add(new k65(this.d, (glc) u43Var, i, this.a, this.g));
        }
        return (vj0[]) arrayList.toArray(new vj0[arrayList.size()]);
    }
}
