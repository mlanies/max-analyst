package androidx.loader.app;

import defpackage.kvd;
import defpackage.mo7;
import defpackage.no7;
import defpackage.qnf;
import defpackage.rgg;

/* loaded from: classes.dex */
class LoaderManagerImpl$LoaderViewModel extends qnf {
    public static final a d = new a();
    public final kvd b = new kvd();
    public boolean c = false;

    @Override // defpackage.qnf
    public final void d() {
        kvd kvdVar = this.b;
        int i = kvdVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            mo7 mo7Var = (mo7) kvdVar.b[i2];
            rgg rggVar = mo7Var.n;
            rggVar.a();
            rggVar.d = true;
            no7 no7Var = mo7Var.p;
            if (no7Var != null) {
                mo7Var.j(no7Var);
                if (no7Var.b) {
                    no7Var.a.getClass();
                }
            }
            mo7 mo7Var2 = rggVar.b;
            if (mo7Var2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (mo7Var2 != mo7Var) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            rggVar.b = null;
            if (no7Var != null) {
                boolean z = no7Var.b;
            }
            rggVar.e = true;
            rggVar.c = false;
            rggVar.d = false;
            rggVar.f = false;
        }
        int i3 = kvdVar.c;
        Object[] objArr = kvdVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        kvdVar.c = 0;
    }
}
