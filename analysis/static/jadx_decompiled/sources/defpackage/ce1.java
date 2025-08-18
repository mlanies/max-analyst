package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* loaded from: classes.dex */
public final class ce1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallMoreBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.Y = callMoreBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ce1 ce1Var = (ce1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ce1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ce1 ce1Var = new ce1(continuation, this.Y);
        ce1Var.X = obj;
        return ce1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        CharSequence charSequence = (CharSequence) this.X;
        bc7[] bc7VarArr = CallMoreBottomSheet.x0;
        acc accVar = (acc) this.Y.v0.getValue();
        accVar.b = charSequence;
        Iterator it = accVar.a.iterator();
        while (it.hasNext()) {
            ((ufd) ((zd1) ((zbc) it.next())).a).setDescription(charSequence);
        }
        return e5f.a;
    }
}
