package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* loaded from: classes2.dex */
public final class ade extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SuggestionsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ade(SuggestionsWidget suggestionsWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = suggestionsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ade adeVar = (ade) n((kce) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        adeVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ade adeVar = new ade(this.Y, continuation);
        adeVar.X = obj;
        return adeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kce kceVar = (kce) this.X;
        SuggestionsWidget suggestionsWidget = this.Y;
        if (kceVar == null) {
            bc7[] bc7VarArr = SuggestionsWidget.B0;
            suggestionsWidget.C0();
        } else {
            List list = kceVar.b;
            boolean zIsEmpty = list.isEmpty();
            boolean z = !zIsEmpty;
            bc7[] bc7VarArr2 = SuggestionsWidget.B0;
            suggestionsWidget.z0().setVisibility(zIsEmpty ? 0 : 8);
            suggestionsWidget.A0().setVisibility(z ? 0 : 8);
            suggestionsWidget.z0().setText(kceVar.a == jce.c ? mga.q : mga.r);
            ((pce) suggestionsWidget.u0.getValue()).E(list);
        }
        return e5f.a;
    }
}
