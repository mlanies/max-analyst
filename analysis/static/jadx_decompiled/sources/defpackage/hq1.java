package defpackage;

/* loaded from: classes2.dex */
public final class hq1 extends pi0 {
    public final long b;
    public final String c;

    public hq1(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackAnswerEvent{chatId=");
        sb.append(this.b);
        sb.append("text=");
        return rh4.m(sb, this.c, '}');
    }
}
