package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u6c {
    public final Context a;
    public t6c b;
    public final j6e c;
    public final RecyclerView d;

    public u6c(Context context, ExecutorService executorService) {
        this.a = context;
        j6e j6eVar = new j6e(executorService, new l6c(context), new wz7(27, this), new lwa(10, this));
        this.c = j6eVar;
        ix3 ix3Var = new ix3(fk4.d().getDisplayMetrics().density * 24.0f);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(wxb.one_chat_react_panel_layout);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(8));
        recyclerView.j(new rt5(tu0.G((ay7.B(context) >= 360 ? 10 : 8) * fk4.d().getDisplayMetrics().density), new u4a(0, 1, u6c.class, this, "isExpanded", "isExpanded()Z")));
        recyclerView.setOutlineProvider(ix3Var);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(j6eVar);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToOutline(false);
        float f = 8;
        float f2 = 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        v3c.y(new r1b(this, continuation, 4), recyclerView);
        this.d = recyclerView;
    }

    public final void a(kl7 kl7Var, int i) {
        if (kl7Var.getSize() > 8) {
            RecyclerView recyclerView = this.d;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int iG = tu0.G(240 * fk4.d().getDisplayMetrics().density);
            if (i > 0) {
                iG = Math.min(iG, i);
            }
            layoutParams.height = iG;
            recyclerView.setLayoutParams(layoutParams);
        }
        this.c.F(kl7Var, new u3c(2, this));
    }
}
