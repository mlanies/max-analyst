package defpackage;

/* loaded from: classes2.dex */
public final class mna extends pi0 {
    public final String X;
    public final long Y;
    public final mg4 Z;
    public final long b;
    public final long c;
    public final long o;

    public mna(long j, long j2, long j3, String str, long j4, mg4 mg4Var) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = str;
        this.Y = j4;
        this.Z = mg4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mna)) {
            return false;
        }
        mna mnaVar = (mna) obj;
        return this.b == mnaVar.b && this.c == mnaVar.c && this.o == mnaVar.o && tpa.f(this.X, mnaVar.X) && this.Y == mnaVar.Y && this.Z == mnaVar.Z;
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o);
        String str = this.X;
        return this.Z.hashCode() + h4f.m((iM + (str == null ? 0 : str.hashCode())) * 31, 31, this.Y);
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "OutgoingMessageEvent(chatId=" + this.b + ", cid=" + this.c + ", messageId=" + this.o + ", tag=" + this.X + ", sender=" + this.Y + ", itemType=" + this.Z + ")";
    }
}
