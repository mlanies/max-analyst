package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class m9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m9 m9Var = (m9) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        m9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m9 m9Var = new m9(this.Y, continuation);
        m9Var.X = obj;
        return m9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int size = ((Set) this.X).size();
        OneMeButton oneMeButton = this.Y;
        if (size == 0) {
            oneMeButton.setVisibility(8);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.c(new Integer(size), true);
        }
        return e5f.a;
    }
}
