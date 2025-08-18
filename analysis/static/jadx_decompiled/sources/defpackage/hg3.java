package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class hg3 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ jg3 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public hg3(jg3 jg3Var, int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.o = jg3Var;
                super(9, (Object) 0);
                break;
            default:
                gg3 gg3Var = gg3.NORMAL;
                this.o = jg3Var;
                super(9, gg3Var);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [utd] */
    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                gg3 gg3Var = (gg3) obj2;
                pq9 pq9Var = qp4.u0;
                jg3 jg3Var = this.o;
                final int iC = pq9Var.j(jg3Var).c(gg3Var.a);
                int iOrdinal = gg3Var.ordinal();
                vx3 vx3Var = vx3.b;
                final bud budVar = jg3Var.b2;
                if (iOrdinal == 0) {
                    jg3Var.setInputsEnabled(false);
                    ArrayList arrayListG0 = jg3.G0(jg3Var);
                    ig3 ig3Var = new ig3(jg3Var, gg3Var, 0);
                    budVar.getClass();
                    final int i = 0;
                    ytd ytdVar = new ytd(arrayListG0, ig3Var, budVar, new m56() { // from class: utd
                        @Override // defpackage.m56
                        public final Object invoke(Object obj3) {
                            l17 l17Var = (l17) obj3;
                            switch (i) {
                                case 0:
                                    budVar.getClass();
                                    bud.a(l17Var, iC);
                                    break;
                                default:
                                    budVar.getClass();
                                    bud.a(l17Var, iC);
                                    break;
                            }
                            return e5f.a;
                        }
                    }, null);
                    sx3 sx3Var = budVar.a;
                    vxd vxdVarT = j47.T(sx3Var, null, vx3Var, ytdVar, 1);
                    bc7[] bc7VarArr = bud.e;
                    budVar.d.o1(budVar, bc7VarArr[1], vxdVarT);
                    budVar.c.o1(budVar, bc7VarArr[0], j47.T(sx3Var, null, vx3Var, new aud(arrayListG0, budVar, new shb(2, budVar, bud.class, "animateShackingView", "animateShackingView(Lone/me/sdk/codeinput/InputController;)V", 4, 6), null), 1));
                    return;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jg3Var.setInputsEnabled(true);
                    ArrayList arrayListG02 = jg3.G0(jg3Var);
                    ig3 ig3Var2 = new ig3(jg3Var, gg3Var, 2);
                    budVar.b();
                    budVar.d.o1(budVar, bud.e[1], j47.T(budVar.a, null, vx3Var, new wtd(arrayListG02, ig3Var2, new wy6(budVar, iC), 300L, null), 1));
                    return;
                }
                jg3Var.setInputsEnabled(!jg3Var.getDisableInputsForError());
                if (Build.VERSION.SDK_INT >= 30) {
                    pag.F(jg3Var, ni6.REJECT);
                }
                ArrayList arrayListG03 = jg3.G0(jg3Var);
                ig3 ig3Var3 = new ig3(jg3Var, gg3Var, 1);
                budVar.b();
                kwd kwdVar = new kwd(jg3Var, kwd.p);
                lwd lwdVar = new lwd(0.0f);
                lwdVar.b(1500.0f);
                lwdVar.a(0.2f);
                kwdVar.m = lwdVar;
                kwdVar.a = 3000.0f;
                kwdVar.g();
                final int i2 = 1;
                budVar.d.o1(budVar, bud.e[1], j47.T(budVar.a, null, vx3Var, new wtd(arrayListG03, ig3Var3, new m56() { // from class: utd
                    @Override // defpackage.m56
                    public final Object invoke(Object obj3) {
                        l17 l17Var = (l17) obj3;
                        switch (i2) {
                            case 0:
                                budVar.getClass();
                                bud.a(l17Var, iC);
                                break;
                            default:
                                budVar.getClass();
                                bud.a(l17Var, iC);
                                break;
                        }
                        return e5f.a;
                    }
                }, 200L, null), 1));
                return;
            default:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                jg3 jg3Var2 = this.o;
                jg3Var2.setAdapter(new qtd(iIntValue, jg3Var2, new qk2(2, jg3Var2)));
                return;
        }
    }
}
