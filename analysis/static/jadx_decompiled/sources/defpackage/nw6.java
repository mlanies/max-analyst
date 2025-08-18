package defpackage;

/* loaded from: classes2.dex */
public final class nw6 extends n1 implements rx6, uaf {
    public static final nw6 b = new nw6(true);
    public static final nw6 c = new nw6(false);
    public final boolean a;

    public nw6(boolean z) {
        this.a = z;
    }

    @Override // defpackage.uaf
    public final String a() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.uaf
    public final int e() {
        return 2;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uafVar = (uaf) obj;
        int iE = ((n1) uafVar).e();
        if (iE == 0) {
            throw null;
        }
        if (iE == 2) {
            return this.a == uafVar.q().a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    @Override // defpackage.n1, defpackage.uaf
    public final nw6 q() {
        return this;
    }

    @Override // defpackage.n1
    /* renamed from: t */
    public final nw6 q() {
        return this;
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
