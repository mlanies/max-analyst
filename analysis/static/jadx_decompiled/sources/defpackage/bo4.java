package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final class bo4 extends hu3 {
    public cu8 X;
    public long Y;
    public /* synthetic */ Object Z;
    public DownloadFileAttachWorker o;
    public final /* synthetic */ DownloadFileAttachWorker s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.s0 = downloadFileAttachWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.h(null, null, 0, 0L, 0L, null, this);
    }
}
