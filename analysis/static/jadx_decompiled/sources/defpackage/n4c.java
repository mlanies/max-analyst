package defpackage;

/* loaded from: classes.dex */
public abstract class n4c {
    public static final m4c a = new m4c();
    public static final d3 b;

    static {
        Integer num = r77.a;
        b = (num == null || num.intValue() >= 34) ? new x2b() : new pb5();
    }

    public abstract int a(int i);

    public abstract boolean b();

    public abstract byte[] c(byte[] bArr);

    public abstract double d();

    public abstract float e();

    public abstract int f();

    public abstract int g(int i);

    public abstract long h();

    public long i(long j) {
        return j(0L, j);
    }

    public long j(long j, long j2) {
        long jH;
        long j3;
        long jA;
        int iF;
        if (j2 <= j) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j2) + ").").toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iF = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iF = f();
                } else {
                    jA = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (f() & 4294967295L);
                }
                jA = iF & 4294967295L;
            } else {
                do {
                    jH = h() >>> 1;
                    j3 = jH % j4;
                } while ((j4 - 1) + (jH - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jH2 = h();
            if (j <= jH2 && jH2 < j2) {
                return jH2;
            }
        }
    }
}
