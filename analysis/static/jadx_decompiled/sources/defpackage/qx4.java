package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes2.dex */
public final class qx4 implements ol7 {
    public final Drawable X;
    public final long Y;
    public final int Z;
    public final int a;
    public final int b;
    public final CharSequence c;
    public final List o;
    public final long s0;

    public qx4(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.o = list;
        this.X = drawable;
        this.Y = j;
        this.Z = cga.a;
        this.s0 = j != 0 ? (Long.MAX_VALUE - Math.abs(j)) - i : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx4)) {
            return false;
        }
        qx4 qx4Var = (qx4) obj;
        return this.a == qx4Var.a && this.b == qx4Var.b && tpa.f(this.c, qx4Var.c) && tpa.f(this.o, qx4Var.o) && tpa.f(this.X, qx4Var.X) && this.Y == qx4Var.Y;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.s0;
    }

    public final int hashCode() {
        int iG = k7d.g(this.o, rh4.f(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Drawable drawable = this.X;
        return Long.hashCode(this.Y) + ((iG + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiModel(groupIndex=");
        sb.append(this.a);
        sb.append(", itemIndex=");
        sb.append(this.b);
        sb.append(", defaultValue=");
        sb.append((Object) this.c);
        sb.append(", values=");
        sb.append(this.o);
        sb.append(", drawable=");
        sb.append(this.X);
        sb.append(", animojiId=");
        return zr6.k(sb, this.Y, ")");
    }

    public /* synthetic */ qx4(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j, int i3) {
        this(i, i2, charSequence, (i3 & 8) != 0 ? nz4.a : list, drawable, (i3 & 32) != 0 ? 0L : j);
    }
}
