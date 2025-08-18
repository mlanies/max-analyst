package defpackage;

/* loaded from: classes2.dex */
public final class pib extends bjb {
    public final CharSequence a;

    public pib(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pib) && tpa.f(this.a, ((pib) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 32768;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 32768;
    }

    public final String toString() {
        return "ChannelLinkItem(link=" + ((Object) this.a) + ")";
    }
}
