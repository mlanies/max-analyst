package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vid extends pnf {
    public static final /* synthetic */ bc7[] w0 = {new oi9(vid.class, "mediaCachingTimeJob", "getMediaCachingTimeJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, vid.class, "clearCacheJob", "getClearCacheJob()Lkotlinx/coroutines/Job;")};
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final Context b;
    public final je7 c;
    public final je7 o;
    public final w7c s0;
    public final w4d t0;
    public final w4d u0;
    public final s35 v0;

    public vid(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, Context context) {
        this.b = context;
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
        this.Y = je7Var4;
        q0e q0eVarA = r0e.a(null);
        this.Z = q0eVarA;
        mn5 mn5VarF = od2.F(new ap8(new t03(q0eVarA, 11), this, 9), ((w9a) ((kke) je7Var.getValue())).a());
        ArrayList arrayListS = s();
        this.s0 = od2.X(mn5VarF, this.a, wld.a, arrayListS);
        this.t0 = mqd.D();
        this.u0 = mqd.D();
        this.v0 = new s35(0);
        pnf.n(this, null, null, new pid(this, null), 3);
    }

    public static final void q(vid vidVar, long j) {
        pnf.o(vidVar.v0, new nid(new gqe(oha.r, ys.m0(new Object[]{are.w(j, false, vidVar.b)}))));
    }

    public static final Object r(vid vidVar, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(((w9a) ((kke) vidVar.c.getValue())).b(), new sid(vidVar, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    public final ArrayList s() {
        Object next;
        dp3 dp3Var = e78.o;
        int i = ((jp) this.o.getValue()).g.getInt("app.media.caching.time", 0);
        dp3Var.getClass();
        Iterator it = e78.Z.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (i == ((e78) next).a) {
                break;
            }
        }
        e78 e78Var = (e78) next;
        return y53.N(new k1d(4, new eqe(oha.y), 0, nha.E, new eqe(oha.x), new dfd(e78Var != null ? new eqe(e78Var.c) : new iqe(""), null), 16));
    }

    public final void t(int i) {
        Object next;
        Object next2;
        fx0 fx0Var;
        List list;
        Object next3;
        int i2 = nha.E;
        s35 s35Var = this.v0;
        Object obj = null;
        if (i != i2) {
            e78.o.getClass();
            boolean zContains = e78.X.contains(Integer.valueOf(i));
            bc7[] bc7VarArr = w0;
            if (zContains) {
                Iterator it = e78.Z.iterator();
                while (true) {
                    u1 u1Var = (u1) it;
                    if (!u1Var.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = u1Var.next();
                        if (i == ((e78) next3).b) {
                            break;
                        }
                    }
                }
                e78 e78Var = (e78) next3;
                if (e78Var == null) {
                    return;
                }
                this.t0.o1(this, bc7VarArr[0], pnf.n(this, null, null, new uid(this, e78Var.a, null), 3));
                return;
            }
            vw0.Y.getClass();
            boolean zContains2 = vw0.Z.contains(Integer.valueOf(i));
            Context context = this.b;
            q0e q0eVar = this.Z;
            if (zContains2) {
                Iterator it2 = vw0.w0.iterator();
                while (true) {
                    u1 u1Var2 = (u1) it2;
                    if (!u1Var2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = u1Var2.next();
                        if (i == ((vw0) next2).a) {
                            break;
                        }
                    }
                }
                vw0 vw0Var = (vw0) next2;
                if (vw0Var == null || (fx0Var = (fx0) q0eVar.getValue()) == null || (list = fx0Var.b) == null) {
                    return;
                }
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next4 = it3.next();
                    if (((uw0) next4).a == vw0Var) {
                        obj = next4;
                        break;
                    }
                }
                uw0 uw0Var = (uw0) obj;
                if (uw0Var != null) {
                    pnf.o(s35Var, new mid(new gqe(vw0Var.X, ys.m0(new Object[]{are.w(uw0Var.b, false, context)})), new eqe(oha.k), y53.M(new lid(vw0Var.b, new eqe(oha.h), true), new lid(vw0Var.c, new eqe(oha.g), false))));
                    return;
                }
                return;
            }
            boolean zContains3 = vw0.s0.contains(Integer.valueOf(i));
            w4d w4dVar = this.u0;
            je7 je7Var = this.c;
            if (!zContains3) {
                if (i != nha.r) {
                    if (i == nha.b) {
                        w4dVar.o1(this, bc7VarArr[1], pnf.n(this, ((w9a) ((kke) je7Var.getValue())).b(), null, new qid(this, null), 2));
                        return;
                    }
                    return;
                } else {
                    fx0 fx0Var2 = (fx0) q0eVar.getValue();
                    if (fx0Var2 != null) {
                        pnf.o(s35Var, new mid(new gqe(oha.i, ys.m0(new Object[]{are.w(fx0Var2.a, false, context)})), new eqe(oha.k), y53.M(new lid(nha.b, new eqe(oha.h), true), new lid(nha.a, new eqe(oha.g), false))));
                        return;
                    }
                    return;
                }
            }
            v25 v25Var = vw0.w0;
            v25Var.getClass();
            u1 u1Var3 = new u1(0, v25Var);
            while (true) {
                if (!u1Var3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = u1Var3.next();
                    if (i == ((vw0) next).b) {
                        break;
                    }
                }
            }
            vw0 vw0Var2 = (vw0) next;
            if (vw0Var2 == null) {
                return;
            }
            w4dVar.o1(this, bc7VarArr[1], pnf.n(this, ((w9a) ((kke) je7Var.getValue())).b(), null, new rid(vw0Var2, this, null), 2));
            return;
        }
        eqe eqeVar = new eqe(oha.y);
        v25 v25Var2 = e78.Z;
        ArrayList arrayList = new ArrayList(z53.S(v25Var2, 10));
        Iterator it4 = v25Var2.iterator();
        while (true) {
            u1 u1Var4 = (u1) it4;
            if (!u1Var4.hasNext()) {
                pnf.o(s35Var, new mid(eqeVar, null, arrayList));
                return;
            } else {
                e78 e78Var2 = (e78) u1Var4.next();
                arrayList.add(new lid(e78Var2.b, new eqe(e78Var2.c), false));
            }
        }
    }
}
