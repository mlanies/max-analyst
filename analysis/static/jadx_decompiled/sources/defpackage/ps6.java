package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class ps6 implements r24 {
    public int X;
    public final r24 a;
    public final int b;
    public final onb c;
    public final byte[] o;

    public ps6(r24 r24Var, int i, onb onbVar) {
        np8.d(i > 0);
        this.a = r24Var;
        this.b = i;
        this.c = onbVar;
        this.o = new byte[1];
        this.X = i;
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
        y0fVar.getClass();
        this.a.N(y0fVar);
    }

    @Override // defpackage.r24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.r24
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.X;
        r24 r24Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            int i4 = 0;
            if (r24Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = r24Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        yaf yafVar = new yaf(i5, bArr3);
                        onb onbVar = this.c;
                        long jMax = !onbVar.y0 ? onbVar.u0 : Math.max(onbVar.z0.g(), onbVar.u0);
                        int iC = yafVar.c();
                        drc drcVar = onbVar.x0;
                        drcVar.getClass();
                        drcVar.c(iC, yafVar);
                        drcVar.b(jMax, 1, iC, 0, null);
                        onbVar.y0 = true;
                    }
                }
                this.X = this.b;
            }
            return -1;
        }
        int i8 = r24Var.read(bArr, i, Math.min(this.X, i2));
        if (i8 != -1) {
            this.X -= i8;
        }
        return i8;
    }
}
