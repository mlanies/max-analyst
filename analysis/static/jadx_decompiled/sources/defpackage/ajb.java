package defpackage;

/* loaded from: classes2.dex */
public final class ajb extends bjb {
    public final CharSequence a;

    public ajb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajb) && tpa.f(this.a, ((ajb) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 16;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 16;
    }

    public final String toString() {
        return "Phone(text=" + ((Object) this.a) + ")";
    }
}
