package defpackage;

/* loaded from: classes.dex */
public final class ov5 implements ol7 {
    public final String X;
    public final nv5 Y;
    public final int Z;
    public final long a;
    public final CharSequence b;
    public final int c;
    public final CharSequence o;
    public final long s0;

    public ov5(long j, CharSequence charSequence, int i, CharSequence charSequence2, String str, nv5 nv5Var, int i2) {
        this.a = j;
        this.b = charSequence;
        this.c = i;
        this.o = charSequence2;
        this.X = str;
        this.Y = nv5Var;
        this.Z = i2;
        this.s0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov5)) {
            return false;
        }
        ov5 ov5Var = (ov5) obj;
        return this.a == ov5Var.a && tpa.f(this.b, ov5Var.b) && this.c == ov5Var.c && tpa.f(this.o, ov5Var.o) && tpa.f(this.X, ov5Var.X) && tpa.f(this.Y, ov5Var.Y) && this.Z == ov5Var.Z;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.s0;
    }

    public final int hashCode() {
        int iE = k7d.e(this.c, rh4.f(this.b, Long.hashCode(this.a) * 31, 31), 31);
        CharSequence charSequence = this.o;
        int iHashCode = (iE + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.X;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        nv5 nv5Var = this.Y;
        return Integer.hashCode(this.Z) + ((iHashCode2 + (nv5Var != null ? nv5Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.Z;
    }

    public final String toString() {
        return "FolderWidgetItem(id=" + this.a + ", name=" + ((Object) this.b) + ", backgroundColor=" + this.c + ", description=" + ((Object) this.o) + ", iconUrl=" + this.X + ", clickAction=" + this.Y + ", viewType=" + this.Z + ")";
    }
}
