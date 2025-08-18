package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class t59 extends tdc {
    public final int a = tu0.G(80 * fk4.d().getDisplayMetrics().density);
    public Boolean b;
    public boolean c;
    public final /* synthetic */ MessagesListWidget d;

    public t59(MessagesListWidget messagesListWidget) {
        this.d = messagesListWidget;
    }

    @Override // defpackage.tdc
    public final void a(RecyclerView recyclerView, int i) {
        this.c = i != 0;
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        hdc adapter;
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        int iComputeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        int height = recyclerView.getHeight();
        int i3 = this.a;
        if (iComputeVerticalScrollRange < height + i3) {
            return;
        }
        LinearLayoutManager linearLayoutManagerT = z7.t(recyclerView);
        MessagesListWidget messagesListWidget = this.d;
        if (linearLayoutManagerT != null && (adapter = recyclerView.getAdapter()) != null) {
            int iJ = adapter.j();
            Integer numValueOf = Integer.valueOf(iJ);
            if (iJ <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null && linearLayoutManagerT.r(numValueOf.intValue() - 1) != null && iComputeVerticalScrollRange - (iComputeVerticalScrollOffset + iComputeVerticalScrollExtent) < i3) {
                Boolean bool = this.b;
                if (bool == null || tpa.f(bool, Boolean.TRUE)) {
                    bc7[] bc7VarArr = MessagesListWidget.X0;
                    messagesListWidget.x0().L(false);
                    this.b = Boolean.FALSE;
                    return;
                }
                return;
            }
        }
        Boolean bool2 = this.b;
        if (bool2 == null || tpa.f(bool2, Boolean.FALSE)) {
            bc7[] bc7VarArr2 = MessagesListWidget.X0;
            messagesListWidget.x0().L(true);
            this.b = Boolean.TRUE;
        }
    }
}
