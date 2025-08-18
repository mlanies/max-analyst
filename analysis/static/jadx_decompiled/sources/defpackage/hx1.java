package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class hx1 extends uj0 {
    public gx1 A0;
    public long B0;
    public final o54 x0;
    public final yaf y0;
    public long z0;

    public hx1() {
        super(6);
        this.x0 = new o54(1);
        this.y0 = new yaf(3, false);
    }

    @Override // defpackage.uj0
    public final int A(oy5 oy5Var) {
        return "application/x-camera-motion".equals(oy5Var.w0) ? uj0.b(4, 0, 0) : uj0.b(0, 0, 0);
    }

    @Override // defpackage.uj0, defpackage.p4b
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.A0 = (gx1) obj;
        }
    }

    @Override // defpackage.uj0
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.uj0
    public final boolean k() {
        return j();
    }

    @Override // defpackage.uj0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.uj0
    public final void m() {
        gx1 gx1Var = this.A0;
        if (gx1Var != null) {
            gx1Var.c();
        }
    }

    @Override // defpackage.uj0
    public final void o(long j, boolean z) {
        this.B0 = Long.MIN_VALUE;
        gx1 gx1Var = this.A0;
        if (gx1Var != null) {
            gx1Var.c();
        }
    }

    @Override // defpackage.uj0
    public final void s(oy5[] oy5VarArr, long j, long j2) {
        this.z0 = j2;
    }

    @Override // defpackage.uj0
    public final void w(long j, long j2) {
        float[] fArr;
        while (!j() && this.B0 < 100000 + j) {
            o54 o54Var = this.x0;
            o54Var.v();
            imc imcVar = this.b;
            imcVar.N();
            if (v(imcVar, o54Var, 0) != -4 || o54Var.f(4)) {
                return;
            }
            this.B0 = o54Var.Y;
            if (this.A0 != null && !o54Var.f(Integer.MIN_VALUE)) {
                o54Var.y();
                ByteBuffer byteBuffer = o54Var.o;
                int i = maf.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    yaf yafVar = this.y0;
                    yafVar.F(iLimit, bArrArray);
                    yafVar.H(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(yafVar.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.A0.b(this.B0 - this.z0, fArr);
                }
            }
        }
    }
}
