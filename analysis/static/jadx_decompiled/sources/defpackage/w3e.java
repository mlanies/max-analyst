package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class w3e implements ol7 {
    public final List X;
    public final int Y;
    public final boolean Z;
    public final long a;
    public final jqe b;
    public final String c;
    public final Integer o;
    public final boolean s0;
    public final int t0;
    public final long u0;

    public w3e(long j, jqe jqeVar, String str, Integer num, List list, int i, boolean z, boolean z2) {
        this.a = j;
        this.b = jqeVar;
        this.c = str;
        this.o = num;
        this.X = list;
        this.Y = i;
        this.Z = z;
        this.s0 = z2;
        this.t0 = i == 5 ? tga.l : tga.k;
        this.u0 = j >= 0 ? -j : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    public static w3e k(w3e w3eVar, ArrayList arrayList, boolean z, boolean z2, int i) {
        long j = w3eVar.a;
        jqe jqeVar = w3eVar.b;
        String str = w3eVar.c;
        Integer num = w3eVar.o;
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = w3eVar.X;
        }
        ArrayList arrayList3 = arrayList2;
        int i2 = w3eVar.Y;
        if ((i & 64) != 0) {
            z = w3eVar.Z;
        }
        boolean z3 = z;
        if ((i & 128) != 0) {
            z2 = w3eVar.s0;
        }
        w3eVar.getClass();
        return new w3e(j, jqeVar, str, num, arrayList3, i2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3e)) {
            return false;
        }
        w3e w3eVar = (w3e) obj;
        return this.a == w3eVar.a && tpa.f(this.b, w3eVar.b) && tpa.f(this.c, w3eVar.c) && tpa.f(this.o, w3eVar.o) && tpa.f(this.X, w3eVar.X) && this.Y == w3eVar.Y && this.Z == w3eVar.Z && this.s0 == w3eVar.s0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.u0;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.u0 == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iF = k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.o;
        return Boolean.hashCode(this.s0) + ms2.d(ey8.g(this.Y, k7d.g(this.X, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31, this.Z);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.t0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (!(ol7Var instanceof w3e)) {
            return null;
        }
        w3e w3eVar = (w3e) ol7Var;
        boolean z = this.Z;
        boolean z2 = w3eVar.Z;
        if (z != z2) {
            return new t3e(z2);
        }
        int i = this.Y;
        int i2 = w3eVar.Y;
        if (i != i2) {
            return new u3e(i2);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.o);
        sb.append(", stickers=");
        sb.append(this.X);
        sb.append(", type=");
        sb.append(k7d.r(this.Y));
        sb.append(", selected=");
        sb.append(this.Z);
        sb.append(", favorite=");
        return au1.j(sb, this.s0, ")");
    }

    public /* synthetic */ w3e(long j, jqe jqeVar, String str, Integer num, List list, int i, boolean z, boolean z2, int i2) {
        this(j, jqeVar, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num, list, i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2);
    }
}
