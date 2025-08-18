package defpackage;

/* loaded from: classes2.dex */
public final class mmd implements efb {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmd)) {
            return false;
        }
        ((mmd) obj).getClass();
        return true;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 8;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 8) == ol7Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(536870920);
    }

    @Override // defpackage.ol7
    public final int l() {
        return 536870920;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "ShortLinkHeaderItem(viewType=536870920)";
    }
}
