package defpackage;

import android.app.DownloadManager;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class lh5 extends ffe implements a66 {
    public final /* synthetic */ File X;
    public final /* synthetic */ mh5 Y;
    public final /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh5(File file, mh5 mh5Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = file;
        this.Y = mh5Var;
        this.Z = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lh5 lh5Var = (lh5) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lh5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lh5(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        mh5 mh5Var = this.Y;
        File file = this.X;
        od2.a0(obj);
        try {
            String strQ = tfg.q(file.getName());
            if (strQ == null || strQ.length() == 0) {
                strQ = "*/*";
            }
            String str = strQ;
            boolean z = this.Z;
            Object systemService = mh5Var.a.getSystemService("download");
            DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
            if (downloadManager != null) {
                downloadManager.addCompletedDownload(file.getName(), file.getName(), false, str, file.getAbsolutePath(), file.length(), z);
            }
        } catch (Throwable th) {
            hm9.p(mh5.g, "fail!", th);
            mh5Var.getClass();
            bc7 bc7Var = mh5.f[1];
            ((cba) ((o45) mh5Var.b.get())).c(new HandledException(th), false);
        }
        return e5f.a;
    }
}
