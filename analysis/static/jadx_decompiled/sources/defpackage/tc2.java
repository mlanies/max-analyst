package defpackage;

/* loaded from: classes2.dex */
public final class tc2 extends pi0 {
    public final long b;
    public final Long c;
    public final String o = null;

    public tc2(long j, Long l) {
        this.b = j;
        this.c = l;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "ChatLastReactionUpdatedEvent{chatId=" + this.b + "'lastReactionMessageId=" + this.c + "', lastReaction=" + this.o + "}" + super.toString();
    }
}
