package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class wre implements ol7 {
    public final boolean a;
    public final String b;
    public final sba c;
    public final Drawable o;

    public wre(boolean z, String str, sba sbaVar, Drawable drawable) {
        this.a = z;
        this.b = str;
        this.c = sbaVar;
        this.o = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.graphics.drawable.Drawable] */
    public static wre k(wre wreVar, boolean z, rre rreVar, int i) {
        if ((i & 1) != 0) {
            z = wreVar.a;
        }
        rre rreVar2 = rreVar;
        if ((i & 8) != 0) {
            rreVar2 = wreVar.o;
        }
        return new wre(z, wreVar.b, wreVar.c, rreVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wre)) {
            return false;
        }
        wre wreVar = (wre) obj;
        return this.a == wreVar.a && tpa.f(this.b, wreVar.b) && tpa.f(this.c, wreVar.c) && tpa.f(this.o, wreVar.o);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.b.hashCode();
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return getItemId() == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + rh4.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Drawable drawable = this.o;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        wre wreVar = ol7Var instanceof wre ? (wre) ol7Var : null;
        if (wreVar == null) {
            return null;
        }
        boolean z = this.a;
        boolean z2 = wreVar.a;
        if (z != z2) {
            return new ure(z2);
        }
        return null;
    }

    public final String toString() {
        return "ThemeItem(isSelected=" + this.a + ", themeName=" + this.b + ", theme=" + this.c + ", backgroundDrawable=" + this.o + ")";
    }
}
