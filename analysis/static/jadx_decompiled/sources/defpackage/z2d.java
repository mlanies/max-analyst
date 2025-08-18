package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class z2d extends ppc {
    public final y2d s0;
    public final ow0 t0;
    public final x2d u0;
    public final byte[] v0;
    public final ix0 w0;

    public z2d(y2d y2dVar, ow0 ow0Var, x2d x2dVar, byte[] bArr) {
        this.s0 = y2dVar;
        this.t0 = ow0Var;
        this.u0 = x2dVar;
        this.v0 = bArr;
        this.w0 = new ix0(ow0Var, y2dVar.b, bArr, x2dVar);
    }

    @Override // defpackage.ppc
    public final void b() {
        this.w0.j = true;
    }

    @Override // defpackage.ppc
    public final Object c() throws IOException {
        this.w0.a();
        x2d x2dVar = this.u0;
        if (x2dVar == null) {
            return null;
        }
        x2dVar.X++;
        ((ro4) x2dVar.a).b(x2dVar.b(), x2dVar.b, x2dVar.o);
        return null;
    }
}
