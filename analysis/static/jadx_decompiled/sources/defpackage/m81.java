package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m81 extends pnf {
    public final ks1 X;
    public final je7 Y;
    public final je7 Z;
    public final v81 b;
    public final rg1 c;
    public final k70 o;
    public final ph4 s0;
    public final je7 t0;
    public final q0e u0;
    public final q0e v0;
    public final q0e w0;
    public final q0e x0;
    public Long y0;

    public m81(Context context, v81 v81Var, rg1 rg1Var) {
        jyc jycVar = jyc.a;
        k70 k70Var = new k70(((hyc) ((q33) jycVar.getAccessor().c(q33.class))).t());
        ks1 ks1Var = (ks1) jycVar.getAccessor().c(ks1.class);
        je7 je7Var = iyc.i;
        je7 je7Var2 = iyc.j;
        moa moaVar = new moa(context);
        je7 je7Var3 = iyc.t;
        ph4 ph4Var = new ph4();
        ph4Var.a = moaVar;
        ph4Var.b = je7Var3;
        khe kheVarD = s71.a.getAccessor().d(bt1.class);
        this.b = v81Var;
        this.c = rg1Var;
        this.o = k70Var;
        this.X = ks1Var;
        this.Y = je7Var;
        this.Z = je7Var2;
        this.s0 = ph4Var;
        this.t0 = kheVarD;
        q0e q0eVarA = r0e.a(epa.a);
        this.u0 = q0eVarA;
        this.v0 = q0eVarA;
        q0e q0eVarA2 = r0e.a(Boolean.FALSE);
        this.w0 = q0eVarA2;
        this.x0 = q0eVarA2;
        s();
        ks1Var.getClass();
        ks1Var.g(new is1(ks1Var, 5));
    }

    public final al6 q(long j) {
        il6 il6Var;
        fpa fpaVar = (fpa) this.u0.getValue();
        if (!(fpaVar instanceof dpa) || (il6Var = (il6) ((dpa) fpaVar).a.get(Long.valueOf(j))) == null) {
            return null;
        }
        return il6Var.v0;
    }

    public final boolean r() {
        k70 k70Var = this.o;
        huc hucVar = v81.b;
        v81 v81Var = this.b;
        hucVar.getClass();
        if (!((ArrayList) (v81Var == v81.o ? k70Var.X : k70Var.o)).isEmpty()) {
            ks1 ks1Var = this.X;
            if (ks1Var.c == null || ks1Var.c.o || !ks1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        hm9.n("CallHistoryPageViewModel", "register load history callbacks for type=" + this.b);
        ks1 ks1Var = this.X;
        ks1Var.getClass();
        ks1Var.z0.b(new is1(ks1Var, 3));
        ks1Var.Y.add(this);
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0406 A[PHI: r14
      0x0406: PHI (r14v7 char) = (r14v6 char), (r14v11 char) binds: [B:215:0x03f2, B:219:0x03f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cd  */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m81.t():void");
    }
}
