package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final class wn4 extends ffe implements a66 {
    public final /* synthetic */ DownloadFileAttachWorker X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = downloadFileAttachWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wn4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wn4(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        s10 s10Var;
        String str;
        od2.a0(obj);
        DownloadFileAttachWorker downloadFileAttachWorker = this.X;
        if (downloadFileAttachWorker.g().c > 0) {
            return ((kk5) downloadFileAttachWorker.d()).s(downloadFileAttachWorker.g().c);
        }
        if (downloadFileAttachWorker.g().d > 0) {
            return ((kk5) downloadFileAttachWorker.d()).d(downloadFileAttachWorker.g().d);
        }
        if (downloadFileAttachWorker.g().e > 0) {
            return ((kk5) downloadFileAttachWorker.d()).k(downloadFileAttachWorker.g().e);
        }
        if (downloadFileAttachWorker.g().f > 0) {
            zi5 zi5VarD = downloadFileAttachWorker.d();
            long j = downloadFileAttachWorker.g().f;
            kk5 kk5Var = (kk5) zi5VarD;
            kk5Var.getClass();
            return new File(kk5.g(kk5Var.b(), "stickerCache"), ey8.h(j, "sticker_"));
        }
        File file = null;
        if (downloadFileAttachWorker.g().j > 0) {
            cu8 cu8VarQ = downloadFileAttachWorker.e().q(downloadFileAttachWorker.g().a);
            if (cu8VarQ != null) {
                k8g k8gVar = cu8VarQ.z0;
                if (k8gVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                l20 l20VarK = k8gVar.k(g20.u0);
                if (l20VarK != null && (s10Var = l20VarK.j) != null && (str = l20VarK.s) != null && str.length() != 0) {
                    File file2 = new File(str);
                    if (file2.exists() && file2.length() == s10Var.b && file2.lastModified() == l20VarK.w) {
                        file = file2;
                    }
                }
            }
            if (file == null) {
                return ((kk5) downloadFileAttachWorker.d()).i(downloadFileAttachWorker.g().k);
            }
        }
        return file;
    }
}
