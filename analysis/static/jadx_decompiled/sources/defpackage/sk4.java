package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class sk4 implements yze {
    public final byte[] a = new byte[4096];

    @Override // defpackage.yze
    public final void a(long j, int i, int i2, int i3, wze wzeVar) {
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        wpaVar.H(i);
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = m24Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.yze
    public final void e(qy5 qy5Var) {
    }
}
