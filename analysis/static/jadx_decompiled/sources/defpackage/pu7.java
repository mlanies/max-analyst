package defpackage;

/* loaded from: classes2.dex */
public final class pu7 implements efb {
    public static final pu7 a = new pu7();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pu7);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 512;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 512) == ol7Var.getItemId();
    }

    public final int hashCode() {
        return -95268716;
    }

    @Override // defpackage.ol7
    public final int l() {
        return 512;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "LogoutItem";
    }
}
