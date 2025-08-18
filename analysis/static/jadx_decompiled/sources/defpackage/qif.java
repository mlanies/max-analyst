package defpackage;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class qif implements tj3 {
    public final kee a;
    public final /* synthetic */ sif b;

    public qif(sif sifVar, kee keeVar) {
        this.b = sifVar;
        this.a = keeVar;
    }

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        zb0 zb0Var = (zb0) obj;
        String str = this.b.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, zr6.h(zb0Var.a, "onOutputSurface close event="), null);
        }
        this.b.e();
        this.a.close();
        Surface surface = (Surface) this.b.Z.remove(this.a);
        if (surface != null) {
            fjf fjfVar = this.b.u0;
            if (fjfVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            o76.d((AtomicBoolean) fjfVar.c, true);
            o76.c((Thread) fjfVar.e);
            fjfVar.s(surface, true);
        }
    }
}
