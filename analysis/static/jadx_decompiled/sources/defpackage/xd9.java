package defpackage;

/* loaded from: classes.dex */
public final class xd9 implements yze {
    public qy5 a;
    public final byte[] b = new byte[16000];

    @Override // defpackage.yze
    public final void a(long j, int i, int i2, int i3, wze wzeVar) {
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        while (i > 0) {
            byte[] bArr = this.b;
            int iMin = Math.min(i, bArr.length);
            wpaVar.e(0, bArr, iMin);
            i -= iMin;
        }
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = this.b;
            boolean z2 = false;
            int i3 = m24Var.read(bArr, 0, Math.min(i2, bArr.length));
            if (i3 != -1) {
                z2 = true;
            }
            fm9.k(z2);
            i2 -= i3;
        }
        return i;
    }

    @Override // defpackage.yze
    public final void e(qy5 qy5Var) {
        this.a = qy5Var;
    }
}
