package defpackage;

import android.widget.EditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;

/* loaded from: classes.dex */
public final class b3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AbstractPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(Continuation continuation, AbstractPickerScreen abstractPickerScreen) {
        super(2, continuation);
        this.Y = abstractPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        b3 b3Var = (b3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        b3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b3 b3Var = new b3(continuation, this.Y);
        b3Var.X = obj;
        return b3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        EditText editText;
        od2.a0(obj);
        if (!tpa.f((uxa) this.X, uxa.a)) {
            throw new NoWhenBranchMatchedException();
        }
        g9a g9aVarR0 = this.Y.r0();
        if (g9aVarR0 != null && (editText = g9aVarR0.getEditText()) != null) {
            editText.setText((CharSequence) null);
        }
        return e5f.a;
    }
}
