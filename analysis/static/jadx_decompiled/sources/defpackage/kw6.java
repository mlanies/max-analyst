package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;

/* loaded from: classes2.dex */
public final class kw6 extends n1 implements vw6 {
    public static final BigInteger X;
    public static final BigInteger b;
    public static final BigInteger c;
    public static final BigInteger o;
    public final BigInteger a;

    static {
        BigInteger.valueOf(-128L);
        BigInteger.valueOf(127L);
        BigInteger.valueOf(-32768L);
        BigInteger.valueOf(32767L);
        b = BigInteger.valueOf(-2147483648L);
        c = BigInteger.valueOf(2147483647L);
        o = BigInteger.valueOf(Long.MIN_VALUE);
        X = BigInteger.valueOf(Long.MAX_VALUE);
    }

    public kw6(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.uaf
    public final String a() {
        return this.a.toString();
    }

    @Override // defpackage.fy9
    public final long b() {
        return this.a.longValue();
    }

    @Override // defpackage.vw6
    public final int d() {
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger2.compareTo(bigInteger) < 0 || bigInteger2.compareTo(c) > 0) {
            throw new MessageIntegerOverflowException(bigInteger2);
        }
        return bigInteger2.intValue();
    }

    @Override // defpackage.uaf
    public final int e() {
        return 3;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        n1 n1Var = (n1) ((uaf) obj);
        if (n1Var.e() != 3) {
            return false;
        }
        return this.a.equals(n1Var.f().h());
    }

    @Override // defpackage.n1, defpackage.uaf
    public final vw6 f() {
        return this;
    }

    @Override // defpackage.fy9
    public final BigInteger h() {
        return this.a;
    }

    public final int hashCode() {
        long jLongValue;
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(c) <= 0) {
            jLongValue = bigInteger2.longValue();
        } else {
            if (o.compareTo(bigInteger2) > 0 || bigInteger2.compareTo(X) > 0) {
                return bigInteger2.hashCode();
            }
            long jLongValue2 = bigInteger2.longValue();
            jLongValue = jLongValue2 ^ (jLongValue2 >>> 32);
        }
        return (int) jLongValue;
    }

    @Override // defpackage.vw6
    public final long i() {
        boolean zJ = j();
        BigInteger bigInteger = this.a;
        if (zJ) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
    }

    @Override // defpackage.vw6
    public final boolean j() {
        BigInteger bigInteger = o;
        BigInteger bigInteger2 = this.a;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(X) <= 0;
    }

    @Override // defpackage.n1, defpackage.rx6
    /* renamed from: k */
    public final vw6 f() {
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }
}
