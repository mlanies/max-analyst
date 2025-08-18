package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public final class j7f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ UploadDraftMediaWorker Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7f(UploadDraftMediaWorker uploadDraftMediaWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = uploadDraftMediaWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j7f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j7f(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        UploadDraftMediaWorker uploadDraftMediaWorker = this.Y;
        try {
            if (i == 0) {
                od2.a0(obj);
                qa3 qa3Var = new qa3(((up4) uploadDraftMediaWorker.b.getValue()).a(), 2, new gd1(9, uploadDraftMediaWorker.d()));
                this.X = 1;
                if (s36.e(qa3Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            hm9.n("UploadDraftMediaWorker", "storeDraftUpload: finish store upload = " + uploadDraftMediaWorker.d());
        } catch (Throwable th) {
            hm9.p("UploadDraftMediaWorker", "storeDraftUpload: failed", th);
        }
        return e5f.a;
    }
}
