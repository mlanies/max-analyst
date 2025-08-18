package defpackage;

/* loaded from: classes2.dex */
public final class izf implements kzf {
    public final String a;
    public final c1g b;

    public izf(String str, c1g c1gVar) {
        this.a = str;
        this.b = c1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izf)) {
            return false;
        }
        izf izfVar = (izf) obj;
        return tpa.f(this.a, izfVar.a) && tpa.f(this.b, izfVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c1g c1gVar = this.b;
        return iHashCode + (c1gVar != null ? c1gVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowShareDialog(text=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
