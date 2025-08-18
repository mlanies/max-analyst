package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.logout.a;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class zq3 implements b37 {
    public final /* synthetic */ int a;

    public /* synthetic */ zq3(int i) {
        this.a = i;
    }

    @Override // defpackage.b37
    public final Object a(v4 v4Var) {
        switch (this.a) {
            case 0:
                return new lr3(0, v4Var.d(y7d.class));
            case 1:
                return new jqd((Context) v4Var.c(Context.class), v4Var.d(f64.class));
            case 2:
                q33 q33Var = (q33) v4Var.c(q33.class);
                return new hp7(new eqe(m0c.oneme_settings_iar_time_condition), new e11(0, q33Var, q33.class, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z", 0, 20), new f(1, q33Var, q33.class, "setDisableInAppReviewTimeCondition", "setDisableInAppReviewTimeCondition(Z)V", 0, 15), 0, 24);
            case 3:
                q33 q33Var2 = (q33) v4Var.c(q33.class);
                return new hp7(new eqe(m0c.oneme_settings_iar_market_build_condition), new e11(0, q33Var2, q33.class, "isEnableInAppReviewNotFromMarketBuild", "isEnableInAppReviewNotFromMarketBuild()Z", 0, 21), new f(1, q33Var2, q33.class, "setEnableInAppReviewNotFromMarketBuild", "setEnableInAppReviewNotFromMarketBuild(Z)V", 0, 16), 0, 24);
            case 4:
                q33 q33Var3 = (q33) v4Var.c(q33.class);
                return new hp7(new eqe(m0c.oneme_settings_web_app_ssl), new e11(0, q33Var3, q33.class, "isDisableWebAppSsl", "isDisableWebAppSsl()Z", 0, 22), new f(1, q33Var3, q33.class, "setDisableWebAppSsl", "setDisableWebAppSsl(Z)V", 0, 17), 0, 24);
            case 5:
                return new f11(1);
            case 6:
                return new ie8(1);
            case 7:
                return new d07(v4Var.d(Context.class), v4Var.d(q33.class), v4Var.d(ri4.class), v4Var.d(x6a.class));
            case 8:
                return new d7d(v4Var.d(f64.class), (q33) v4Var.c(q33.class));
            case 9:
                return new qkd(v4Var.d(Context.class), v4Var.d(kke.class));
            case 10:
                return new oi4();
            case 11:
                return new ate(v4Var.d(kke.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ij6(v4Var.d(Context.class), v4Var.d(kk5.class), v4Var.d(kke.class), v4Var.d(wha.class));
            case 13:
                return new dd(v4Var.d(wha.class), v4Var.d(js7.class), 0);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new dd(v4Var.d(p82.class), v4Var.d(cea.class), 1);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return gh5.b;
            case 16:
                return new ie8(2);
            case LangUtils.HASH_SEED /* 17 */:
                return new ie8(3);
            case 18:
                khe kheVarD = v4Var.d(hp.class);
                khe kheVarD2 = v4Var.d(are.class);
                khe kheVarD3 = v4Var.d(q33.class);
                khe kheVarD4 = v4Var.d(kke.class);
                khe kheVarD5 = v4Var.d(Context.class);
                khe kheVarD6 = v4Var.d(zu8.class);
                v4Var.d(iy2.class);
                return new kz(kheVarD, kheVarD2, kheVarD3, kheVarD4, kheVarD5, kheVarD6, v4Var.d(ak3.class), v4Var.d(ida.class));
            case 19:
                return je6.a;
            case 20:
                return new ie8(4);
            case 21:
                cy6 cy6Var = (cy6) v4Var.c(cy6.class);
                cy6Var.getClass();
                if (((f5a) tx6.a.getAccessor().c(f5a.class)).d()) {
                    return cy6Var.c;
                }
                cy6Var.c = null;
                return null;
            case 22:
                return new wa9((eca) v4Var.c(eca.class), (kke) v4Var.c(kke.class), (a) v4Var.c(a.class), v4Var.d(nob.class), v4Var.d(io0.class));
            case 23:
                return (qu2) v4Var.c(wa9.class);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new ie8(5);
            case 25:
                return new ib6(v4Var.d(ds3.class), v4Var.d(b9a.class));
            case 26:
                return new oc6(v4Var.d(Context.class), v4Var.d(blb.class), v4Var.d(kk5.class), v4Var.d(y7d.class), v4Var.d(kke.class), v4Var.d(q33.class));
            case 27:
                return new ie8(6);
            case 28:
                return new df7();
            default:
                return new vj7(v4Var.d(el3.class), v4Var.d(p82.class), v4Var.d(iy2.class), v4Var.d(fl7.class), v4Var.d(pk.class), v4Var.d(au8.class), v4Var.d(kke.class), v4Var.d(hc2.class), v4Var.d(gc2.class), v4Var.d(ki7.class), v4Var.d(q33.class), v4Var.d(qe5.class), v4Var.d(n6a.class), v4Var.d(f64.class), v4Var.d(ab6.class), v4Var.d(ta2.class), v4Var.d(f5a.class));
        }
    }
}
