package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w2d extends ppc {
    public final /* synthetic */ t24 s0;
    public final /* synthetic */ a34 t0;
    public final /* synthetic */ a3d u0;

    public w2d(a3d a3dVar, ow0 ow0Var, a34 a34Var) {
        this.u0 = a3dVar;
        this.s0 = ow0Var;
        this.t0 = a34Var;
    }

    @Override // defpackage.ppc
    public final Object c() throws IOException {
        zpa zpaVar = this.u0.b;
        t24 t24Var = this.s0;
        u1e u1eVar = new u1e(t24Var);
        yn7.b.getAndIncrement();
        u1eVar.b = 0L;
        w24 w24Var = new w24(u1eVar, this.t0);
        try {
            w24Var.m();
            Uri uri = t24Var.getUri();
            uri.getClass();
            Object objA = zpaVar.a(uri, w24Var);
            oaf.h(w24Var);
            objA.getClass();
            return (ok5) objA;
        } catch (Throwable th) {
            oaf.h(w24Var);
            throw th;
        }
    }
}
