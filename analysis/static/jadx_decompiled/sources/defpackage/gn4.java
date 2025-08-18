package defpackage;

/* loaded from: classes2.dex */
public final class gn4 {
    public static final /* synthetic */ bc7[] h;
    public static final String i;
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;

    static {
        hob hobVar = new hob(gn4.class, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0);
        oec oecVar = nec.a;
        h = new bc7[]{hobVar, zr6.e(oecVar, gn4.class, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), zr6.f(gn4.class, "draftSerializer", "getDraftSerializer()Lru/ok/tamtam/draft/DraftSerializer;", 0, oecVar), zr6.f(gn4.class, "messageController", "getMessageController()Lru/ok/tamtam/messages/MessageController;", 0, oecVar), zr6.f(gn4.class, "api", "getApi()Lru/ok/tamtam/api/Api;", 0, oecVar), zr6.f(gn4.class, "tamTamObservables", "getTamTamObservables()Lru/ok/tamtam/rx/TamTamObservables;", 0, oecVar), zr6.f(gn4.class, "ioNetworkScheduler", "getIoNetworkScheduler()Lio/reactivex/rxjava3/core/Scheduler;", 0, oecVar)};
        i = gn4.class.getName();
    }

    public gn4(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, rm4 rm4Var6, rm4 rm4Var7) {
        this.a = rm4Var;
        this.b = rm4Var2;
        this.c = rm4Var3;
        this.d = rm4Var4;
        this.e = rm4Var5;
        this.f = rm4Var6;
        this.g = rm4Var7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[PHI: r8
      0x00e2: PHI (r8v3 java.lang.Long) = (r8v2 java.lang.Long), (r8v1 java.lang.Long) binds: [B:47:0x00f8, B:42:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Long r13, java.lang.Long r14, defpackage.n7d r15) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn4.a(java.lang.Long, java.lang.Long, n7d):void");
    }

    public final p82 b() {
        bc7 bc7Var = h[0];
        return (p82) this.a.get();
    }

    public final void c(e52 e52Var, n7d n7dVar) {
        hm9.n(i, "Save server draft");
        bc7 bc7Var = h[2];
        b().k(e52Var.a, n7dVar.g, ((jp4) this.c.get()).b(e52Var.a, n7dVar));
    }
}
