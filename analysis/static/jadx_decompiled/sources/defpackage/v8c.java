package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v8c implements ol7 {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence o;
    public final boolean s0;
    public final long t0;

    public v8c(long j, String str, String str2, CharSequence charSequence, boolean z, boolean z2, boolean z3, int i) {
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        z3 = (i & 64) != 0 ? false : z3;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = charSequence;
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        this.s0 = false;
        this.t0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8c)) {
            return false;
        }
        v8c v8cVar = (v8c) obj;
        return this.a == v8cVar.a && tpa.f(this.b, v8cVar.b) && tpa.f(this.c, v8cVar.c) && tpa.f(this.o, v8cVar.o) && this.X == v8cVar.X && this.Y == v8cVar.Y && this.Z == v8cVar.Z && this.s0 == v8cVar.s0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.t0;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.a == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iF = rh4.f(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.s0) + ms2.d(ms2.d(ms2.d(rh4.f(this.o, (iF + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.X), 31, this.Y), 31, this.Z);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        v8c v8cVar = (v8c) ((ol7) obj);
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = this.b;
        CharSequence charSequence2 = v8cVar.b;
        if (!tpa.f(charSequence, charSequence2)) {
            arrayList.add(new s8c((String) charSequence2));
        }
        boolean z = this.Y;
        boolean z2 = v8cVar.Y;
        if (z != z2) {
            arrayList.add(new u8c(z2));
        }
        String str = this.c;
        String str2 = v8cVar.c;
        if (!tpa.f(str, str2)) {
            arrayList.add(new r8c(str2));
        }
        CharSequence charSequence3 = this.o;
        CharSequence charSequence4 = v8cVar.o;
        if (!tpa.f(charSequence3, charSequence4)) {
            arrayList.add(new q8c(charSequence4));
        }
        boolean z3 = this.X;
        boolean z4 = v8cVar.X;
        if (z3 != z4) {
            arrayList.add(new t8c(z4));
        }
        return arrayList;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "RecentContactModel(id=" + this.a + ", name=" + ((Object) this.b) + ", avatar=" + this.c + ", abbreviation=" + ((Object) this.o) + ", isOnline=" + this.X + ", isVerified=" + this.Y + ", isWebapp=" + this.Z + ", isSavedMessages=" + this.s0 + ")";
    }
}
