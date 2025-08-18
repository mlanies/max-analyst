package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class tab {
    public final long a;
    public final boolean b;
    public final List c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final od0 g;
    public final jqe h;
    public final jqe i;
    public final boolean j;
    public final boolean k;

    public /* synthetic */ tab(long j, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, od0 od0Var, jqe jqeVar, iqe iqeVar, boolean z2, boolean z3, int i) {
        this(j, z, list, str, charSequence, charSequence2, (i & 64) != 0 ? null : od0Var, jqeVar, iqeVar, (i & 512) != 0 ? false : z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tab)) {
            return false;
        }
        tab tabVar = (tab) obj;
        return this.a == tabVar.a && this.b == tabVar.b && tpa.f(this.c, tabVar.c) && tpa.f(this.d, tabVar.d) && tpa.f(this.e, tabVar.e) && tpa.f(this.f, tabVar.f) && tpa.f(this.g, tabVar.g) && tpa.f(this.h, tabVar.h) && tpa.f(this.i, tabVar.i) && this.j == tabVar.j && this.k == tabVar.k;
    }

    public final int hashCode() {
        int iD = ms2.d(Long.hashCode(this.a) * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        od0 od0Var = this.g;
        int iHashCode5 = (iHashCode4 + (od0Var == null ? 0 : od0Var.hashCode())) * 31;
        jqe jqeVar = this.h;
        int iHashCode6 = (iHashCode5 + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        jqe jqeVar2 = this.i;
        return Boolean.hashCode(this.k) + ms2.d((iHashCode6 + (jqeVar2 != null ? jqeVar2.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAppBarState(idForAvatar=");
        sb.append(this.a);
        sb.append(", editEnabled=");
        sb.append(this.b);
        sb.append(", avatarUrls=");
        sb.append(this.c);
        sb.append(", lowResAvatarUrl=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append((Object) this.e);
        sb.append(", abbreviation=");
        sb.append((Object) this.f);
        sb.append(", avatarOverlay=");
        sb.append(this.g);
        sb.append(", subtitle=");
        sb.append(this.h);
        sb.append(", link=");
        sb.append(this.i);
        sb.append(", isBlocked=");
        sb.append(this.j);
        sb.append(", isVerified=");
        return au1.j(sb, this.k, ")");
    }

    public tab(long j, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, od0 od0Var, jqe jqeVar, jqe jqeVar2, boolean z2, boolean z3) {
        this.a = j;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = od0Var;
        this.h = jqeVar;
        this.i = jqeVar2;
        this.j = z2;
        this.k = z3;
    }
}
