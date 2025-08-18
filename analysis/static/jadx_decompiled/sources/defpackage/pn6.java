package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pn6 implements yze {
    public static final qy5 g;
    public static final qy5 h;
    public final xo a = new xo(1);
    public final yze b;
    public final qy5 c;
    public qy5 d;
    public byte[] e;
    public int f;

    static {
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("application/id3");
        g = ny5Var.a();
        ny5 ny5Var2 = new ny5();
        ny5Var2.m = ia9.l("application/x-emsg");
        h = ny5Var2.a();
    }

    public pn6(yze yzeVar, int i) {
        this.b = yzeVar;
        if (i == 1) {
            this.c = g;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(zr6.h(i, "Unknown metadataType: "));
            }
            this.c = h;
        }
        this.e = new byte[0];
        this.f = 0;
    }

    @Override // defpackage.yze
    public final void a(long j, int i, int i2, int i3, wze wzeVar) {
        this.d.getClass();
        int i4 = this.f - i3;
        wpa wpaVar = new wpa(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.n;
        qy5 qy5Var = this.c;
        if (!oaf.a(str, qy5Var.n)) {
            if (!"application/x-emsg".equals(this.d.n)) {
                z04.c0("Ignoring sample for unsupported format: " + this.d.n);
                return;
            }
            this.a.getClass();
            d45 d45VarX = xo.X(wpaVar);
            qy5 qy5VarK = d45VarX.k();
            String str2 = qy5Var.n;
            if (qy5VarK == null || !oaf.a(str2, qy5VarK.n)) {
                z04.c0("Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + d45VarX.k());
                return;
            }
            byte[] bArrO = d45VarX.o();
            bArrO.getClass();
            wpaVar = new wpa(bArrO);
        }
        int iA = wpaVar.a();
        this.b.b(wpaVar, iA, 0);
        this.b.a(j, i, iA, 0, wzeVar);
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        int i3 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i3) {
            this.e = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        wpaVar.e(this.f, this.e, i);
        this.f += i;
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) throws EOFException {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = m24Var.read(this.e, this.f, i);
        if (i3 != -1) {
            this.f += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.yze
    public final void e(qy5 qy5Var) {
        this.d = qy5Var;
        this.b.e(this.c);
    }
}
