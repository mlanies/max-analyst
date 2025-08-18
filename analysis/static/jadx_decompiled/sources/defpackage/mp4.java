package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class mp4 {
    public static final /* synthetic */ bc7[] f;
    public static final String g;
    public final ztc a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final AtomicBoolean e = new AtomicBoolean();

    static {
        hob hobVar = new hob(mp4.class, "authStorage", "getAuthStorage()Lru/ok/tamtam/AuthStorage;", 0);
        oec oecVar = nec.a;
        f = new bc7[]{hobVar, zr6.e(oecVar, mp4.class, "fileAttachUploader", "getFileAttachUploader()Lru/ok/tamtam/FileAttachUploader;", 0), zr6.f(mp4.class, "draftUploadsRepository", "getDraftUploadsRepository()Lru/ok/tamtam/upload/drafts/DraftUploadsRepository;", 0, oecVar)};
        g = mp4.class.getName();
    }

    public mp4(ztc ztcVar, rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3) {
        this.a = ztcVar;
        this.b = rm4Var2;
        this.c = rm4Var;
        this.d = rm4Var3;
    }
}
