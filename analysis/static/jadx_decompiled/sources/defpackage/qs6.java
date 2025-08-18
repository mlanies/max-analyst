package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class qs6 implements t24 {
    public int X;
    public final t24 a;
    public final int b;
    public final pnb c;
    public final byte[] o;

    public qs6(t24 t24Var, int i, pnb pnbVar) {
        fm9.f(i > 0);
        this.a = t24Var;
        this.b = i;
        this.c = pnbVar;
        this.o = new byte[1];
        this.X = i;
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        z0fVar.getClass();
        this.a.H(z0fVar);
    }

    @Override // defpackage.t24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.t24
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.X;
        t24 t24Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            if (t24Var.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int i7 = t24Var.read(bArr3, i6, i5);
                        if (i7 != -1) {
                            i6 += i7;
                            i5 -= i7;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        wpa wpaVar = new wpa(i4, bArr3);
                        pnb pnbVar = this.c;
                        long jMax = !pnbVar.x0 ? pnbVar.u0 : Math.max(pnbVar.y0.j(true), pnbVar.u0);
                        int iA = wpaVar.a();
                        yze yzeVar = pnbVar.w0;
                        yzeVar.getClass();
                        yzeVar.b(wpaVar, iA, 0);
                        yzeVar.a(jMax, 1, iA, 0, null);
                        pnbVar.x0 = true;
                    }
                }
                this.X = this.b;
            }
            return -1;
        }
        int i8 = t24Var.read(bArr, i, Math.min(this.X, i2));
        if (i8 != -1) {
            this.X -= i8;
        }
        return i8;
    }
}
