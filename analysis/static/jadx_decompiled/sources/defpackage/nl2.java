package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class nl2 implements ol7, vk6 {
    public final boolean A0;
    public final long B0;
    public final Long C0;
    public final long D0;
    public final CharSequence E0;
    public final boolean F0;
    public final boolean G0;
    public final int H0;
    public final long I0;
    public final CharSequence X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final Uri b;
    public final CharSequence c;
    public final CharSequence o;
    public final String s0;
    public final boolean t0;
    public final boolean u0;
    public final long v0;
    public final ml2 w0;
    public final int x0;
    public final boolean y0;
    public final boolean z0;

    public nl2(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, String str, boolean z, boolean z2, long j2, ml2 ml2Var, int i, boolean z3, boolean z4, boolean z5, long j3, Long l, long j4, CharSequence charSequence6, boolean z6, boolean z7) {
        this.a = j;
        this.b = uri;
        this.c = charSequence;
        this.o = charSequence2;
        this.X = charSequence3;
        this.Y = charSequence4;
        this.Z = charSequence5;
        this.s0 = str;
        this.t0 = z;
        this.u0 = z2;
        this.v0 = j2;
        this.w0 = ml2Var;
        this.x0 = i;
        this.y0 = z3;
        this.z0 = z4;
        this.A0 = z5;
        this.B0 = j3;
        this.C0 = l;
        this.D0 = j4;
        this.E0 = charSequence6;
        this.F0 = z6;
        this.G0 = z7;
        this.H0 = j3 != 0 ? vs2.b : vs2.a;
        this.I0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl2)) {
            return false;
        }
        nl2 nl2Var = (nl2) obj;
        return this.a == nl2Var.a && tpa.f(this.b, nl2Var.b) && tpa.f(this.c, nl2Var.c) && tpa.f(this.o, nl2Var.o) && tpa.f(this.X, nl2Var.X) && tpa.f(this.Y, nl2Var.Y) && tpa.f(this.Z, nl2Var.Z) && tpa.f(this.s0, nl2Var.s0) && this.t0 == nl2Var.t0 && this.u0 == nl2Var.u0 && this.v0 == nl2Var.v0 && this.w0 == nl2Var.w0 && this.x0 == nl2Var.x0 && this.y0 == nl2Var.y0 && this.z0 == nl2Var.z0 && this.A0 == nl2Var.A0 && this.B0 == nl2Var.B0 && tpa.f(this.C0, nl2Var.C0) && this.D0 == nl2Var.D0 && tpa.f(this.E0, nl2Var.E0) && this.F0 == nl2Var.F0 && this.G0 == nl2Var.G0;
    }

    @Override // defpackage.vk6
    /* renamed from: getId */
    public final long getA() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.I0;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.I0 == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Uri uri = this.b;
        int iF = rh4.f(this.c, (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        CharSequence charSequence = this.o;
        int iF2 = rh4.f(this.X, (iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        CharSequence charSequence2 = this.Y;
        int iHashCode2 = (iF2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.Z;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.s0;
        int iM = h4f.m(ms2.d(ms2.d(ms2.d(k7d.e(this.x0, (this.w0.hashCode() + h4f.m(ms2.d(ms2.d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.t0), 31, this.u0), 31, this.v0)) * 31, 31), 31, this.y0), 31, this.z0), 31, this.A0), 31, this.B0);
        Long l = this.C0;
        return Boolean.hashCode(this.G0) + ms2.d(rh4.f(this.E0, h4f.m((iM + (l != null ? l.hashCode() : 0)) * 31, 31, this.D0), 31), 31, this.F0);
    }

    @Override // defpackage.vk6
    /* renamed from: k */
    public final long getC() {
        return this.v0;
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.H0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        ll2 ll2Var = null;
        nl2 nl2Var = ol7Var instanceof nl2 ? (nl2) ol7Var : null;
        if (nl2Var != null) {
            ll2Var = new ll2(7);
            boolean z = this.t0 != nl2Var.t0;
            BitSet bitSet = (BitSet) ll2Var.b;
            bitSet.set(0, z);
            bitSet.set(1, (tpa.f(this.b, nl2Var.b) && this.D0 == nl2Var.D0 && tpa.f(this.E0, nl2Var.E0)) ? false : true);
            bitSet.set(2, !tpa.f(this.c, nl2Var.c));
            bitSet.set(3, !tpa.f(this.o, nl2Var.o));
            bitSet.set(4, (tpa.f(this.X, nl2Var.X) && tpa.f(this.Y, nl2Var.Y)) ? false : true);
            bitSet.set(5, !tpa.f(this.Z, nl2Var.Z));
            bitSet.set(6, !tpa.f(this.s0, nl2Var.s0));
            bitSet.set(7, this.v0 != nl2Var.v0);
            bitSet.set(8, this.w0 != nl2Var.w0);
            bitSet.set(9, this.x0 != nl2Var.x0);
            bitSet.set(10, this.y0 != nl2Var.y0);
            bitSet.set(11, this.z0 != nl2Var.z0);
            bitSet.set(12, this.A0 != nl2Var.A0);
            bitSet.set(13, this.B0 != nl2Var.B0);
            bitSet.set(14, this.G0 != nl2Var.G0);
        }
        return ll2Var;
    }

    public final String toString() {
        return "ChatModel(chatId=" + this.a + ", title=" + ((Object) pag.x(this.c)) + ", time=" + this.v0 + ")";
    }
}
