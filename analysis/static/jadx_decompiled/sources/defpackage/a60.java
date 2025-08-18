package defpackage;

/* loaded from: classes2.dex */
public final class a60 extends pi0 {
    public final long b;
    public final int c;
    public final long o;

    public a60(int i, long j, long j2) {
        this.c = i;
        this.b = j;
        this.o = j2;
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaybackEvent{type=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", chatId=");
        return z7b.i(sb, this.o, '}');
    }
}
