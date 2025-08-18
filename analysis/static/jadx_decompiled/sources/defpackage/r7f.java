package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* loaded from: classes2.dex */
public final class r7f extends hu3 {
    public fm7 X;
    public UploadExternalGifWorker Y;
    public /* synthetic */ Object Z;
    public UploadExternalGifWorker o;
    public final /* synthetic */ UploadExternalGifWorker s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7f(UploadExternalGifWorker uploadExternalGifWorker, Continuation continuation) {
        super(continuation);
        this.s0 = uploadExternalGifWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.doForegroundWork(this);
    }
}
