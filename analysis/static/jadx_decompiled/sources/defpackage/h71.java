package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes.dex */
public final class h71 extends ConstraintLayout implements pv3 {
    public final je7 G0;
    public final je7 H0;
    public final ViewStub I0;
    public final ViewPager2 J0;
    public final rg6 K0;
    public final p71 L0;
    public final je7 M0;
    public b N0;
    public g71 O0;
    public ugf P0;
    public qv3 Q0;
    public final lh0 R0;

    /* JADX WARN: Type inference failed for: r5v0, types: [f71] */
    /* JADX WARN: Type inference failed for: r6v1, types: [f71] */
    public h71(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i = 0;
        this.G0 = tu0.r(3, new k56(this) { // from class: f71
            public final /* synthetic */ h71 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        h71 h71Var = this.b;
                        return new ng6(h71Var.J0, h71Var.K0);
                    case 1:
                        return this.b.P0;
                    default:
                        return this.b.N0;
                }
            }
        });
        this.H0 = tu0.r(3, new a5(context, 7));
        this.M0 = tu0.r(3, new x2(context, 8, this));
        this.R0 = new lh0(1, this);
        setLayoutParams(new ti3(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(y7a.P1);
        this.J0 = viewPager2;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(y7a.O1);
        this.I0 = viewStub;
        final int i2 = 1;
        final int i3 = 2;
        p71 p71Var = new p71(new w4d(4, this), new qqd(5, this), new k56(this) { // from class: f71
            public final /* synthetic */ h71 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        h71 h71Var = this.b;
                        return new ng6(h71Var.J0, h71Var.K0);
                    case 1:
                        return this.b.P0;
                    default:
                        return this.b.N0;
                }
            }
        }, new k56(this) { // from class: f71
            public final /* synthetic */ h71 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        h71 h71Var = this.b;
                        return new ng6(h71Var.J0, h71Var.K0);
                    case 1:
                        return this.b.P0;
                    default:
                        return this.b.N0;
                }
            }
        });
        viewPager2.setAdapter(p71Var);
        this.L0 = p71Var;
        rg6 rg6Var = new rg6(context);
        rg6Var.setId(rvb.call_users_speakers_view_tab_layout);
        rg6Var.setBackgroundColor(0);
        rg6Var.setVisibility(8);
        this.K0 = rg6Var;
        addView(viewPager2, getScreenInfo().g ? (getScreenInfo().a * 9) / 16 : 0, getScreenInfo().f ? getScreenInfo().b : 0);
        addView(rg6Var, tu0.G(80 * fk4.d().getDisplayMetrics().density), tu0.G(24 * fk4.d().getDisplayMetrics().density));
        addView(viewStub, -2, -2);
        dj3 dj3VarQ = fp3.q(this);
        int id = viewPager2.getId();
        dj3VarQ.d(id, 4, rg6Var.getId(), 3);
        au1.p(6, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 4, id, 4));
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 3, 0, 3);
        int id2 = rg6Var.getId();
        dj3VarQ.d(id2, 4, 0, 4);
        au1.p(8, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 4, id2, 4));
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        int id3 = viewStub.getId();
        dj3VarQ.d(id3, 6, viewPager2.getId(), 6);
        new l2a(dj3VarQ, 6, id3, 4).e(tu0.G(16 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id3, 4, rg6Var.getId(), 4);
        dj3VarQ.d(id3, 3, rg6Var.getId(), 3);
        dj3VarQ.d(id3, 7, rg6Var.getId(), 6);
        dj3VarQ.g(id3).d.l0 = true;
        dj3VarQ.g(id3).d.w = 0.0f;
        dj3VarQ.a(this);
    }

    private final ng6 getMediator() {
        return (ng6) this.G0.getValue();
    }

    private final ivc getScreenInfo() {
        return (ivc) this.H0.getValue();
    }

    private final TextView getScrollToStartView() {
        return (TextView) this.M0.getValue();
    }

    public static final void w(h71 h71Var, int i) {
        h71Var.getClass();
        boolean z = i > 1;
        ViewStub viewStub = h71Var.I0;
        if (br7.G(viewStub) || z) {
            br7.F(viewStub, h71Var.getScrollToStartView(), null);
            ft.g(h71Var.getScrollToStartView(), z, 0L, null, 6);
        }
    }

    @Override // defpackage.pv3
    public final void D(ov3 ov3Var) {
        dy7.L(this, ov3Var.b());
    }

    @Override // defpackage.pv3
    public final List H(nv3 nv3Var, nv3 nv3Var2) {
        return nz4.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ng6 mediator = getMediator();
        if (!mediator.c) {
            mediator.c = true;
            ViewPager2 viewPager2 = mediator.a;
            hdc adapter = viewPager2.getAdapter();
            mediator.d = adapter;
            if (adapter == null) {
                throw new IllegalStateException("Attached before view pager has an adapter".toString());
            }
            pz4 pz4Var = new pz4(3, mediator);
            mediator.f = pz4Var;
            adapter.z(pz4Var);
            mg6 mg6Var = new mg6(mediator.b);
            mediator.e = mg6Var;
            viewPager2.b(mg6Var);
            mediator.a();
        }
        this.J0.b(this.R0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hdc hdcVar;
        super.onDetachedFromWindow();
        ng6 mediator = getMediator();
        if (mediator.c) {
            mediator.c = false;
            pz4 pz4Var = mediator.f;
            if (pz4Var != null && (hdcVar = mediator.d) != null) {
                hdcVar.B(pz4Var);
            }
            mediator.f = null;
            mediator.d = null;
            mg6 mg6Var = mediator.e;
            if (mg6Var != null) {
                mediator.a.g(mg6Var);
            }
            mediator.e = null;
        }
        this.J0.g(this.R0);
    }

    public final void setControlsMediator(qv3 qv3Var) {
        this.Q0 = qv3Var;
    }

    public final void setListener(g71 g71Var) {
        this.O0 = g71Var;
    }

    public final void setOpponents(List<sma> list) {
        this.L0.E(list);
        int i = list.size() > 1 ? 0 : 8;
        rg6 rg6Var = this.K0;
        rg6Var.setVisibility(i);
        rg6Var.b(list.size(), Math.min(list.size() - 1, this.J0.getCurrentItem()));
        qv3 qv3Var = this.Q0;
        if (qv3Var != null) {
            uv3 uv3Var = (uv3) qv3Var;
            D(uv3Var.j);
            u(uv3Var.k);
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        this.N0 = bVar;
    }

    public final void setVideoLayoutUpdatesController(ugf ugfVar) {
        this.P0 = ugfVar;
    }

    @Override // defpackage.pv3
    public final void u(ov3 ov3Var) {
        dy7.K(this, ov3Var.b());
    }
}
