package defpackage;

/* loaded from: classes2.dex */
public final class qc2 extends pi0 {
    public final String b;
    public final long c;
    public final int o;

    public qc2(int i, long j, long j2, String str) {
        super(j);
        this.b = str;
        this.c = j2;
        this.o = i;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "ChatJoinEvent{link='" + this.b + "', chatId=" + this.c + ", type=" + ms2.p(this.o) + '}' + super.toString();
    }
}
