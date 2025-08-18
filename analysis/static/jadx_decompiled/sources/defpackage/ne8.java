package defpackage;

import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* loaded from: classes2.dex */
public final class ne8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ne8 ne8Var = (ne8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ne8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ne8 ne8Var = new ne8(continuation, this.Y);
        ne8Var.X = obj;
        return ne8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        r86 r86Var = (r86) this.X;
        if (r86Var instanceof n86) {
            bc7[] bc7VarArr = MediaPickerScreen.B0;
            te8 te8Var = (te8) this.Y.s0.getValue();
            pnf.n(te8Var, ((w9a) ((kke) te8Var.X.getValue())).b(), null, new re8(te8Var, ((n86) r86Var).c, null), 2);
        }
        return e5f.a;
    }
}
