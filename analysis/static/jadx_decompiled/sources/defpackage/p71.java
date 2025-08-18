package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class p71 extends ppd {
    public final /* synthetic */ int X = 1;
    public final Object Y;
    public final Object Z;
    public final Object s0;
    public final Object t0;

    public p71(ExecutorService executorService, gw7 gw7Var, wd6 wd6Var) {
        super(executorService);
        this.Y = executorService;
        this.Z = gw7Var;
        this.s0 = wd6Var;
        this.t0 = new w5e(this);
    }

    @Override // defpackage.ppd
    /* renamed from: H */
    public void r(hqd hqdVar, int i) {
        switch (this.X) {
            case 0:
                ((o71) hqdVar).F0.setOpponents((sma) ((ol7) C(i)));
                break;
            default:
                super.r(hqdVar, i);
                break;
        }
    }

    @Override // defpackage.hl7, defpackage.hdc
    public int j() {
        switch (this.X) {
            case 0:
                return this.o.f.size();
            default:
                return super.j();
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public void r(dec decVar, int i) {
        switch (this.X) {
            case 0:
                ((o71) decVar).F0.setOpponents((sma) ((ol7) C(i)));
                break;
            default:
                super.r(decVar, i);
                break;
        }
    }

    @Override // defpackage.hdc
    public void s(dec decVar, int i, List list) {
        switch (this.X) {
            case 0:
                o71 o71Var = (o71) decVar;
                if (!list.isEmpty()) {
                    o71Var.B((sma) this.o.f.get(i), list);
                    break;
                } else {
                    o71Var.F0.setOpponents((sma) ((ol7) C(i)));
                    break;
                }
            default:
                super.s(decVar, i, list);
                break;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                m71 m71Var = new m71(viewGroup.getContext(), null);
                m71Var.setId(rvb.call_opponents);
                m71Var.setParentSizeProvider((e71) this.Y);
                m71Var.setVideoLayoutUpdatesControllerProvider((k56) this.s0);
                m71Var.setListener((l71) this.Z);
                m71Var.setOpponentsViewPool((b) ((k56) this.t0).invoke());
                frameLayout.addView(m71Var, -1, -1);
                return new o71(frameLayout);
            default:
                return new vt3(viewGroup.getContext(), (gw7) this.Z, (ExecutorService) ((Executor) this.Y), (w5e) this.t0);
        }
    }

    public p71(w4d w4dVar, qqd qqdVar, f71 f71Var, f71 f71Var2) {
        super(jyc.a.p().a());
        this.Y = w4dVar;
        this.Z = qqdVar;
        this.s0 = f71Var;
        this.t0 = f71Var2;
    }
}
