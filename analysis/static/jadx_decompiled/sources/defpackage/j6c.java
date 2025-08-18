package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class j6c implements ol7 {
    public final int X = apc.b;
    public final long Y;
    public final long a;
    public final v5c b;
    public final Drawable c;
    public final boolean o;

    public j6c(long j, v5c v5cVar, Drawable drawable, boolean z) {
        this.a = j;
        this.b = v5cVar;
        this.c = drawable;
        this.o = z;
        this.Y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6c)) {
            return false;
        }
        j6c j6cVar = (j6c) obj;
        return this.a == j6cVar.a && tpa.f(this.b, j6cVar.b) && tpa.f(this.c, j6cVar.c) && this.o == j6cVar.o;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.o) + ((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.X;
    }

    public final String toString() {
        return "ReactionModel(animojiId=" + this.a + ", reaction=" + ((Object) this.b) + ", reactionDrawable=" + this.c + ", selected=" + this.o + ")";
    }
}
