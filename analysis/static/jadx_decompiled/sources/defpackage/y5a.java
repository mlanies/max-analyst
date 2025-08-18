package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class y5a {
    public static final khe g = new khe(new s4a(1));
    public final String a;
    public final CharSequence b;
    public final int c;
    public final np8 d;
    public final Drawable e;
    public final Drawable f;

    public y5a(String str, CharSequence charSequence, int i, np8 np8Var, Drawable drawable, Drawable drawable2) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = np8Var;
        this.e = drawable;
        this.f = drawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [np8] */
    public static y5a a(y5a y5aVar, CharSequence charSequence, int i, v5a v5aVar, int i2) {
        String str = y5aVar.a;
        if ((i2 & 2) != 0) {
            charSequence = y5aVar.b;
        }
        CharSequence charSequence2 = charSequence;
        v5a v5aVar2 = v5aVar;
        if ((i2 & 8) != 0) {
            v5aVar2 = y5aVar.d;
        }
        Drawable drawable = y5aVar.e;
        Drawable drawable2 = y5aVar.f;
        y5aVar.getClass();
        return new y5a(str, charSequence2, i, v5aVar2, drawable, drawable2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5a)) {
            return false;
        }
        y5a y5aVar = (y5a) obj;
        return tpa.f(this.a, y5aVar.a) && tpa.f(this.b, y5aVar.b) && this.c == y5aVar.c && tpa.f(this.d, y5aVar.d) && tpa.f(this.e, y5aVar.e) && tpa.f(this.f, y5aVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ey8.g(this.c, rh4.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        Drawable drawable = this.e;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f;
        return iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneMeBaseTabItemModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", state=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Disabled" : "Inactive" : "Active");
        sb.append(", indicator=");
        sb.append(this.d);
        sb.append(", startIcon=");
        sb.append(this.e);
        sb.append(", endIcon=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ y5a(String str, int i, int i2, String str2) {
        this(str, str2, i, x5a.p, null, null);
    }
}
