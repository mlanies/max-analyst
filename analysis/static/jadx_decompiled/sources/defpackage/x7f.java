package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class x7f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ UploadFileAttachWorker Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7f(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = uploadFileAttachWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x7f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x7f(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        UploadFileAttachWorker uploadFileAttachWorker = this.Y;
        try {
            if (i == 0) {
                od2.a0(obj);
                hm9.m("UploadFileAttachWorker", "save %s", uploadFileAttachWorker.c());
                qa3 qa3Var = new qa3(((py8) uploadFileAttachWorker.b.getValue()).b(), 2, new yt8(2, uploadFileAttachWorker.c()));
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
            hm9.m("UploadFileAttachWorker", "save finish %s", uploadFileAttachWorker.c());
        } catch (Throwable th) {
            hm9.p("UploadFileAttachWorker", "save failed!", th);
        }
        return e5f.a;
    }
}
