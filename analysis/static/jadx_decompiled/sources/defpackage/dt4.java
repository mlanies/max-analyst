package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class dt4 implements xze {
    public final byte[] a = new byte[4096];

    @Override // defpackage.xze
    public final int a(l24 l24Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = l24Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.xze
    public final void b(long j, int i, int i2, int i3, vze vzeVar) {
    }

    @Override // defpackage.xze
    public final void c(int i, yaf yafVar) {
        yafVar.I(i);
    }

    @Override // defpackage.xze
    public final void d(oy5 oy5Var) {
    }
}
