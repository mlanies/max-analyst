package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* loaded from: classes.dex */
public final class ecc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ecc eccVar = (ecc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        eccVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ecc eccVar = new ecc(continuation, this.Y);
        eccVar.X = obj;
        return eccVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        CharSequence charSequence = (CharSequence) this.X;
        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
        this.Y.D0().setDescription(charSequence);
        return e5f.a;
    }
}
