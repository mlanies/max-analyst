package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;

/* loaded from: classes2.dex */
public final class ax6 extends n1 implements vw6 {
    public final long a;

    public ax6(long j) {
        this.a = j;
    }

    @Override // defpackage.uaf
    public final String a() {
        return Long.toString(this.a);
    }

    @Override // defpackage.fy9
    public final long b() {
        return this.a;
    }

    @Override // defpackage.vw6
    public final int d() {
        long j = this.a;
        if (-2147483648L > j || j > 2147483647L) {
            throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
        }
        return (int) j;
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
        vw6 vw6VarF = n1Var.f();
        return vw6VarF.j() && this.a == vw6VarF.b();
    }

    @Override // defpackage.n1, defpackage.uaf
    public final vw6 f() {
        return this;
    }

    @Override // defpackage.fy9
    public final BigInteger h() {
        return BigInteger.valueOf(this.a);
    }

    public final int hashCode() {
        long j = this.a;
        return (-2147483648L > j || j > 2147483647L) ? (int) ((j >>> 32) ^ j) : (int) j;
    }

    @Override // defpackage.vw6
    public final long i() {
        return this.a;
    }

    @Override // defpackage.vw6
    public final boolean j() {
        return true;
    }

    @Override // defpackage.n1, defpackage.rx6
    /* renamed from: k */
    public final vw6 f() {
        return this;
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
