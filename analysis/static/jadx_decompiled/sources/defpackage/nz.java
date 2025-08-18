package defpackage;

/* loaded from: classes2.dex */
public final class nz {
    public static final /* synthetic */ bc7[] h;
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;

    static {
        hob hobVar = new hob(nz.class, "api", "getApi()Lru/ok/tamtam/api/Api;", 0);
        oec oecVar = nec.a;
        h = new bc7[]{hobVar, zr6.e(oecVar, nz.class, "clientPrefs", "getClientPrefs()Lru/ok/tamtam/prefs/ClientPrefs;", 0), zr6.f(nz.class, "fileAttachDownloader", "getFileAttachDownloader()Lru/ok/tamtam/FileAttachDownloader;", 0, oecVar), zr6.f(nz.class, "uiBus", "getUiBus()Lcom/squareup/otto/Bus;", 0, oecVar), zr6.f(nz.class, "fileSystem", "getFileSystem()Lru/ok/tamtam/FileSystem;", 0, oecVar)};
    }

    public nz(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, rm4 rm4Var6, rm4 rm4Var7) {
        this.a = rm4Var6;
        this.b = rm4Var7;
        this.c = rm4Var;
        this.d = rm4Var2;
        this.e = rm4Var3;
        this.f = rm4Var4;
        this.g = rm4Var5;
    }
}
