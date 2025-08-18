package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;

/* loaded from: classes.dex */
public final class m71 extends ConstraintLayout {
    public final CallGridLayoutManager G0;
    public final RecyclerView H0;
    public final af1 I0;
    public l71 J0;
    public final je7 K0;
    public sma L0;
    public k56 M0;
    public final GestureDetector N0;

    /* JADX WARN: Type inference failed for: r9v0, types: [i71] */
    public m71(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K0 = tu0.r(3, new a5(context, 8));
        this.L0 = sma.o;
        setLayoutParams(new ti3(-1, -1));
        this.N0 = new GestureDetector(context, new q00(2, this));
        nnf nnfVar = nnf.c;
        rxd rxdVar = new rxd(5, this);
        final int i = 0;
        k56 k56Var = new k56(this) { // from class: i71
            public final /* synthetic */ m71 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        k56 k56Var2 = this.b.M0;
                        if (k56Var2 != null) {
                            return (ugf) k56Var2.invoke();
                        }
                        return null;
                    default:
                        return Integer.valueOf(this.b.L0.a);
                }
            }
        };
        final int i2 = 1;
        af1 af1Var = new af1(nnfVar, rxdVar, k56Var, null, new k56(this) { // from class: i71
            public final /* synthetic */ m71 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        k56 k56Var2 = this.b.M0;
                        if (k56Var2 != null) {
                            return (ugf) k56Var2.invoke();
                        }
                        return null;
                    default:
                        return Integer.valueOf(this.b.L0.a);
                }
            }
        }, 18);
        this.I0 = af1Var;
        float f = 2;
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(context, tu0.G(fk4.d().getDisplayMetrics().density * f), new sh0((getScreenInfo().f || getScreenInfo().e) ? 2 : 3, 2, this));
        callGridLayoutManager.K = new j71(this);
        this.G0 = callGridLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(rvb.call_grid_opponents_view);
        recyclerView.setAdapter(af1Var);
        recyclerView.setLayoutManager(callGridLayoutManager);
        recyclerView.j(new d71(tu0.G(f * fk4.d().getDisplayMetrics().density), 0));
        recyclerView.l(new k71(0, this));
        this.H0 = recyclerView;
        addView(recyclerView, -1, -1);
        dj3 dj3VarQ = fp3.q(this);
        int id = recyclerView.getId();
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.a(this);
    }

    private final ivc getScreenInfo() {
        return (ivc) this.K0.getValue();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.N0.onTouchEvent(motionEvent);
    }

    public final void setListener(l71 l71Var) {
        this.J0 = l71Var;
    }

    public final void setOpponents(sma smaVar) {
        RecyclerView recyclerView = this.H0;
        List list = smaVar.c;
        int i = smaVar.a;
        if (i == 0 && list.size() > 2 && getHeight() != -2) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        } else if (i == 0 && list.size() <= 2 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -1;
            recyclerView.setLayoutParams(layoutParams2);
        } else if (i > 0 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = -1;
            recyclerView.setLayoutParams(layoutParams3);
        }
        this.L0 = smaVar;
        this.I0.E(list);
    }

    public final void setOpponentsViewPool(b bVar) {
        this.H0.setRecycledViewPool(bVar);
    }

    public final void setParentSizeProvider(e71 e71Var) {
        this.G0.P = e71Var;
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56Var) {
        this.M0 = k56Var;
    }
}
