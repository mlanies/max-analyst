package defpackage;

/* loaded from: classes2.dex */
public final class ut7 extends pi0 {
    public final gi9 X;
    public final boolean b;
    public final boolean c;
    public final boolean o;

    public ut7(long j, boolean z, boolean z2, boolean z3, gi9 gi9Var) {
        super(j);
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = gi9Var;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "LoginEvent(requestId=" + this.a + ", isFirstLogin=" + this.b + ", hasNewMessages=" + this.c + ", videoChatHistory=" + this.o + ", chats=" + this.X.d + ")";
    }
}
