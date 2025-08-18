package one.me.devmenu;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.bse;
import defpackage.cse;
import defpackage.dse;
import defpackage.du4;
import defpackage.ese;
import defpackage.fg7;
import defpackage.fi4;
import defpackage.fk4;
import defpackage.i4f;
import defpackage.iba;
import defpackage.je7;
import defpackage.lse;
import defpackage.nhd;
import defpackage.od2;
import defpackage.q0e;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.zn5;
import defpackage.zvb;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/ThemeRoomBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ThemeRoomBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int A0 = 0;
    public final je7 y0;
    public final a3g z0;

    public ThemeRoomBottomSheet() {
        super(null, 1, null);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(lse.class, new nhd(12, new bse(0)));
        this.y0 = je7VarCreateViewModelLazy;
        this.z0 = new a3g(new cse((lse) je7VarCreateViewModelLazy.getValue()), ((iba) fi4.a.getAccessor().c(iba.class)).a(), 13);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7Var = this.y0;
        q0e q0eVar = ((lse) je7Var.getValue()).o;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(q0eVar, getViewLifecycleOwner().Q(), fg7Var), new dse(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((lse) je7Var.getValue()).X, getViewLifecycleOwner().Q(), fg7Var), new ese(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Название темы");
        i4f.c.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(zvb.server_host_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.z0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        linearLayout.addView(recyclerView);
        return linearLayout;
    }
}
