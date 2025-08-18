package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class d11 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ d11(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new l31((jr1) v4Var.c(jr1.class), v4Var.d(iy2.class), v4Var.d(pk.class), v4Var.d(cs1.class), v4Var.d(ida.class), v4Var.d(kke.class), v4Var.d(el3.class), v4Var.d(tm3.class), v4Var.d(xb9.class));
            case 1:
                return new xs1();
            case 2:
                return new jr1(v4Var.d(kke.class), v4Var.d(ox3.class));
            case 3:
                return new vvc(v4Var.d(fw3.class), v4Var.d(jr1.class), v4Var.d(ez0.class), v4Var.d(bt1.class), (so1) v4Var.c(so1.class), v4Var.d(tm3.class));
            case 4:
                return new lkc(v4Var.d(Context.class), v4Var.d(y7d.class));
            case 5:
                return new vs1(v4Var.d(Context.class), v4Var.d(bea.class), v4Var.d(p84.class), v4Var.d(kke.class), v4Var.d(ya1.class));
            case 6:
                return new qs1(v4Var.d(vs1.class), v4Var.d(ya1.class), v4Var.d(lqf.class));
            case 7:
                return new xuc(v4Var.d(fw3.class));
            case 8:
                return new so1(v4Var.d(kke.class), v4Var.d(ds3.class), v4Var.d(q33.class), v4Var.d(xb9.class), v4Var.d(blb.class));
            case 9:
                v4Var.d(Context.class);
                return new cb5(v4Var.d(jr1.class), v4Var.d(kke.class), v4Var.d(tg1.class), v4Var.d(aa1.class), v4Var.d(kr1.class));
            case 10:
                return new ba1(v4Var.d(Context.class), v4Var.d(os1.class));
            case 11:
                return new q71(v4Var.d(kr1.class), v4Var.d(lkc.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ty0(v4Var.d(kr1.class), v4Var.d(eua.class), v4Var.d(bt1.class));
            case 13:
                return new ya1(v4Var.d(Application.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                n31 n31Var = n31.a;
                kr1 kr1VarD = n31Var.d();
                zi1 zi1Var = zi1.a;
                nb5 nb5Var = (nb5) zi1Var.getAccessor().c(nb5.class);
                z01 z01Var = (z01) n31Var.getAccessor().c(z01.class);
                os1 os1VarC = n31Var.c();
                je7 je7Var = yi1.a;
                return new l91(kr1VarD, nb5Var, z01Var, os1VarC, zi1Var.getAccessor().d(tg1.class), zi1Var.getAccessor().d(q71.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new hw7();
            case 16:
                return new vaa(v4Var.d(o45.class), v4Var.d(au8.class), v4Var.d(y7d.class));
            case LangUtils.HASH_SEED /* 17 */:
                return new vd2(v4Var);
            case 18:
                return new jt2((q33) v4Var.c(q33.class));
            case 19:
                Context context = (Context) v4Var.c(Context.class);
                khe kheVarD = v4Var.d(ida.class);
                v4Var.d(kr2.class);
                khe kheVarD2 = v4Var.d(mz6.class);
                khe kheVarD3 = v4Var.d(t00.class);
                khe kheVarD4 = v4Var.d(are.class);
                v4Var.d(x6a.class);
                khe kheVarD5 = v4Var.d(ak3.class);
                v4Var.d(iy2.class);
                return new ld2(context, kheVarD, kheVarD2, kheVarD3, kheVarD4, kheVarD5, (kke) v4Var.c(kke.class), v4Var.d(ty3.class), new ot2(v4Var, 1));
            case 20:
                return (lr2) v4Var.c(ld2.class);
            case 21:
                return (d4f) v4Var.c(ld2.class);
            case 22:
                return new rt2(v4Var);
            case 23:
                return new nba((ta2) v4Var.c(ta2.class), (kke) v4Var.c(kke.class), (yu2) v4Var.c(yu2.class), (av0) v4Var.c(av0.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new fx7(((w9a) ((kke) sd3.i.getValue())).c());
            case 25:
                return new qqd(0, ((w9a) ((kke) sd3.i.getValue())).e());
            case 26:
                return new p94(((w9a) ((kke) sd3.i.getValue())).a());
            case 27:
                return (iba) sd3.f.getValue();
            case 28:
                return (hle) sd3.g.getValue();
            default:
                return (kke) sd3.i.getValue();
        }
    }
}
