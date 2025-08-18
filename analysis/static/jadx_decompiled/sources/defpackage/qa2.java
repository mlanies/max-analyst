package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qa2 implements Serializable {
    public final Set X;
    public final Set Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final Set o;
    public final List s0;
    public final long t0;
    public final Map u0;
    public final List v0;
    public final Set w0;

    public qa2(String str, String str2, String str3, Set set, Set set2, Set set3, boolean z, List list, long j, Map map, List list2, Set set4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = set;
        this.X = set2;
        this.Y = set3;
        this.Z = z;
        this.s0 = list;
        this.t0 = j;
        this.u0 = map;
        this.v0 = list2;
        this.w0 = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa2)) {
            return false;
        }
        qa2 qa2Var = (qa2) obj;
        return tpa.f(this.a, qa2Var.a) && tpa.f(this.b, qa2Var.b) && tpa.f(this.c, qa2Var.c) && tpa.f(this.o, qa2Var.o) && tpa.f(this.X, qa2Var.X) && tpa.f(this.Y, qa2Var.Y) && this.Z == qa2Var.Z && tpa.f(this.s0, qa2Var.s0) && this.t0 == qa2Var.t0 && tpa.f(this.u0, qa2Var.u0) && tpa.f(this.v0, qa2Var.v0) && tpa.f(this.w0, qa2Var.w0);
    }

    public final int hashCode() {
        int iD = rh4.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.w0.hashCode() + k7d.g(this.v0, (this.u0.hashCode() + h4f.m(k7d.g(this.s0, ms2.d((this.Y.hashCode() + ((this.X.hashCode() + ((this.o.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.Z), 31), 31, this.t0)) * 31, 31);
    }

    public final String toString() {
        return "ChatFolder(id=" + this.a + ", title=" + this.b + ", emoji=" + this.c + ", include=" + this.o + ", favorites=" + this.X + ", filters=" + this.Y + ", hideEmpty=" + this.Z + ", elements=" + this.s0 + ", creatorId=" + this.t0 + ", filterSubjects=" + this.u0 + ", widgets=" + this.v0 + ", options=" + this.w0 + ")";
    }
}
