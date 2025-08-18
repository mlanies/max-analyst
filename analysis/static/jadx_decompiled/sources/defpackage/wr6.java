package defpackage;

/* loaded from: classes.dex */
public final class wr6 {
    public final Object a;
    public int b;
    public final boolean c;
    public final mt0 d;
    public byte[] e;
    public char[] f;
    public char[] g;
    public char[] h;

    public wr6(mt0 mt0Var, Object obj, boolean z) {
        this.d = mt0Var;
        this.a = obj;
        this.c = z;
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.e;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.e = null;
            this.d.a.set(0, bArr);
        }
    }
}
