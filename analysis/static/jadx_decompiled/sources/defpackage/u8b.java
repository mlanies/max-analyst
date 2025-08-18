package defpackage;

/* loaded from: classes.dex */
public final class u8b {
    public static final u8b e = new u8b(null, null, d95.b, y21.h);
    public final String a;
    public final j1e b;
    public final i95 c;
    public final y21 d;

    public u8b(String str, j1e j1eVar, i95 i95Var, y21 y21Var) {
        this.a = str;
        this.b = j1eVar;
        this.c = i95Var;
        this.d = y21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8b)) {
            return false;
        }
        u8b u8bVar = (u8b) obj;
        return tpa.f(this.a, u8bVar.a) && tpa.f(this.b, u8bVar.b) && tpa.f(this.c, u8bVar.c) && tpa.f(this.d, u8bVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        j1e j1eVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (j1eVar != null ? j1eVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousCallState(callId=" + this.a + ", recallTarget=" + this.b + ", state=" + this.c + ", chatInfo=" + this.d + ")";
    }
}
