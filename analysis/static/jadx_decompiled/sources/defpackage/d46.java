package defpackage;

/* loaded from: classes2.dex */
public final class d46 implements nu6 {
    public static final d46 a = new d46();
    public static final byte[] b;
    public static final byte[] c;
    public static final int d;

    static {
        int length = "<svg".getBytes(a52.b).length;
        b = c54.e("<svg");
        c = c54.e("<?xm");
        d = length;
    }

    @Override // defpackage.nu6
    public final ou6 a(int i, byte[] bArr) {
        return (c54.I(bArr, b, 0) || c54.I(bArr, c, 0)) ? kp.c : ou6.c;
    }

    @Override // defpackage.nu6
    public final int b() {
        return d;
    }
}
