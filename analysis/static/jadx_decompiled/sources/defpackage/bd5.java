package defpackage;

import java.io.File;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class bd5 implements kde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bd5(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.c = obj;
        this.b = serializable;
    }

    @Override // defpackage.kde
    public final Object get() {
        switch (this.a) {
            case 0:
                dd5 dd5Var = (dd5) this.c;
                dd5Var.getClass();
                return dd5Var.a(new u24(dd5Var, 3, (long[]) this.b));
            case 1:
                hd5 hd5Var = (hd5) this.c;
                hd5Var.getClass();
                xrd xrdVar = new xrd();
                hd5Var.f.put(Long.valueOf(((k4a) hd5Var.a).f(4, (long[]) this.b)), xrdVar);
                return xrdVar;
            default:
                oke okeVar = (oke) this.c;
                ame ameVar = (ame) okeVar.b.getValue();
                ((p7b) ((m7b) okeVar.c.getValue())).b.getClass();
                ztc ztcVarB = ((jle) ((hle) okeVar.X.getValue())).b();
                ameVar.getClass();
                return new dq6((khe) ameVar.a, (File) this.b, ztcVarB);
        }
    }
}
