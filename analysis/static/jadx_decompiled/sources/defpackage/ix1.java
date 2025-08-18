package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ix1 extends vj0 {
    public final p54 C0;
    public final wpa D0;
    public long E0;
    public q75 F0;
    public long G0;

    public ix1() {
        super(6);
        this.C0 = new p54(1);
        this.D0 = new wpa();
    }

    @Override // defpackage.vj0
    public final int D(qy5 qy5Var) {
        return "application/x-camera-motion".equals(qy5Var.n) ? vj0.b(4, 0, 0, 0) : vj0.b(0, 0, 0, 0);
    }

    @Override // defpackage.vj0, defpackage.q4b
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.F0 = (q75) obj;
        }
    }

    @Override // defpackage.vj0
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.vj0
    public final boolean m() {
        return l();
    }

    @Override // defpackage.vj0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.vj0
    public final void p() {
        q75 q75Var = this.F0;
        if (q75Var != null) {
            q75Var.c();
        }
    }

    @Override // defpackage.vj0
    public final void r(long j, boolean z) {
        this.G0 = Long.MIN_VALUE;
        q75 q75Var = this.F0;
        if (q75Var != null) {
            q75Var.c();
        }
    }

    @Override // defpackage.vj0
    public final void x(qy5[] qy5VarArr, long j, long j2) {
        this.E0 = j2;
    }

    @Override // defpackage.vj0
    public final void z(long j, long j2) {
        float[] fArr;
        while (!l() && this.G0 < 100000 + j) {
            p54 p54Var = this.C0;
            p54Var.v();
            y7g y7gVar = this.c;
            y7gVar.t();
            if (y(y7gVar, p54Var, 0) != -4 || p54Var.f(4)) {
                return;
            }
            long j3 = p54Var.Z;
            this.G0 = j3;
            boolean z = j3 < this.w0;
            if (this.F0 != null && !z) {
                p54Var.y();
                ByteBuffer byteBuffer = p54Var.X;
                int i = oaf.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    wpa wpaVar = this.D0;
                    wpaVar.E(iLimit, bArrArray);
                    wpaVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(wpaVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.F0.b(this.G0 - this.E0, fArr);
                }
            }
        }
    }
}
