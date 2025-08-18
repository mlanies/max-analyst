package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public abstract class yn1 implements zy0, ep1, ii9, n38 {
    public boolean A0;
    public ssa B0;
    public final yuc C0;
    public final d4c X;
    public final a4c Y;
    public final pl5 Z;
    public boolean b;
    public Runnable c;
    public final ag1 o;
    public final d s0;
    public final ji9 u0;
    public final kg1 v0;
    public final id1 w0;
    public final u38 x0;
    public xn1 y0;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ArrayList t0 = new ArrayList();
    public int z0 = 0;

    public yn1(kg1 kg1Var, ji9 ji9Var, ag1 ag1Var, a4c a4cVar, d4c d4cVar, pl5 pl5Var, d dVar, id1 id1Var, u38 u38Var, yuc yucVar) {
        jb9.e();
        this.o = ag1Var;
        this.Y = a4cVar;
        this.X = d4cVar;
        this.Z = pl5Var;
        this.v0 = kg1Var;
        this.u0 = ji9Var;
        this.w0 = id1Var;
        id1Var.a.a.add(this);
        id1Var.l.a.add(this);
        ji9Var.a.add(this);
        this.s0 = dVar;
        this.x0 = u38Var;
        this.C0 = yucVar;
    }

    public static String B(int i) {
        return i == 0 ? "PASSIVE" : "ACTIVE";
    }

    public Map A() {
        return null;
    }

    public void C(y1e y1eVar) {
    }

    public abstract String D();

    public void E(bg1 bg1Var, List list, boolean z, ay0 ay0Var) {
    }

    public void F() {
    }

    public void G() {
    }

    public final boolean H(xxe xxeVar) {
        return y().equals(xxeVar);
    }

    public final boolean I() {
        return this.z0 == 1;
    }

    public final void J() {
        if (this.b) {
            return;
        }
        ag1 ag1Var = this.o;
        ag1Var.b.getClass();
        if (this.c == null) {
            this.c = w();
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            Handler handler = this.a;
            ag1Var.b.getClass();
            handler.postDelayed(runnable, WorkRequest.MIN_BACKOFF_MILLIS);
        }
    }

    public void K(bg1 bg1Var, zad zadVar, boolean z, by0 by0Var) {
    }

    public void L() {
        jb9.e();
        u38 u38Var = this.x0;
        if (u38Var != null) {
            u38Var.d.log("MediaAdaptation", "Releasing media adaptation controller");
            u38Var.a.j.remove(u38Var);
        }
        this.u0.a.remove(this);
        this.w0.a.a.remove(this);
        this.y0 = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public void M(long j, long j2) {
    }

    public void N(c4c c4cVar) {
    }

    public void O(boolean z) {
    }

    public void P(o1e o1eVar) {
    }

    public void Q(List list) {
        jb9.e();
        ArrayList arrayList = this.t0;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public void R(fp1 fp1Var, List list) {
    }

    public final void S(String str) {
        this.Y.log(D(), str);
    }

    public void T(List list) {
    }

    public abstract void U(ssa ssaVar);

    public final void V(String str) {
        this.Y.log(D(), str);
    }

    public void i(ji9 ji9Var) {
    }

    @Override // defpackage.zy0
    public void onActiveParticipantUpdated(yy0 yy0Var) {
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsAdded(uy0 uy0Var) {
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsChanged(vy0 vy0Var) {
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsDeAnonimized(wy0 wy0Var) {
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsRemoved(xy0 xy0Var) {
    }

    @Override // defpackage.n38
    public final void p(o38 o38Var) {
        if (I()) {
            ssa ssaVar = o38Var.b;
            if (ssaVar == null) {
                ssaVar = this.B0;
            }
            U(ssaVar);
        }
    }

    public void r(y8 y8Var) {
    }

    public void s() {
    }

    public void t(bg1 bg1Var, SessionDescription sessionDescription) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('@');
        boolean z = jb9.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('{');
        sb.append(B(this.z0));
        sb.append('}');
        return sb.toString();
    }

    public void u(fg1 fg1Var, boolean z) {
    }

    public final void v(String str) {
        this.Y.log(D(), str);
    }

    public abstract Runnable w();

    public long x() {
        return -1L;
    }

    public abstract xxe y();

    public final fg1 z(bg1 bg1Var) {
        if (bg1Var != null) {
            return this.v0.j(bg1Var);
        }
        return null;
    }
}
