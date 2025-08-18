package defpackage;

/* loaded from: classes2.dex */
public final class hi7 extends pi0 {
    public final dh6 X;
    public final def Y;
    public final Long Z;
    public final Long b;
    public final long c;
    public final kq3 o;
    public final String s0;

    public hi7(long j, Long l, long j2, kq3 kq3Var, dh6 dh6Var, def defVar, Long l2, String str) {
        super(j);
        this.b = l;
        this.c = j2;
        this.o = kq3Var;
        this.X = dh6Var;
        this.Y = defVar;
        this.Z = l2;
        this.s0 = str;
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkInfoEvent{chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", contactSearchResult=");
        sb.append(this.o);
        sb.append(", groupChatInfo=");
        sb.append(this.X);
        sb.append(", videoConference=");
        sb.append(this.Y);
        sb.append(", stickerSetId=");
        sb.append(this.Z);
        sb.append(", startPayload='");
        return zr6.l(sb, this.s0, "'}");
    }
}
