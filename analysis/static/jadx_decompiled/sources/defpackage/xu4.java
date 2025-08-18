package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class xu4 implements jv4 {
    public final String a;
    public final long b;
    public final String c;
    public final CharSequence d;
    public final a73 e;
    public final String f;
    public final a73 g;
    public final String h;
    public final jqe i;
    public final String j;
    public final faf k;
    public final boolean l;
    public final Long m;

    public xu4(String str, long j, String str2, CharSequence charSequence, a73 a73Var, String str3, a73 a73Var2, String str4, jqe jqeVar, String str5, faf fafVar, boolean z, Long l) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = charSequence;
        this.e = a73Var;
        this.f = str3;
        this.g = a73Var2;
        this.h = str4;
        this.i = jqeVar;
        this.j = str5;
        this.k = fafVar;
        this.l = z;
        this.m = l;
    }

    public static xu4 c(xu4 xu4Var, String str, a73 a73Var, String str2, a73 a73Var2, String str3, jqe jqeVar, faf fafVar, boolean z, Long l, int i) {
        return new xu4(xu4Var.a, xu4Var.b, (i & 4) != 0 ? xu4Var.c : str, xu4Var.d, (i & 16) != 0 ? xu4Var.e : a73Var, (i & 32) != 0 ? xu4Var.f : str2, (i & 64) != 0 ? xu4Var.g : a73Var2, (i & 128) != 0 ? xu4Var.h : str3, (i & 256) != 0 ? xu4Var.i : jqeVar, xu4Var.j, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? xu4Var.k : fafVar, (i & 2048) != 0 ? xu4Var.l : z, (i & 4096) != 0 ? xu4Var.m : l);
    }

    @Override // defpackage.jv4
    public final boolean a(jv4 jv4Var) {
        if (jv4Var == null || !(jv4Var instanceof xu4)) {
            return false;
        }
        xu4 xu4Var = (xu4) jv4Var;
        if (!(!tpa.f(xu4Var.h, this.h))) {
            if (xu4Var.k == this.k && !(!tpa.f(xu4Var.c, this.c)) && !(!tpa.f(xu4Var.f, this.f))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jv4
    public final boolean b(jv4 jv4Var) {
        if (jv4Var == null || !(jv4Var instanceof xu4)) {
            return false;
        }
        xu4 xu4Var = (xu4) jv4Var;
        return (xu4Var.k != this.k) || (tpa.f(xu4Var.e, this.e) ^ true) || (tpa.f(xu4Var.g, this.g) ^ true) || !tpa.f(this.i, xu4Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu4)) {
            return false;
        }
        xu4 xu4Var = (xu4) obj;
        return tpa.f(this.a, xu4Var.a) && this.b == xu4Var.b && tpa.f(this.c, xu4Var.c) && tpa.f(this.d, xu4Var.d) && tpa.f(this.e, xu4Var.e) && tpa.f(this.f, xu4Var.f) && tpa.f(this.g, xu4Var.g) && tpa.f(this.h, xu4Var.h) && tpa.f(this.i, xu4Var.i) && tpa.f(this.j, xu4Var.j) && this.k == xu4Var.k && this.l == xu4Var.l && tpa.f(this.m, xu4Var.m);
    }

    public final int hashCode() {
        String str = this.a;
        int iM = h4f.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iM + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        a73 a73Var = this.e;
        int iHashCode3 = (iHashCode2 + (a73Var == null ? 0 : a73Var.a.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a73 a73Var2 = this.g;
        int iHashCode5 = (iHashCode4 + (a73Var2 == null ? 0 : a73Var2.a.hashCode())) * 31;
        String str4 = this.h;
        int iF = k7d.f((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int iHashCode6 = (iF + (str5 == null ? 0 : str5.hashCode())) * 31;
        faf fafVar = this.k;
        int iD = ms2.d((iHashCode6 + (fafVar == null ? 0 : fafVar.hashCode())) * 31, 31, this.l);
        Long l = this.m;
        return iD + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "EditContactProfileUiModel(avatarUrl=" + this.a + ", contactId=" + this.b + ", firstName=" + this.c + ", abbreviation=" + ((Object) this.d) + ", firstNameError=" + this.e + ", lastName=" + this.f + ", lastNameError=" + this.g + ", description=" + this.h + ", shortLink=" + this.i + ", phoneNumber=" + this.j + ", inactiveTtl=" + this.k + ", isInDeleteState=" + this.l + ", removeProfileTimestamp=" + this.m + ")";
    }
}
