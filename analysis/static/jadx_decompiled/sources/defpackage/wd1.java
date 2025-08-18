package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class wd1 extends ppd {
    public final i1b X;
    public final km1 Y;
    public final g71 Z;
    public final xl1 s0;
    public final fm1 t0;
    public final Executor u0;
    public final en1 v0;
    public final ugf w0;
    public final b x0;
    public final je7 y0;
    public final je7 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public wd1(i1b i1bVar, ui1 ui1Var, ki1 ki1Var, ti1 ti1Var, fm1 fm1Var, je7 je7Var, je7 je7Var2, en1 en1Var, ugf ugfVar, b bVar) {
        ExecutorService executorServiceA = jyc.a.p().a();
        super(executorServiceA);
        this.X = i1bVar;
        this.Y = ui1Var;
        this.Z = ki1Var;
        this.s0 = ti1Var;
        this.t0 = fm1Var;
        this.u0 = executorServiceA;
        this.v0 = en1Var;
        this.w0 = ugfVar;
        this.x0 = bVar;
        this.y0 = je7Var;
        this.z0 = je7Var2;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        hqdVar.A((vd1) ((ol7) C(i)));
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: I */
    public final void y(hqd hqdVar) {
        hqdVar.D();
        om1 om1Var = hqdVar instanceof om1 ? (om1) hqdVar : null;
        if (om1Var != null) {
            om1Var.F0.a.remove(om1Var);
        }
    }

    @Override // defpackage.hdc
    public final void s(dec decVar, int i, List list) {
        u2 rd1Var;
        hqd hqdVar = (hqd) decVar;
        if (!(!list.isEmpty())) {
            r(hqdVar, i);
            return;
        }
        ol7 ol7Var = (vd1) ((ol7) C(i));
        if (ol7Var instanceof ud1) {
            rd1Var = new td1(7);
            for (Object obj : list) {
                u2 u2Var = obj instanceof td1 ? (td1) obj : null;
                if (u2Var != null) {
                    rd1Var.M1(u2Var);
                }
            }
        } else if (ol7Var instanceof qd1) {
            rd1Var = new pd1(7);
            for (Object obj2 : list) {
                u2 u2Var2 = obj2 instanceof pd1 ? (pd1) obj2 : null;
                if (u2Var2 != null) {
                    rd1Var.M1(u2Var2);
                }
            }
        } else {
            if (!(ol7Var instanceof sd1)) {
                throw new NoWhenBranchMatchedException();
            }
            rd1Var = new rd1(7);
            for (Object obj3 : list) {
                u2 u2Var3 = obj3 instanceof rd1 ? (rd1) obj3 : null;
                if (u2Var3 != null) {
                    rd1Var.M1(u2Var3);
                }
            }
        }
        hqdVar.B(ol7Var, rd1Var);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        je7 je7Var = this.y0;
        je7 je7Var2 = this.z0;
        b bVar = this.x0;
        ugf ugfVar = this.w0;
        if (i == 111) {
            mm1 mm1Var = new mm1(viewGroup.getContext(), null);
            mm1Var.setLayoutParams(new ti3(-1, -1));
            mm1Var.setVisibility(0);
            mm1Var.setOnTouchListener((View.OnTouchListener) je7Var.getValue());
            mm1Var.setControlsMediator((uv3) je7Var2.getValue());
            mm1Var.setVideoLayoutUpdatesController(ugfVar);
            mm1Var.setCallSpeakerMediator(this.t0);
            mm1Var.setListener(this.Y);
            mm1Var.setOpponentsViewPool(bVar);
            ((uv3) je7Var2.getValue()).b(mm1Var);
            this.X.a.add(mm1Var);
            return new om1(mm1Var, this.v0);
        }
        if (i != 222) {
            if (i != 225) {
                throw new IllegalStateException(("unknown item view type " + i).toString());
            }
            yl1 yl1Var = new yl1(viewGroup.getContext(), null);
            yl1Var.setLayoutParams(new ti3(-1, -1));
            yl1Var.setVisibility(0);
            yl1Var.setListener(this.s0);
            return new az0(yl1Var, 5);
        }
        h71 h71Var = new h71(viewGroup.getContext(), null);
        h71Var.setLayoutParams(new ti3(-1, -1));
        h71Var.setVisibility(0);
        h71Var.setOnTouchListener((View.OnTouchListener) je7Var.getValue());
        h71Var.setControlsMediator((uv3) je7Var2.getValue());
        h71Var.setListener(this.Z);
        h71Var.setVideoLayoutUpdatesController(ugfVar);
        h71Var.setOpponentsViewPool(bVar);
        ((uv3) je7Var2.getValue()).b(h71Var);
        return new az0(h71Var, 2);
    }
}
