package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class sjc implements ug7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sjc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        switch (this.a) {
            case 0:
                int i = tjc.$EnumSwitchMapping$0[eg7Var.ordinal()];
                ujc ujcVar = (ujc) this.b;
                WeakReference weakReference = ujcVar.d;
                if (i == 1) {
                    ujcVar.f = true;
                    RecyclerView recyclerView = (RecyclerView) weakReference.get();
                    if (recyclerView != null) {
                        recyclerView = recyclerView.getAdapter() != null ? recyclerView : null;
                        if (recyclerView != null) {
                            ujcVar.b(recyclerView);
                            break;
                        }
                    }
                } else if (i == 2) {
                    ujcVar.f = false;
                    RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
                    if (recyclerView2 != null) {
                        if (recyclerView2.getAdapter() == null && recyclerView2.G0) {
                            recyclerView = recyclerView2;
                        }
                        if (recyclerView != null) {
                            ujcVar.a(recyclerView);
                            break;
                        }
                    }
                }
                break;
            default:
                eg7 eg7Var2 = eg7.ON_START;
                mm mmVar = (mm) this.b;
                if (eg7Var != eg7Var2) {
                    if (eg7Var == eg7.ON_STOP) {
                        mmVar.e = false;
                        break;
                    }
                } else {
                    mmVar.e = true;
                    break;
                }
                break;
        }
    }
}
