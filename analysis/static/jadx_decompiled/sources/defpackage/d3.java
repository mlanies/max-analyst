package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class d3 extends n4c {
    @Override // defpackage.n4c
    public final int a(int i) {
        return (k().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.n4c
    public final boolean b() {
        return k().nextBoolean();
    }

    @Override // defpackage.n4c
    public final byte[] c(byte[] bArr) {
        k().nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.n4c
    public final double d() {
        return k().nextDouble();
    }

    @Override // defpackage.n4c
    public final float e() {
        return k().nextFloat();
    }

    @Override // defpackage.n4c
    public final int f() {
        return k().nextInt();
    }

    @Override // defpackage.n4c
    public final int g(int i) {
        return k().nextInt(i);
    }

    @Override // defpackage.n4c
    public final long h() {
        return k().nextLong();
    }

    public abstract Random k();
}
