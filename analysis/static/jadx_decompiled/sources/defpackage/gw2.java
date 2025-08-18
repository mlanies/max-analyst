package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class gw2 extends pnf implements px7 {
    public static final /* synthetic */ bc7[] Q0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final q0e E0;
    public final w7c F0;
    public final q0e G0;
    public final s35 H0;
    public final s35 I0;
    public final String J0;
    public final qj K0;
    public final nx3 L0;
    public vxd M0;
    public vxd N0;
    public vxd O0;
    public final w4d P0;
    public final kz2 X;
    public final nzc Y;
    public final kke Z;
    public final k9c b;
    public final rr3 c;
    public final yx7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9Var = new oi9(gw2.class, "processSearchResultJob", "getProcessSearchResultJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Q0 = new bc7[]{oi9Var};
    }

    public gw2() {
        jyc jycVar = jyc.a;
        k9c k9cVar = (k9c) jycVar.getAccessor().c(k9c.class);
        rr3 rr3Var = (rr3) jycVar.getAccessor().c(rr3.class);
        yx7 yx7Var = (yx7) jycVar.getAccessor().c(yx7.class);
        ys2 ys2Var = ys2.a;
        kz2 kz2Var = (kz2) ys2Var.getAccessor().c(kz2.class);
        nzc nzcVar = (nzc) ys2Var.getAccessor().c(nzc.class);
        kke kkeVarS = jycVar.s();
        je7 je7Var = iyc.r;
        je7 je7Var2 = iyc.w;
        je7 je7Var3 = iyc.b;
        je7 je7Var4 = iyc.e;
        je7 je7Var5 = iyc.c;
        khe kheVarD = jycVar.getAccessor().d(q33.class);
        khe kheVarD2 = jycVar.getAccessor().d(y7d.class);
        je7 je7Var6 = iyc.v;
        khe kheVarD3 = ys2Var.getAccessor().d(ck3.class);
        khe kheVarD4 = ys2Var.getAccessor().d(ci0.class);
        khe kheVarD5 = ys2Var.getAccessor().d(tm3.class);
        khe kheVarD6 = ys2Var.getAccessor().d(ty3.class);
        this.b = k9cVar;
        this.c = rr3Var;
        this.o = yx7Var;
        this.X = kz2Var;
        this.Y = nzcVar;
        this.Z = kkeVarS;
        this.s0 = je7Var2;
        this.t0 = kheVarD;
        this.u0 = kheVarD2;
        this.v0 = je7Var3;
        this.w0 = je7Var4;
        this.x0 = je7Var5;
        this.y0 = je7Var;
        this.z0 = je7Var6;
        this.A0 = kheVarD3;
        this.B0 = kheVarD4;
        this.C0 = kheVarD5;
        this.D0 = kheVarD6;
        q0e q0eVarA = r0e.a(ov2.f);
        this.E0 = q0eVarA;
        this.F0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.G0 = q0eVarA2;
        this.H0 = new s35(0);
        this.I0 = new s35(0);
        this.J0 = gw2.class.getName();
        this.K0 = new qj(this);
        this.L0 = ((w9a) kkeVarS).b().limitedParallelism(1, "ChatsListSearchViewModelDispatcher");
        this.P0 = mqd.D();
        yx7Var.i = this;
        t(true);
        od2.L(new zn5(od2.u(new jp5(q0eVarA2, 0), 300L), new lq0(2, this, gw2.class, "loadByQuery", "loadByQuery(Ljava/lang/String;)V", 4, 11), 5), this.a);
    }

    public static final void q(gw2 gw2Var, long j, long j2) {
        iy2 iy2VarS = gw2Var.s();
        long jE = ft4.e(j2) + ((hyc) ((q33) gw2Var.t0.getValue())).n();
        p82 p82VarL = ((jz2) iy2VarS).l();
        e52 e52VarC = p82VarL.C(j);
        if (e52VarC != null) {
            p82VarL.l(jE, e52VarC);
            ((k4a) ((pk) p82VarL.p.get())).r(e52VarC.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [nz4] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.ArrayList] */
    public static final List r(gw2 gw2Var) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        qyc qycVar = (qyc) ((y7d) gw2Var.u0.getValue());
        qycVar.getClass();
        JSONObject jSONObject = null;
        String string = qycVar.g.getString(PmsKey.f109searchwebappsshowcase.name(), null);
        if (string != null) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        ?? arrayList = nz4.a;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("items")) != null) {
            arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                long j = jSONObject2.getLong("id");
                String strOptString = jSONObject2.optString("icon");
                String string2 = jSONObject2.getString("title");
                arrayList.add(new v8c(j, string2, strOptString, w9e.Y0(2, string2), false, false, true, 176));
            }
        }
        return arrayList;
    }

    @Override // defpackage.px7
    public final void c(String str, List list) {
        if (!tpa.f(((ov2) this.E0.getValue()).b, str)) {
            hm9.G(this.J0, "chats search: query changed, skip content", null);
            return;
        }
        vxd vxdVarS = j47.S(this.a, ((w9a) this.Z).a().plus(this.K0), vx3.b, new bw2(this, str, list, null));
        this.P0.o1(this, Q0[0], vxdVarS);
    }

    @Override // defpackage.pnf
    public final void p() {
        vxd vxdVar = this.M0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        yx7 yx7Var = this.o;
        yx7Var.d();
        vxd vxdVar2 = this.N0;
        if (vxdVar2 != null) {
            vxdVar2.cancel((CancellationException) null);
        }
        yx7Var.i = null;
    }

    public final iy2 s() {
        return (iy2) this.v0.getValue();
    }

    public final void t(boolean z) {
        vxd vxdVar = this.M0;
        if (vxdVar == null || !vxdVar.isActive()) {
            this.o.d();
            this.G0.setValue(null);
            vxd vxdVar2 = this.N0;
            if (vxdVar2 != null) {
                vxdVar2.cancel((CancellationException) null);
            }
            x77 x77Var = (x77) this.P0.T0(this, Q0[0]);
            if (x77Var != null) {
                x77Var.cancel(null);
            }
            this.M0 = j47.T(this.a, this.L0.plus(this.K0), null, new rv2(this, z, null), 2);
        }
    }

    public final void u(long j) {
        c64 c64Var;
        e52 e52VarQ = ((jz2) s()).q(j);
        if (e52VarQ != null) {
            c64Var = gy2.a2(gy2.c, e52VarQ.a);
        } else {
            gy2.c.getClass();
            c64Var = new c64(":profile?id=" + j + "&type=contact");
        }
        pnf.o(this.H0, c64Var);
    }
}
