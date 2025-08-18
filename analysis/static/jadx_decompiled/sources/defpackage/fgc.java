package defpackage;

/* loaded from: classes2.dex */
public final class fgc extends gle {
    public final Long c;

    public fgc(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgc) && tpa.f(this.c, ((fgc) obj).c);
    }

    public final int hashCode() {
        Long l = this.c;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @Override // defpackage.zje
    public final String toString() {
        return x9e.c0("Response(\n                    |timestampRemoveProfile=" + this.c + "\n                    |)");
    }
}
