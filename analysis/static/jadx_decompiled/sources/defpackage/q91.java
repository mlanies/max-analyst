package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class q91 extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ pnf t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q91(pnf pnfVar, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.t0 = pnfVar;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        switch (this.X) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                q91 q91Var = new q91((s91) this.t0, (Continuation) obj4, 0);
                q91Var.Z = (y21) obj;
                q91Var.s0 = (d04) obj2;
                q91Var.Y = zBooleanValue;
                e5f e5fVar = e5f.a;
                q91Var.o(e5fVar);
                return e5fVar;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                q91 q91Var2 = new q91((sn1) this.t0, (Continuation) obj4, 1);
                q91Var2.Y = zBooleanValue2;
                q91Var2.Z = (wvc) obj2;
                q91Var2.s0 = (pqa) obj3;
                return q91Var2.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        n91 n91Var;
        SpannableString spannableString;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                y21 y21Var = (y21) this.Z;
                d04 d04Var = (d04) this.s0;
                boolean z = this.Y;
                s91 s91Var = (s91) this.t0;
                q0e q0eVar = s91Var.X;
                do {
                    value = q0eVar.getValue();
                    m91 m91Var = (m91) value;
                    j1e j1eVar = d04Var.a;
                    boolean z2 = j1eVar != null && j1eVar.A();
                    i95 i95Var = d04Var.j;
                    boolean z3 = d04Var.f;
                    if (z3 && (i95Var instanceof g95)) {
                        n91Var = n91.c;
                    } else {
                        n91Var = m91Var.b;
                        n91 n91Var2 = n91.b;
                        if (n91Var != n91Var2) {
                            n91Var = !z3 ? n91.a : n91Var2;
                        }
                    }
                    CharSequence charSequenceG = y21Var.c;
                    if (charSequenceG == null) {
                        charSequenceG = "";
                    }
                    boolean z4 = z && (i95Var instanceof f95);
                    boolean z5 = i95Var instanceof g95;
                    bn1 bn1Var = s91Var.o;
                    bn1Var.getClass();
                    boolean z6 = i95Var instanceof h95;
                    Context context = bn1Var.a;
                    if (z6) {
                        charSequenceG = context.getString(b8a.f0);
                    } else if (z5 && z3) {
                        charSequenceG = au1.g(context.getString(f0c.call_screen_connection_restoring), "...");
                    }
                    spannableString = null;
                    if (!w9e.C0(charSequenceG)) {
                        boolean z7 = d04Var.g;
                        int i = (!z3 && z7 && z2) ? x7a.R : (z3 || !z7) ? z2 ? x7a.D0 : (z5 || !z4) ? x7a.z : ztb.ic_connection_fill_16 : x7a.Q;
                        sba sbaVarO = qp4.u0.o(context);
                        Drawable drawableE = dy7.E(i, z4 ? sbaVarO.c.getIcon().c : sbaVarO.c.getIcon().f, context);
                        float f = 16;
                        drawableE.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        SpannableString spannableString2 = new SpannableString("   " + ((Object) charSequenceG) + " ");
                        spannableString2.setSpan(new yl5(drawableE, (sl5) null, 6), 0, 1, 17);
                        spannableString = spannableString2;
                    }
                    m91Var.getClass();
                } while (!q0eVar.c(value, new m91(spannableString, n91Var)));
                return e5f.a;
            default:
                od2.a0(obj);
                boolean z8 = this.Y;
                wvc wvcVar = (wvc) this.Z;
                pqa pqaVar = (pqa) this.s0;
                if (!z8) {
                    return null;
                }
                int iOrdinal = wvcVar.a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (wvcVar.c) {
                    return null;
                }
                fqa fqaVarD = ((sn1) this.t0).c.d();
                kvc kvcVar = wvcVar.b;
                if (tpa.f(kvcVar != null ? kvcVar.c : null, fqaVarD.a.getId())) {
                    return null;
                }
                fqa fqaVar = (fqa) pqaVar.c.get(kvcVar != null ? kvcVar.c : null);
                String name = fqaVar != null ? fqaVar.b.getName() : null;
                if (name == null || w9e.C0(name)) {
                    return null;
                }
                return new vwe(new gqe(b8a.M1, ys.m0(new Object[]{name})), new eqe(fqaVarD.a.m() ? b8a.K1 : b8a.L1));
        }
    }
}
