package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c62 implements ol7 {
    public final Boolean a;
    public final ze0 b;
    public final Drawable c;
    public final Drawable o;

    public c62(Boolean bool, ze0 ze0Var, Drawable drawable, Drawable drawable2) {
        this.a = bool;
        this.b = ze0Var;
        this.c = drawable;
        this.o = drawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c62)) {
            return false;
        }
        c62 c62Var = (c62) obj;
        return tpa.f(this.a, c62Var.a) && tpa.f(this.b, c62Var.b) && tpa.f(this.c, c62Var.c) && tpa.f(this.o, c62Var.o);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.b.a.hashCode();
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return getItemId() == ol7Var.getItemId();
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iD = rh4.d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b.a);
        Drawable drawable = this.c;
        int iHashCode = (iD + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.o;
        return iHashCode + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        c62 c62Var = ol7Var instanceof c62 ? (c62) ol7Var : null;
        if (c62Var == null) {
            return null;
        }
        Boolean bool = this.a;
        Boolean bool2 = c62Var.a;
        if (tpa.f(bool, bool2)) {
            return null;
        }
        return new b62(bool2);
    }

    public final String toString() {
        return "ChatBackground(isSelected=" + this.a + ", backgroundId=" + this.b + ", drawable=" + this.c + ", previewDrawable=" + this.o + ")";
    }
}
