package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.Collections;
import java.util.concurrent.Executor;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* loaded from: classes.dex */
public final class y51 extends ppd implements v15 {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y51(Executor executor, int i) {
        super(executor);
        this.X = i;
    }

    @Override // defpackage.ppd
    /* renamed from: H */
    public void r(hqd hqdVar, int i) {
        switch (this.X) {
            case 5:
                k7d.n((ol7) C(i));
                throw null;
            case 6:
                cmd cmdVar = ((amd) ((emd) hqdVar).a).o;
                cmdVar.c = true;
                cmdVar.b.c();
                return;
            default:
                super.r(hqdVar, i);
                return;
        }
    }

    @Override // defpackage.v15
    public void e() {
        E(Collections.singletonList(dy2.a));
    }

    @Override // defpackage.v15
    public void g() {
        E(null);
    }

    @Override // defpackage.ppd, defpackage.hdc
    public int l(int i) {
        switch (this.X) {
            case 0:
                return ((u51) ((ol7) C(i))).o;
            case 1:
            case 2:
            default:
                return super.l(i);
            case 3:
                return uz4.b;
            case 4:
                return ro7.b;
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public void r(dec decVar, int i) {
        switch (this.X) {
            case 5:
                k7d.n((ol7) C(i));
                throw null;
            case 6:
                cmd cmdVar = ((amd) ((emd) decVar).a).o;
                cmdVar.c = true;
                cmdVar.b.c();
                return;
            default:
                super.r(decVar, i);
                return;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == rvb.call_event_view_item) {
                    return new x51(new v51(viewGroup.getContext()));
                }
                throw new IllegalArgumentException("Not supported viewType for CallEventsAdapter");
            case 1:
                return new az0(new fy2(viewGroup.getContext()), 6);
            case 2:
                return new az0(new EmptySearchView(viewGroup.getContext(), null), 7);
            case 3:
                aba abaVar = new aba(viewGroup.getContext(), null);
                az0 az0Var = new az0(abaVar, 8);
                abaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                abaVar.setIcon(woc.O0);
                abaVar.setTitle(new eqe(yoc.e0));
                abaVar.setSubtitle(new eqe(yoc.c0));
                return az0Var;
            case 4:
                Context context = viewGroup.getContext();
                uyc uycVar = new uyc(context);
                uycVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ProgressBar progressBar = new ProgressBar(context);
                float f = 48;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                progressBar.setLayoutParams(layoutParams);
                ngg.H(progressBar, qp4.u0.j(progressBar).getIcon().i);
                uycVar.addView(progressBar);
                return new az0(uycVar, 9);
            case 5:
                return new xfd(new OneMeButton(viewGroup.getContext(), null));
            default:
                return new emd(new amd(viewGroup.getContext()));
        }
    }
}
