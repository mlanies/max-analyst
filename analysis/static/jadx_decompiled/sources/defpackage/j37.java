package defpackage;

/* loaded from: classes.dex */
public final class j37 extends h37 {
    public static final j37 o = new j37(1, 0, 1);

    @Override // defpackage.h37
    public final boolean equals(Object obj) {
        if (obj instanceof j37) {
            if (!isEmpty() || !((j37) obj).isEmpty()) {
                j37 j37Var = (j37) obj;
                if (this.a == j37Var.a) {
                    if (this.b == j37Var.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.h37
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.b + (this.a * 31);
    }

    @Override // defpackage.h37
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.h37
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
