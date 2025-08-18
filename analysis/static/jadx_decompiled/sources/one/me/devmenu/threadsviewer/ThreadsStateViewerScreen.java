package one.me.devmenu.threadsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bc7;
import defpackage.bo6;
import defpackage.bse;
import defpackage.cla;
import defpackage.cte;
import defpackage.dte;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fte;
import defpackage.hob;
import defpackage.iba;
import defpackage.je7;
import defpackage.jv5;
import defpackage.nec;
import defpackage.nhd;
import defpackage.od2;
import defpackage.qm0;
import defpackage.rzd;
import defpackage.tu0;
import defpackage.x27;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/threadsviewer/ThreadsStateViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "jv5", "vt3", "threads-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ThreadsStateViewerScreen extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final x27 a;
    public final qm0 b;
    public final je7 c;
    public final jv5 o;

    static {
        hob hobVar = new hob(ThreadsStateViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        nec.a.getClass();
        X = new bc7[]{hobVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadsStateViewerScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = x27.d;
        this.b = binding(new rzd(10, this));
        this.c = createViewModelLazy(cte.class, new nhd(13, new bse(2)));
        this.o = new jv5(this, ((iba) dte.a.getAccessor().c(iba.class)).a());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getC() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        bc7 bc7Var = X[0];
        linearLayout.addView((cla) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.o);
        recyclerView.j(new bo6(new ColorDrawable(-16777216)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 112;
        linearLayout.addView(recyclerView, layoutParams);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((cte) this.c.getValue()).b, getViewLifecycleOwner().Q(), fg7.o), new fte(null, this), 5), getViewLifecycleScope());
    }
}
