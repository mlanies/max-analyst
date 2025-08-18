package defpackage;

/* loaded from: classes2.dex */
public final class p72 extends pi0 {
    public final /* synthetic */ int b = 1;
    public final long c;

    public p72(long j) {
        this.c = j;
    }

    @Override // defpackage.pi0
    public final String toString() {
        switch (this.b) {
            case 0:
                return "ChatComplainEvent{chatId=" + this.c + "} " + super.toString();
            default:
                return z7b.i(new StringBuilder("ReadMarkEvent{chatId="), this.c, '}');
        }
    }

    public p72(long j, long j2) {
        super(j);
        this.c = j2;
    }
}
