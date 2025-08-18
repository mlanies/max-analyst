package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class sx6 extends ckc {
    public final /* synthetic */ int b;

    public /* synthetic */ sx6(int i) {
        this.b = i;
    }

    @Override // defpackage.ckc
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new lu0(v4Var.d(r79.class));
            case 1:
                return (ch9) v4Var.c(uh9.class);
            case 2:
                return new ac6();
            case 3:
                return new xe5(v4Var.d(ri4.class), v4Var.d(f5a.class), v4Var.d(ds3.class), v4Var.d(q33.class), v4Var.d(y7d.class), v4Var.d(Context.class));
            case 4:
                return new d80(v4Var.d(ad.class), v4Var.d(q33.class), v4Var.d(an9.class));
            case 5:
                Context context = (Context) v4Var.c(Context.class);
                va4 va4Var = new va4();
                synchronized (va4Var) {
                    va4Var.a = true;
                }
                oc4 oc4Var = new oc4(context, va4Var);
                l68 l68Var = new l68(v4Var);
                oc4Var.b = l68Var;
                od odVar = oc4Var.a;
                if (l68Var != ((q24) odVar.X)) {
                    odVar.X = l68Var;
                    ((HashMap) odVar.c).clear();
                    ((HashMap) odVar.o).clear();
                }
                return oc4Var;
            case 6:
                return new jb4();
            case 7:
                return new so4((Context) v4Var.c(Context.class), (e34) v4Var.c(wxd.class), (gw0) v4Var.c(spd.class), (q24) v4Var.c(jb4.class), ((iba) v4Var.c(iba.class)).c());
            case 8:
                return new spd(new File(au1.g(((Context) v4Var.c(Context.class)).getCacheDir().getAbsolutePath(), "/media")), new te7(mz7.a0(new kpa(ub8.X, 524288000L), new kpa(ub8.c, 52428800L))), (e34) v4Var.c(wxd.class), false);
            case 9:
                return new do8((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 10:
                return new pc4(v4Var.d(u7b.class), v4Var.d(q33.class), v4Var.d(y7b.class));
            case 11:
                return new o29(v4Var);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ob6();
            case 13:
                return new o89(v4Var.d(kke.class), v4Var.d(s8g.class), v4Var.d(xb6.class), v4Var.d(x19.class), v4Var.d(dc6.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new kaa((Context) v4Var.c(Context.class), (p84) v4Var.c(p84.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ji(new fi(), (Context) v4Var.c(Context.class));
            case 16:
                tk7 tk7Var = new tk7();
                tk7Var.a = "https";
                tk7Var.b = "max";
                tk7Var.c = "api.oneme.ru";
                tk7Var.d = "443";
                tk7Var.e = "max.ru";
                tk7Var.f = "api-test.oneme.ru";
                tk7Var.g = "api-tg.oneme.ru";
                tk7Var.h = "api";
                tk7Var.i = "chat";
                tk7Var.j = ConversationStartedStat.CALL_TYPE_JOIN;
                tk7Var.k = ConversationStartedStat.CALL_TYPE_JOIN;
                tk7Var.l = "joincall";
                tk7Var.m = "u";
                tk7Var.n = "stickerset";
                tk7Var.o = "startapp";
                tk7Var.p = ":folder";
                return new fl7(tk7Var);
            case LangUtils.HASH_SEED /* 17 */:
                return new lca((Context) v4Var.c(Context.class), v4Var.d(al.class));
            case 18:
                return new l6a(v4Var);
            case 19:
                return (b99) v4Var.c(zke.class);
            case 20:
                return new i8a((kke) v4Var.c(kke.class), v4Var.d(gj.class), (ox3) v4Var.c(ox3.class));
            case 21:
                return new d8a(v4Var.d(wxc.class));
            case 22:
                return new dc6(v4Var.d(ida.class), v4Var.d(iy2.class), v4Var.d(ad.class));
            case 23:
                return new dv4(v4Var.d(dc6.class), v4Var.d(r79.class), v4Var.d(kke.class), v4Var.d(s8g.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new sy5(v4Var.d(s8g.class), v4Var.d(xb6.class), v4Var.d(dc6.class));
            case 25:
                return new bz5(v4Var.d(xb6.class), v4Var.d(s8g.class), v4Var.d(dc6.class));
            case 26:
                return new xb6(v4Var.d(kke.class), v4Var.d(iy2.class), v4Var.d(tp7.class), v4Var.d(q33.class));
            case 27:
                return new n8c((Context) v4Var.c(Context.class));
            case 28:
                return new tda(v4Var.d(m7b.class), v4Var.d(kk5.class), v4Var.d(kaa.class), v4Var.d(gt9.class), (Context) v4Var.c(Context.class));
            default:
                return new p84();
        }
    }
}
