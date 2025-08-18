package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class vz5 extends ffe implements a66 {
    public final /* synthetic */ View X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz5(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = viewGroup;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        vz5 vz5Var = (vz5) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vz5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vz5((ViewGroup) this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        br7.d(this.X, ForwardPickerScreen.J0, null);
        return e5f.a;
    }
}
