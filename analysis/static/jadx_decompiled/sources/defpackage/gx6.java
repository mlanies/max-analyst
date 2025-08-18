package defpackage;

/* loaded from: classes2.dex */
public final class gx6 extends n1 implements uaf {
    public static final gx6 a = new gx6();

    @Override // defpackage.uaf
    public final String a() {
        return "null";
    }

    @Override // defpackage.uaf
    public final int e() {
        return 1;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        int iE = ((n1) ((uaf) obj)).e();
        if (iE != 0) {
            return iE == 1;
        }
        throw null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "null";
    }
}
