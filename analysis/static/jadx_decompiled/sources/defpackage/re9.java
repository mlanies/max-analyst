package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class re9 extends pi0 {
    public final List X;
    public final mg4 Y;
    public final long b;
    public final long c;
    public final long o;

    public re9(long j, List list, mg4 mg4Var) {
        this.b = j;
        this.Y = mg4Var;
        this.c = 0L;
        this.o = 0L;
        this.X = list;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "MsgDeleteEvent{chatId=" + this.b + ", startTime=" + this.c + ", endTime=" + this.o + ", messageIds=" + this.X.size() + ", itemType=" + this.Y + '}';
    }

    public re9(long j, long j2, long j3, mg4 mg4Var) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = new ArrayList();
        this.Y = mg4Var;
    }
}
