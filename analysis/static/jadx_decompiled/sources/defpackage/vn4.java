package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final class vn4 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DownloadFileAttachWorker Y;
    public int Z;
    public DownloadFileAttachWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.Y = downloadFileAttachWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doForegroundWork(this);
    }
}
