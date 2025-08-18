package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class vr3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr3(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vr3 vr3Var = (vr3) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vr3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vr3 vr3Var = new vr3(this.Y, continuation);
        vr3Var.X = obj;
        return vr3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int size = ((Set) this.X).size();
        OneMeButton oneMeButton = this.Y;
        if (size == 0) {
            oneMeButton.setVisibility(8);
            oneMeButton.c(null, true);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.setText(r8a.I);
            oneMeButton.c(new Integer(size), true);
        }
        return e5f.a;
    }
}
