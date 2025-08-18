package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class af9 extends pi0 {
    public final List X;
    public final long b;
    public final List c;
    public final List o;

    public af9(long j, long j2, ArrayList arrayList, List list, List list2) {
        super(j);
        this.b = j2;
        this.c = arrayList;
        this.o = list;
        this.X = list2;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "MsgGetEvent{serverChatId=" + this.b + ", serverMessageIds=" + this.c + ", messages=" + this.o + ", requestedMessageIds=" + this.X + '}';
    }
}
