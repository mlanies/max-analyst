package defpackage;

/* loaded from: classes.dex */
public final class z9f implements ol7 {
    public final jqe a;
    public final uc0 b;
    public final String c;
    public final gg1 o;

    public z9f(iqe iqeVar, uc0 uc0Var, String str, gg1 gg1Var) {
        this.a = iqeVar;
        this.b = uc0Var;
        this.c = str;
        this.o = gg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9f)) {
            return false;
        }
        z9f z9fVar = (z9f) obj;
        return tpa.f(this.a, z9fVar.a) && tpa.f(this.b, z9fVar.b) && tpa.f(this.c, z9fVar.c) && tpa.f(this.o, z9fVar.o);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.o.a;
    }

    public final int hashCode() {
        return this.o.hashCode() + rh4.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return y7a.U0;
    }

    public final String toString() {
        return "UserInWaitingData(name=" + this.a + ", avatarAbbreviationModel=" + this.b + ", url=" + this.c + ", participantId=" + this.o + ")";
    }
}
