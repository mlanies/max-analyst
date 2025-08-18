package defpackage;

/* loaded from: classes2.dex */
public final class wib extends bjb {
    public final CharSequence a;
    public final jqe b;

    public wib(CharSequence charSequence, eqe eqeVar) {
        this.a = charSequence;
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wib)) {
            return false;
        }
        wib wibVar = (wib) obj;
        return tpa.f(this.a, wibVar.a) && tpa.f(this.b, wibVar.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 65536;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        return iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode());
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 65536;
    }

    public final String toString() {
        return "ContactDescription(text=" + ((Object) this.a) + ", title=" + this.b + ")";
    }
}
