package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class r30 {
    public static final r30 d;
    public final int a;
    public final int b;
    public final jx6 c;

    static {
        r30 r30Var;
        if (oaf.a >= 33) {
            ix6 ix6Var = new ix6(4);
            for (int i = 1; i <= 10; i++) {
                ix6Var.a(Integer.valueOf(oaf.t(i)));
            }
            r30Var = new r30(2, ix6Var.l());
        } else {
            r30Var = new r30(2, 10);
        }
        d = r30Var;
    }

    public r30(int i, Set set) {
        this.a = i;
        jx6 jx6VarJ = jx6.j(set);
        this.c = jx6VarJ;
        m5f it = jx6VarJ.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj;
        return this.a == r30Var.a && this.b == r30Var.b && oaf.a(this.c, r30Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        jx6 jx6Var = this.c;
        return i + (jx6Var == null ? 0 : jx6Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public r30(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
