package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class f09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f09 f09Var = (f09) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        f09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f09 f09Var = new f09(continuation, this.Y);
        f09Var.X = obj;
        return f09Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View$OnLayoutChangeListener, enf, java.lang.Object] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        sv8 sv8VarQ0 = messageWriteWidget.q0();
        c01 c01Var = new c01(5, messageWriteWidget);
        final Handler handler = new Handler(Looper.getMainLooper());
        final mec mecVar = new mec();
        final long j = 300;
        ?? r7 = new View.OnLayoutChangeListener() { // from class: enf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Handler handler2 = handler;
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed((Runnable) mecVar.a, j);
            }
        };
        mecVar.a = new yg3(handler, sv8VarQ0, (Object) r7, c01Var, 18);
        sv8VarQ0.addOnLayoutChangeListener(r7);
        if (sv8VarQ0.isAttachedToWindow()) {
            sv8VarQ0.addOnAttachStateChangeListener(new e6c(sv8VarQ0, handler, sv8VarQ0, r7));
        } else {
            handler.removeCallbacksAndMessages(null);
            sv8VarQ0.removeOnLayoutChangeListener(r7);
        }
        handler.postDelayed((Runnable) mecVar.a, 300L);
        return e5f.a;
    }
}
