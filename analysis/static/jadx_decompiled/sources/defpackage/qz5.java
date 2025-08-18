package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class qz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ csb Y;
    public final /* synthetic */ ForwardPickerScreen Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz5(csb csbVar, ForwardPickerScreen forwardPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = csbVar;
        this.Z = forwardPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qz5) n((a06) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qz5 qz5Var = new qz5(this.Y, this.Z, continuation);
        qz5Var.X = obj;
        return qz5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a06 a06Var = (a06) this.X;
        e5f e5fVar = e5f.a;
        int i = 8;
        csb csbVar = this.Y;
        if (a06Var == null) {
            csbVar.setVisibility(8);
        } else {
            bc7[] bc7VarArr = ForwardPickerScreen.I0;
            ForwardPickerScreen forwardPickerScreen = this.Z;
            if ((!((Collection) forwardPickerScreen.v0().Z.a.getValue()).isEmpty()) && forwardPickerScreen.B0()) {
                i = 0;
            }
            csbVar.setVisibility(i);
            CharSequence charSequenceB = a06Var.a.b(csbVar.getContext());
            if (charSequenceB == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            csbVar.setTitle(charSequenceB);
            csbVar.setAttachDescription(a06Var.c);
            if (forwardPickerScreen.A0()) {
                csbVar.setStartIconDrawable(null);
                csbVar.setStartIconClickListener(null);
            } else {
                if (!a06Var.d) {
                    return e5fVar;
                }
                if (csbVar.getVisibility() == 0) {
                    ((iz5) forwardPickerScreen.v0().c).f();
                }
                csbVar.setStartIconDrawable(((iz5) forwardPickerScreen.v0().c).g());
                csbVar.setStartIconClickListener(new vu5(forwardPickerScreen, 2, csbVar));
            }
        }
        return e5fVar;
    }
}
