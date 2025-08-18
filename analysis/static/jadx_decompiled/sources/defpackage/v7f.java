package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class v7f extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ UploadFileAttachWorker Y;
    public int Z;
    public UploadFileAttachWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7f(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.Y = uploadFileAttachWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doForegroundWork(this);
    }
}
