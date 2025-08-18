package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.dy7;
import defpackage.f9;
import defpackage.fg7;
import defpackage.h61;
import defpackage.i61;
import defpackage.j61;
import defpackage.je7;
import defpackage.k11;
import defpackage.k61;
import defpackage.kke;
import defpackage.kpa;
import defpackage.kq;
import defpackage.l61;
import defpackage.nv3;
import defpackage.nx3;
import defpackage.nz4;
import defpackage.od2;
import defpackage.pl4;
import defpackage.pv3;
import defpackage.rvb;
import defpackage.s;
import defpackage.suc;
import defpackage.tu0;
import defpackage.w9a;
import defpackage.y45;
import defpackage.y51;
import defpackage.z7;
import defpackage.z84;
import defpackage.zi1;
import defpackage.zn5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lpv3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "fi1", "k61", "f9", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallEventsWidget extends Widget implements pv3 {
    public static final /* synthetic */ int Y = 0;
    public final k61 X;
    public f9 a;
    public final y51 b;
    public final je7 c;
    public final ArrayList o;

    public CallEventsWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    @Override // defpackage.pv3
    public final List H(nv3 nv3Var, nv3 nv3Var2) {
        View view = getView();
        return view != null ? Collections.singletonList(z7.C(view, nv3Var2.d)) : nz4.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setId(rvb.call_events_recyclerview);
        recyclerView.setAdapter(this.b);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        recyclerView.j(new kq(1));
        k61 k61Var = this.X;
        k61Var.a = recyclerView;
        recyclerView.setItemAnimator(new j61(k61Var));
        recyclerView.addOnLayoutChangeListener(new i61(0, this));
        return recyclerView;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o.clear();
        this.X.a = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((h61) this.c.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new l61(null, this), 5), getViewLifecycleScope());
    }

    public CallEventsWidget(Bundle bundle) {
        Executor executorN;
        super(bundle, 0, 2, null);
        nx3 nx3VarA = ((w9a) ((kke) zi1.a.getAccessor().c(kke.class))).a();
        y45 y45Var = nx3VarA instanceof y45 ? (y45) nx3VarA : null;
        this.b = new y51((y45Var == null || (executorN = y45Var.n()) == null) ? new pl4(nx3VarA) : executorN, 0);
        this.c = createViewModelLazy(h61.class, new s(10, new k11(9)));
        this.o = new ArrayList();
        this.X = new k61();
    }
}
