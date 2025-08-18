package defpackage;

/* loaded from: classes2.dex */
public abstract class y27 {
    public static final ri9 a;

    static {
        int i = vsc.a;
        a = new ri9();
    }

    public static final void a() {
        ri9 ri9Var = a;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((g1e) objArr[(i << 3) + i3]).e();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
