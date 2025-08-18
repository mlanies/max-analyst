package defpackage;

import android.content.Context;
import java.io.File;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class mh5 {
    public static final /* synthetic */ bc7[] f;
    public static final String g;
    public final Context a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final khe e = new khe(new fh5(1));

    static {
        hob hobVar = new hob(mh5.class, "fileSystem", "getFileSystem()Lru/ok/tamtam/FileSystem;", 0);
        oec oecVar = nec.a;
        f = new bc7[]{hobVar, zr6.e(oecVar, mh5.class, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), zr6.f(mh5.class, "dispatcher", "getDispatcher()Lru/ok/tamtam/coroutines/IoDispatcher;", 0, oecVar), zr6.f(mh5.class, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0, oecVar)};
        g = mh5.class.getName();
    }

    public mh5(Context context, rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3) {
        this.a = context;
        this.b = rm4Var;
        this.c = rm4Var2;
        this.d = rm4Var3;
    }

    public final void a(File file, boolean z) {
        if (file == null) {
            hm9.m0(g, "file is null!", new Object[0]);
            return;
        }
        sx3 sx3Var = (sx3) this.e.getValue();
        bc7 bc7Var = f[2];
        j47.T(sx3Var, ((p67) this.c.get()).a.plus(xq9.a), null, new lh5(file, this, z, null), 2);
    }

    public final void b(File file) {
        try {
            bc7 bc7Var = f[3];
            qyc qycVar = (qyc) ((y7d) this.d.get());
            qycVar.getClass();
            PmsKey pmsKey = PmsKey.f66maxdownloadedsizefornotifykb;
            long j = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            a(file, ((long) ((int) qycVar.q(pmsKey, j))) < ote.c(file.length(), 0L) / j);
        } catch (Throwable th) {
            hm9.p(g, "notifyWithForegroundCheckAndSize fail!", th);
        }
    }
}
