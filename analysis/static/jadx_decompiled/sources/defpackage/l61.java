package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* loaded from: classes.dex */
public final class l61 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallEventsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(Continuation continuation, CallEventsWidget callEventsWidget) {
        super(2, continuation);
        this.Y = callEventsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l61 l61Var = (l61) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l61Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        l61 l61Var = new l61(continuation, this.Y);
        l61Var.X = obj;
        return l61Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        hdc adapter;
        od2.a0(obj);
        List list = (List) this.X;
        CallEventsWidget callEventsWidget = this.Y;
        k61 k61Var = callEventsWidget.X;
        int size = list.size();
        RecyclerView recyclerView = k61Var.a;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && adapter.j() > size) {
            int height = recyclerView.getHeight();
            RecyclerView recyclerView2 = k61Var.a;
            if (recyclerView2 != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = height;
                recyclerView2.setLayoutParams(layoutParams);
            }
        }
        callEventsWidget.b.E(list);
        return e5f.a;
    }
}
