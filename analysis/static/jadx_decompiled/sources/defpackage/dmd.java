package defpackage;

/* loaded from: classes2.dex */
public final class dmd implements ol7 {
    public final int a;
    public final int b = eda.d;
    public final long c;

    public dmd(int i) {
        this.a = i;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmd) && this.a == ((dmd) obj).a;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.ol7
    public final int l() {
        return this.b;
    }

    public final String toString() {
        return zr6.j(new StringBuilder("ShimmerMemberListItem(pos="), this.a, ")");
    }
}
