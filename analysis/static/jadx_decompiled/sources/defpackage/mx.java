package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class mx extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ px Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(px pxVar, Continuation continuation) {
        super(2, continuation);
        this.Y = pxVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mx) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mx mxVar = new mx(this.Y, continuation);
        mxVar.X = obj;
        return mxVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        od2.a0(obj);
        Throwable th = (Throwable) this.X;
        boolean z2 = th instanceof TamErrorException;
        px pxVar = this.Y;
        if (z2 && f46.U(((TamErrorException) th).a.b)) {
            hm9.p(pxVar.i, "request failed with " + th + ". Retrying", null);
            z = true;
        } else {
            hm9.p(pxVar.i, "request failed with " + th + ". Couldn't recover", null);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
