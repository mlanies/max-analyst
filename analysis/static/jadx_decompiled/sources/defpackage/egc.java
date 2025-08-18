package defpackage;

/* loaded from: classes2.dex */
public final class egc extends gle {
    public final Long c;

    public egc(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egc) && tpa.f(this.c, ((egc) obj).c);
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
        return x9e.c0("Response(\n            |timestampRemoveProfile=" + this.c + "\n            |)");
    }
}
