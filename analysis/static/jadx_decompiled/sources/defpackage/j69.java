package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class j69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        j69 j69Var = (j69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        j69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        j69 j69Var = new j69(continuation, this.Y);
        j69Var.X = obj;
        return j69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        du4 du4Var = (du4) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        r5f r5fVar = messagesListWidget.F0;
        if (r5fVar != null) {
            r5fVar.Z = du4Var;
            FrameLayout frameLayout = r5fVar.Y;
            View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                os2.f.b(textView, r5fVar.Z);
            }
        }
        f34 f34Var = messagesListWidget.G0;
        if (f34Var != null) {
            f34Var.b = du4Var;
        }
        h8e h8eVar = messagesListWidget.H0;
        if (h8eVar != null) {
            h8eVar.j();
        }
        messagesListWidget.u0().Y();
        messagesListWidget.u0().invalidate();
        return e5f.a;
    }
}
