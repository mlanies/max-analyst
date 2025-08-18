package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class lo4 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mo4 Y;
    public int Z;
    public DownloadFileFromWebAppWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo4(mo4 mo4Var, Continuation continuation) {
        super(continuation);
        this.Y = mo4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c(0.0f, 0L, 0L, this);
    }
}
