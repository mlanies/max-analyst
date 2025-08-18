package defpackage;

/* loaded from: classes2.dex */
public final class tz {
    public static final tz f = new tz(false, false, false, null, null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final o00 d;
    public final z07 e;

    public tz(boolean z, boolean z2, boolean z3, o00 o00Var, z07 z07Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = o00Var;
        this.e = z07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz)) {
            return false;
        }
        tz tzVar = (tz) obj;
        return this.a == tzVar.a && this.b == tzVar.b && this.c == tzVar.c && tpa.f(this.d, tzVar.d) && tpa.f(this.e, tzVar.e);
    }

    public final int hashCode() {
        int iD = ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        o00 o00Var = this.d;
        int iHashCode = (iD + (o00Var == null ? 0 : o00Var.hashCode())) * 31;
        z07 z07Var = this.e;
        return iHashCode + (z07Var != null ? z07Var.hashCode() : 0);
    }

    public final String toString() {
        return "AttachInfo(hasPhoto=" + this.a + ", hasInlineKeyboard=" + this.b + ", hasReplyKeyboard=" + this.c + ", attachModel=" + this.d + ", inlineKeyboard=" + this.e + ")";
    }
}
