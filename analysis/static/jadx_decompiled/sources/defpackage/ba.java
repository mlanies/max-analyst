package defpackage;

/* loaded from: classes2.dex */
public final class ba implements ol7 {
    public final CharSequence X;
    public final boolean Y;
    public final long Z;
    public final long a;
    public final CharSequence b;
    public final jqe c;
    public final String o;

    public ba(long j, String str, jqe jqeVar, String str2, CharSequence charSequence, boolean z) {
        this.a = j;
        this.b = str;
        this.c = jqeVar;
        this.o = str2;
        this.X = charSequence;
        this.Y = z;
        this.Z = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return this.a == baVar.a && tpa.f(this.b, baVar.b) && tpa.f(this.c, baVar.c) && tpa.f(this.o, baVar.o) && tpa.f(this.X, baVar.X) && this.Y == baVar.Y;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        int iF = rh4.f(this.b, Long.hashCode(this.a) * 31, 31);
        jqe jqeVar = this.c;
        return Boolean.hashCode(this.Y) + rh4.f(this.X, rh4.d((iF + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31, 31, this.o), 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    public final String toString() {
        return "AdminFromContactsItem(id=" + this.a + ", name=" + ((Object) this.b) + ", subtitle=" + this.c + ", avatar=" + this.o + ", abbreviation=" + ((Object) this.X) + ", isVerified=" + this.Y + ")";
    }
}
