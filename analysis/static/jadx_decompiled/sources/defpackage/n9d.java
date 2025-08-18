package defpackage;

/* loaded from: classes2.dex */
public final class n9d extends d8d {
    public final long b;

    public n9d(long j) {
        this.b = j;
    }

    @Override // defpackage.d8d
    public final void x() {
        p82 p82VarB = b();
        p82VarB.getClass();
        StringBuilder sb = new StringBuilder("storeChatFromCache chatId = ");
        long j = this.b;
        sb.append(j);
        hm9.n("p82", sb.toString());
        l92 l92VarA = p82VarB.A(j);
        if (l92VarA != null) {
            ((k24) ((c34) p82VarB.l.get())).b.h(j, l92VarA.c);
            return;
        }
        hm9.p("p82", "storeChatFromCache, chatId = " + j, null);
    }
}
