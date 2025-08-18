package defpackage;

import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class qm8 extends xm8 {
    public final String X;
    public final String Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String s0;
    public final j0e t0;
    public final int u0;

    public qm8(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, q0e q0eVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = str4;
        this.s0 = str5;
        this.t0 = q0eVar;
        Parcelable.Creator<ih2> creator = ih2.CREATOR;
        this.u0 = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm8)) {
            return false;
        }
        qm8 qm8Var = (qm8) obj;
        return this.a == qm8Var.a && this.b == qm8Var.b && this.c == qm8Var.c && tpa.f(this.o, qm8Var.o) && tpa.f(this.X, qm8Var.X) && tpa.f(this.Y, qm8Var.Y) && tpa.f(this.Z, qm8Var.Z) && tpa.f(this.s0, qm8Var.s0) && tpa.f(this.t0, qm8Var.t0);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.t0.hashCode() + rh4.d(rh4.d(rh4.d(rh4.d(rh4.d(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31, this.Z), 31, this.s0);
    }

    @Override // defpackage.xm8
    public final long i() {
        return this.c;
    }

    @Override // defpackage.xm8
    public final long j() {
        return this.b;
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.u0;
    }

    public final String toString() {
        return "Audio(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", attachLocalId=" + this.o + ", audioUrl=" + this.X + ", audioArtist=" + this.Y + ", subtitle=" + this.Z + ", playerTitle=" + this.s0 + ", state=" + this.t0 + ")";
    }
}
