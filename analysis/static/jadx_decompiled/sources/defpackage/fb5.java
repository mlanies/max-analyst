package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class fb5 implements ol7 {
    public final CharSequence X;
    public final CharSequence Y;
    public final boolean Z;
    public final long a;
    public final Uri b;
    public final boolean c;
    public final boolean o;
    public final CharSequence s0;

    public fb5(long j, Uri uri, boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2, boolean z3, CharSequence charSequence3) {
        this.a = j;
        this.b = uri;
        this.c = z;
        this.o = z2;
        this.X = charSequence;
        this.Y = charSequence2;
        this.Z = z3;
        this.s0 = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5Var = (fb5) obj;
        return this.a == fb5Var.a && tpa.f(this.b, fb5Var.b) && this.c == fb5Var.c && this.o == fb5Var.o && tpa.f(this.X, fb5Var.X) && tpa.f(this.Y, fb5Var.Y) && this.Z == fb5Var.Z && tpa.f(this.s0, fb5Var.s0);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Uri uri = this.b;
        int iF = rh4.f(this.X, ms2.d(ms2.d((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.o), 31);
        CharSequence charSequence = this.Y;
        return this.s0.hashCode() + ms2.d((iF + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.Z);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        int i = this.Z ? p8a.u : p8a.v;
        int i2 = vs2.a;
        return i;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        eb5 eb5Var = null;
        fb5 fb5Var = ol7Var instanceof fb5 ? (fb5) ol7Var : null;
        if (fb5Var != null) {
            eb5Var = new eb5(7);
            boolean zF = tpa.f(this.b, fb5Var.b);
            BitSet bitSet = (BitSet) eb5Var.b;
            bitSet.set(0, !zF);
            bitSet.set(1, this.c != fb5Var.c);
            bitSet.set(2, !tpa.f(this.X, fb5Var.X));
            bitSet.set(3, !tpa.f(this.Y, fb5Var.Y));
            bitSet.set(4, this.Z != fb5Var.Z);
            bitSet.set(5, !tpa.f(this.s0, fb5Var.s0));
            bitSet.set(6, this.o != fb5Var.o);
        }
        return eb5Var;
    }

    public final String toString() {
        return "FakeChatModel(contactId=" + this.a + ", avatar=" + this.b + ", isOnline=" + this.c + ", isVerified=" + this.o + ", title=" + ((Object) this.X) + ", subtitle=" + ((Object) this.Y) + ", isRegistered=" + this.Z + ", abbreviation=" + ((Object) this.s0) + ")";
    }
}
