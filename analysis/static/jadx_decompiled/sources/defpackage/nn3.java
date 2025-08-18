package defpackage;

import android.net.Uri;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class nn3 implements ol7 {
    public final boolean A0;
    public final int B0;
    public final CharSequence X;
    public final CharSequence Y;
    public final Uri Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final List o;
    public final boolean s0;
    public final boolean t0;
    public final CharSequence u0;
    public final boolean v0;
    public final pua w0;
    public final Boolean x0;
    public final boolean y0;
    public final int z0;

    public nn3(long j, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, Uri uri, boolean z, boolean z2, CharSequence charSequence5, boolean z3, pua puaVar, Boolean bool, boolean z4, int i, boolean z5) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = list;
        this.X = charSequence3;
        this.Y = charSequence4;
        this.Z = uri;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = charSequence5;
        this.v0 = z3;
        this.w0 = puaVar;
        this.x0 = bool;
        this.y0 = z4;
        this.z0 = i;
        this.A0 = z5;
        this.B0 = charSequence4 == null ? z8a.m : z8a.s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn3)) {
            return false;
        }
        nn3 nn3Var = (nn3) obj;
        return this.a == nn3Var.a && tpa.f(this.b, nn3Var.b) && tpa.f(this.c, nn3Var.c) && tpa.f(this.o, nn3Var.o) && tpa.f(this.X, nn3Var.X) && tpa.f(this.Y, nn3Var.Y) && tpa.f(this.Z, nn3Var.Z) && this.s0 == nn3Var.s0 && this.t0 == nn3Var.t0 && tpa.f(this.u0, nn3Var.u0) && this.v0 == nn3Var.v0 && tpa.f(this.w0, nn3Var.w0) && tpa.f(this.x0, nn3Var.x0) && this.y0 == nn3Var.y0 && this.z0 == nn3Var.z0 && this.A0 == nn3Var.A0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = rh4.f(this.b, Long.hashCode(this.a) * 31, 31);
        CharSequence charSequence = this.c;
        int iHashCode = (iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.o;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence2 = this.X;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.Y;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Uri uri = this.Z;
        int iD = ms2.d(rh4.f(this.u0, ms2.d(ms2.d((iHashCode4 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.s0), 31, this.t0), 31), 31, this.v0);
        pua puaVar = this.w0;
        int iHashCode5 = (iD + (puaVar == null ? 0 : puaVar.hashCode())) * 31;
        Boolean bool = this.x0;
        return Boolean.hashCode(this.A0) + k7d.e(this.z0, ms2.d((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.y0), 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.B0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        nn3 nn3Var = ol7Var instanceof nn3 ? (nn3) ol7Var : null;
        if (nn3Var == null) {
            return null;
        }
        Boolean bool = this.x0;
        Boolean bool2 = nn3Var.x0;
        if (tpa.f(bool, bool2)) {
            return null;
        }
        return new mn3(bool2);
    }

    public final String toString() {
        return "ContactListItem(id=" + this.a + ", name=" + ((Object) this.b) + ", shortName=" + ((Object) this.c) + ", phones=" + this.o + ", subtitle=" + ((Object) this.X) + ", button=" + ((Object) this.Y) + ", avatar=" + this.Z + ", isOnline=" + this.s0 + ", isVerified=" + this.t0 + ", abbreviation=" + ((Object) this.u0) + ", isSelf=" + this.v0 + ", availablePhone=" + this.w0 + ", isSelected=" + this.x0 + ", hasCallActions=" + this.y0 + ", presence=" + this.z0 + ", isBot=" + this.A0 + ")";
    }

    public /* synthetic */ nn3(long j, CharSequence charSequence, String str, List list, CharSequence charSequence2, CharSequence charSequence3, Uri uri, boolean z, boolean z2, CharSequence charSequence4, boolean z3, pua puaVar, int i, boolean z4, int i2) {
        this(j, charSequence, str, list, charSequence2, charSequence3, uri, z, z2, charSequence4, (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? false : z3, (i2 & 2048) != 0 ? null : puaVar, null, false, (i2 & 16384) != 0 ? 0 : i, z4);
    }
}
