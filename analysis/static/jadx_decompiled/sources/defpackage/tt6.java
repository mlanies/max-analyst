package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class tt6 implements h06 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.h06
    public final void a(ov6 ov6Var) {
        h06 h06Var;
        switch (this.a) {
            case 0:
                vt6 vt6Var = (vt6) ((WeakReference) ((ut6) this.b).X).get();
                if (vt6Var != null) {
                    vt6Var.y0.execute(new nn6(2, vt6Var));
                    return;
                }
                return;
            default:
                hqc hqcVar = (hqc) this.b;
                synchronized (hqcVar.a) {
                    try {
                        int i = hqcVar.b - 1;
                        hqcVar.b = i;
                        if (hqcVar.c && i == 0) {
                            hqcVar.close();
                        }
                        h06Var = hqcVar.Y;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (h06Var != null) {
                    h06Var.a(ov6Var);
                    return;
                }
                return;
        }
    }
}
