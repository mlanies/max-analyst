package defpackage;

import android.view.View;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* loaded from: classes2.dex */
public final class qz4 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ EmptyRecyclerView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz4(EmptyRecyclerView emptyRecyclerView, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = emptyRecyclerView;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        EmptyRecyclerView emptyRecyclerView = this.o;
        switch (this.c) {
            case 0:
                if (((View) obj2) == null) {
                    if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.W1 != null) {
                        hdc adapter = emptyRecyclerView.getAdapter();
                        if (adapter != null) {
                            EmptyRecyclerView.L0(adapter, emptyRecyclerView.W1);
                        }
                        emptyRecyclerView.W1 = null;
                        break;
                    }
                } else {
                    bc7[] bc7VarArr = EmptyRecyclerView.Y1;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.W1 = new pz4(0, emptyRecyclerView);
                    hdc adapter2 = emptyRecyclerView.getAdapter();
                    if (adapter2 != null) {
                        EmptyRecyclerView.K0(adapter2, emptyRecyclerView.W1);
                        break;
                    }
                }
                break;
            default:
                if (((View) obj2) == null) {
                    if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.W1 != null) {
                        hdc adapter3 = emptyRecyclerView.getAdapter();
                        if (adapter3 != null) {
                            EmptyRecyclerView.L0(adapter3, emptyRecyclerView.W1);
                        }
                        emptyRecyclerView.W1 = null;
                        break;
                    }
                } else {
                    bc7[] bc7VarArr2 = EmptyRecyclerView.Y1;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.W1 = new pz4(0, emptyRecyclerView);
                    hdc adapter4 = emptyRecyclerView.getAdapter();
                    if (adapter4 != null) {
                        EmptyRecyclerView.K0(adapter4, emptyRecyclerView.W1);
                        break;
                    }
                }
                break;
        }
    }
}
