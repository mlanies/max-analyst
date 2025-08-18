package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.a;
import java.util.Collections;
import java.util.Objects;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public final class jg5 {
    public final Context a;
    public final fke b;
    public final FrgBase c;
    public Object d;
    public final ad e;
    public final s8g f;
    public final kk5 g;
    public long h;
    public long i;
    public String j;
    public boolean k;
    public int l;
    public boolean m;
    public iq1 n;
    public final sd7 o;
    public final au8 p;

    public jg5(ad adVar, s8g s8gVar, kk5 kk5Var, Context context, FrgBase frgBase, qy9 qy9Var, au8 au8Var) {
        this.a = context;
        this.c = frgBase;
        ((y8a) vl.b()).p().getClass();
        this.b = jke.b();
        new sh0(848);
        this.e = adVar;
        this.f = s8gVar;
        this.g = kk5Var;
        this.p = au8Var;
        nc5 nc5Var = new nc5(27);
        qy9Var.getClass();
        sd7 sd7Var = new sd7(new gg5(this, 1), ft.f, ft.d);
        Objects.requireNonNull(sd7Var, "observer is null");
        try {
            qy9Var.a(new wz9(sd7Var, nc5Var, 0));
            this.o = sd7Var;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final boolean a() {
        return this.d != null;
    }

    public final void b(es8 es8Var, l20 l20Var, a aVar, boolean z, boolean z2, int i) {
        if (es8Var.a.y()) {
            this.j = null;
            this.k = false;
            this.m = false;
            this.l = 0;
            this.h = 0L;
            if (z2 && s5c.P(l20Var) && !l20Var.o.c()) {
                c(es8Var, l20Var, true);
                return;
            }
            boolean zE = l20Var.o.e();
            au8 au8Var = this.p;
            cu8 cu8Var = es8Var.a;
            s10 s10Var = l20Var.j;
            String str = l20Var.r;
            if (!zE) {
                d20 d20Var = l20Var.o;
                if (!d20Var.a() && !d20Var.b()) {
                    if (d20Var.c()) {
                        c(es8Var, l20Var, z2);
                        return;
                    }
                    if (d20Var.d()) {
                        if (s10Var.a != 0) {
                            au8Var.u(cu8Var, str, d20.b);
                            return;
                        }
                        long j = cu8Var.t0;
                        xxc xxcVar = mg4.o;
                        this.f.a(new k8d(j, Collections.singletonList(Long.valueOf(cu8Var.b)), null, true, cu8Var.U0));
                        return;
                    }
                    return;
                }
            }
            this.e.f("ACTION_FILE_DOWNLOAD");
            this.k = z;
            this.j = str;
            this.m = z2;
            this.l = i;
            if (!wmd.j(this.a, wmd.s())) {
                wmd.D(aVar, wmd.s(), 167);
                return;
            }
            au8Var.u(cu8Var, str, d20.X);
            pk pkVarC = ((jyc) this.b).c();
            long j2 = s10Var.a;
            long j3 = cu8Var.b;
            k4a k4aVar = (k4a) pkVarC;
            this.h = ome.d(k4aVar.z(), new wg5(s10Var.c, l20Var.r, ((p7b) k4aVar.y()).a.o(), j2, j3), false, 0, 12);
        }
    }

    public final void c(final es8 es8Var, final l20 l20Var, final boolean z) {
        f6 f6Var = new f6() { // from class: hg5
            @Override // defpackage.f6
            public final void run() {
                jg5 jg5Var = this.a;
                if (jg5Var.a()) {
                    kk5 kk5Var = jg5Var.g;
                    l20 l20Var2 = l20Var;
                    kk5Var.h(l20Var2).getAbsolutePath();
                    boolean z2 = z;
                    FrgBase frgBase = jg5Var.c;
                    if (z2 && frgBase != null && (s5c.N(l20Var2) || s5c.P(l20Var2))) {
                        return;
                    }
                    v3c.A(jg5Var.a, es8Var, l20Var2, ((jyc) jg5Var.b).n(), ((y8a) ((ed3) frgBase.p1.b)).h());
                }
            }
        };
        ig5 ig5Var = new ig5(0);
        hle hleVarT = ((jyc) this.b).t();
        hleVarT.getClass();
        cqc.a(f6Var, ((jle) hleVarT).a(), null, ig5Var, null);
    }

    public final void d(String str, boolean z) {
        if (str != null && str.equals(this.j) && a() && ((FrgAttachVideo) this.d).o1 && this.c.g1() != null) {
            q1a q1aVarG = iqd.g(Collections.singletonList(((FrgAttachVideo) this.d).C1));
            jyc jycVar = (jyc) this.b;
            drd drdVarM = q1aVarG.m(((jle) jycVar.t()).b());
            hle hleVarT = jycVar.t();
            hleVarT.getClass();
            drd drdVarI = new uqd(drdVarM.i(((jle) hleVarT).a()), new d74(this, 13, str), 0).i(((jle) jycVar.t()).b());
            iq1 iq1Var = new iq1(new xd5(this, str, z, 1), 2, new ig5(1));
            drdVarI.k(iq1Var);
            this.n = iq1Var;
        }
    }

    @SuppressLint({"CheckResult"})
    @uae
    public void onEvent(l6f l6fVar) {
        int i = 0;
        if (l6fVar.c != this.i) {
            return;
        }
        StringBuilder sb = new StringBuilder("UpdateMessageEvent: messageId = ");
        long j = l6fVar.c;
        sb.append(j);
        hm9.n("jg5", sb.toString());
        jyc jycVar = (jyc) this.b;
        tp7 tp7VarM = jycVar.m();
        tp7VarM.getClass();
        s28 s28Var = new s28(new o28(tp7.b(tp7VarM, j, false, 26), 0, new gg5(this, 3)), new nc5(28), 1);
        hle hleVarT = jycVar.t();
        hleVarT.getClass();
        s28Var.h(((jle) hleVarT).a()).f(((jle) jycVar.t()).b()).a(new g28(new gg5(this, i), new nc5(29), ft.d));
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        int i;
        if (this.h == oi0Var.a) {
            String str = oi0Var.b.b;
            int i2 = zqe.a;
            if ("file.not.found".equals(str)) {
                i = jpc.e0;
            } else {
                i = jpc.d0;
            }
            Context context = this.a;
            a14.N(0, context, context.getString(i));
            if (a()) {
                ((FrgAttachVideo) this.d).getClass();
            }
        }
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        if (fn4Var.X == this.i) {
            if (a()) {
                FrgAttachVideo frgAttachVideo = (FrgAttachVideo) this.d;
                if (!frgAttachVideo.o1) {
                    tu0.A(frgAttachVideo.s1, fn4Var, true);
                    return;
                }
                if (this.i == 0) {
                    return;
                }
                jyc jycVar = (jyc) this.b;
                tp7 tp7VarM = jycVar.m();
                long j = this.i;
                tp7VarM.getClass();
                q1a q1aVarB = tp7.b(tp7VarM, j, false, 26);
                hle hleVarT = jycVar.t();
                hleVarT.getClass();
                new s28(new o28(q1aVarB.m(((jle) hleVarT).a()), 0, new ig5(2)), new ig5(3), 1).f(((jle) jycVar.t()).b()).a(new g28(new gg5(this, 2), new ig5(4), ft.d));
                this.i = 0L;
                return;
            }
            return;
        }
        d(fn4Var.o, false);
    }

    @uae
    public void onEvent(hn4 hn4Var) {
        if (hn4Var.o == this.i && a()) {
            FrgAttachVideo frgAttachVideo = (FrgAttachVideo) this.d;
            if (frgAttachVideo.o1) {
                this.i = 0L;
                frgAttachVideo.j1();
            } else {
                tu0.A(frgAttachVideo.s1, hn4Var, true);
            }
        }
    }
}
