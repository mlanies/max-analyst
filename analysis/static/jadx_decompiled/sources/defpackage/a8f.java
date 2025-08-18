package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class a8f extends ffe implements a66 {
    public final /* synthetic */ UploadFileAttachWorker X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8f(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = uploadFileAttachWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a8f) n((ly8) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new a8f(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(!(this.X.C0 instanceof cm7));
    }
}
