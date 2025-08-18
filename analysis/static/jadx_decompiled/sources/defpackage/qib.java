package defpackage;

/* loaded from: classes2.dex */
public final class qib extends bjb {
    public final CharSequence a;

    public qib(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qib) && tpa.f(this.a, ((qib) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 8;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 8;
    }

    public final String toString() {
        return "ChatDescription(text=" + ((Object) this.a) + ")";
    }
}
