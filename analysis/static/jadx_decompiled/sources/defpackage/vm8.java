package defpackage;

import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class vm8 extends xm8 {
    public final String X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final int s0;

    public vm8(long j, long j2, long j3, String str, String str2, CharSequence charSequence, CharSequence charSequence2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = charSequence;
        this.Z = charSequence2;
        Parcelable.Creator<ih2> creator = ih2.CREATOR;
        this.s0 = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm8)) {
            return false;
        }
        vm8 vm8Var = (vm8) obj;
        return this.a == vm8Var.a && this.b == vm8Var.b && this.c == vm8Var.c && tpa.f(this.o, vm8Var.o) && tpa.f(this.X, vm8Var.X) && tpa.f(this.Y, vm8Var.Y) && tpa.f(this.Z, vm8Var.Z);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.o;
        int iD = rh4.d((iM + (str == null ? 0 : str.hashCode())) * 31, 31, this.X);
        CharSequence charSequence = this.Y;
        int iHashCode = (iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.Z;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
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
    public final int l() {
        return this.s0;
    }

    public final String toString() {
        return "Link(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", previewUrl=" + this.o + ", title=" + this.X + ", subtitle=" + ((Object) this.Y) + ", link=" + ((Object) this.Z) + ")";
    }
}
