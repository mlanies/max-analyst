package defpackage;

/* loaded from: classes.dex */
public final class k2d {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public k2d f;
    public k2d g;

    public k2d() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final k2d a() {
        k2d k2dVar = this.f;
        k2d k2dVar2 = k2dVar != this ? k2dVar : null;
        k2d k2dVar3 = this.g;
        k2dVar3.f = k2dVar;
        this.f.g = k2dVar3;
        this.f = null;
        this.g = null;
        return k2dVar2;
    }

    public final void b(k2d k2dVar) {
        k2dVar.g = this;
        k2dVar.f = this.f;
        this.f.g = k2dVar;
        this.f = k2dVar;
    }

    public final k2d c() {
        this.d = true;
        return new k2d(this.a, this.b, this.c, true, false);
    }

    public final void d(k2d k2dVar, int i) {
        if (!k2dVar.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = k2dVar.c;
        int i3 = i2 + i;
        byte[] bArr = k2dVar.a;
        if (i3 > 8192) {
            if (k2dVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = k2dVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            ys.Y(bArr, i4, bArr, i2);
            k2dVar.c -= k2dVar.b;
            k2dVar.b = 0;
        }
        int i5 = k2dVar.c;
        int i6 = this.b;
        System.arraycopy(this.a, i6, bArr, i5, (i6 + i) - i6);
        k2dVar.c += i;
        this.b += i;
    }

    public k2d(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
