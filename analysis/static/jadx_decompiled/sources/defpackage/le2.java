package defpackage;

import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* loaded from: classes.dex */
public final class le2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaDownloadBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.Y = chatMediaDownloadBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        le2 le2Var = (le2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        le2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        le2 le2Var = new le2(continuation, this.Y);
        le2Var.X = obj;
        return le2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((a10) this.Y.z0.getValue()).setLevel(tu0.G(((Number) this.X).floatValue() * 100));
        return e5f.a;
    }
}
