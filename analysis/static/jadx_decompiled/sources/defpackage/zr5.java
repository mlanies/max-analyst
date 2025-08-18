package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zr5 extends wq5 {
    public final Object b;
    public final b66 c;

    public zr5(Object obj, dme dmeVar) {
        this.b = obj;
        this.c = dmeVar;
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        try {
            Object objMo131apply = this.c.mo131apply(this.b);
            Objects.requireNonNull(objMo131apply, "The mapper returned a null Publisher");
            ypb ypbVar = (ypb) objMo131apply;
            if (!(ypbVar instanceof kde)) {
                ((wq5) ypbVar).d(vaeVar);
                return;
            }
            try {
                Object obj = ((kde) ypbVar).get();
                if (obj == null) {
                    b05.a(vaeVar);
                } else {
                    vaeVar.f(new lsc(vaeVar, obj));
                }
            } catch (Throwable th) {
                c37.B(th);
                b05.b(th, vaeVar);
            }
        } catch (Throwable th2) {
            c37.B(th2);
            b05.b(th2, vaeVar);
        }
    }
}
