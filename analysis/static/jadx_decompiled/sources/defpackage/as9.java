package defpackage;

/* loaded from: classes2.dex */
public final class as9 {
    public static final /* synthetic */ bc7[] d;
    public static final String e;
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;

    static {
        hob hobVar = new hob(as9.class, "prefs", "getPrefs()Lru/ok/tamtam/Prefs;", 0);
        oec oecVar = nec.a;
        d = new bc7[]{hobVar, zr6.e(oecVar, as9.class, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), zr6.f(as9.class, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0, oecVar)};
        e = as9.class.getName();
    }

    public as9(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3) {
        this.a = rm4Var;
        this.b = rm4Var2;
        this.c = rm4Var3;
    }

    public final m7b a() {
        bc7 bc7Var = d[0];
        return (m7b) this.a.get();
    }
}
