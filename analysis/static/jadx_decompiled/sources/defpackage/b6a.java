package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.logging.Logger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.a;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class b6a extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ b6a(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return (ox3) sd3.h.getValue();
            case 1:
                qec qecVar = new qec("^TTSession#.*$");
                return new uca((oca) v4Var.c(np.class), new pca(y53.M(new qca("all-logs", null, qecVar, 0, 26), new qca("important-logs", qecVar, null, 2048, 12), new qca("missed-contacts", new qec("^MissedContactsController.*$"), null, 4096, 12), new qca("calls-sdk-logs", new qec("^CallsSdk.*$"), null, 4096, 12), new qca("analytics", new qec("^LogController.*$"), null, 8192, 12)), v4Var.d(kk5.class), new ot2(v4Var, 13), new ot2(v4Var, 14)));
            case 2:
                Context context = (Context) v4Var.c(Context.class);
                Logger logger = zua.h;
                if (context == null) {
                    throw new IllegalArgumentException("context could not be null.");
                }
                ey1 ey1Var = new ey1(3, context.getAssets());
                qc4 qc4Var = new qc4(ey1Var);
                return new zua(new imc(qc4Var.b, ey1Var, qc4Var.a), m6d.q());
            case 3:
                v4Var.d(au8.class);
                v4Var.d(p82.class);
                v4Var.d(hbd.class);
                v4Var.d(zp.class);
                v4Var.d(t33.class);
                v4Var.d(pk.class);
                v4Var.d(av0.class);
                v4Var.d(kk5.class);
                ((x6a) v4Var.c(x6a.class)).getClass();
                int i = ft4.o;
                ft4.e(z7.R(12, kt4.HOURS));
                v4Var.d(haa.class);
                v4Var.d(kke.class);
                return new nl0();
            case 4:
                return (ty3) v4Var.c(np.class);
            case 5:
                return (cd) v4Var.c(op.class);
            case 6:
                return new and((Context) v4Var.c(Context.class), v4Var.d(f5a.class), v4Var.d(iy2.class), v4Var.d(ox3.class), v4Var.d(q33.class), v4Var.d(kke.class), v4Var.d(al.class), v4Var.d(gt9.class));
            case 7:
                return new gt9((Context) v4Var.c(Context.class), v4Var.d(iv6.class));
            case 8:
                return new zf0((Context) v4Var.c(Context.class), (iy2) v4Var.c(iy2.class), (ci0) v4Var.c(ci0.class), (kke) v4Var.c(kke.class), (ox3) v4Var.c(ox3.class));
            case 9:
                return new vh3((kke) v4Var.c(kke.class), (hbd) v4Var.c(hbd.class));
            case 10:
                return ((Application) v4Var.c(Application.class)).getResources();
            case 11:
                return new qf7((av0) v4Var.c(av0.class), (mz6) v4Var.c(mz6.class), v4Var.d(lr2.class), (kke) v4Var.c(kke.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new n6a(v4Var);
            case 13:
                return new djc(v4Var.d(s8g.class), v4Var.d(jy8.class), (kke) v4Var.c(kke.class), (ox3) v4Var.c(ox3.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new z4(((Context) v4Var.c(Context.class)).getString(yzb.account_auth_type));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                a aVar = (a) v4Var.c(a.class);
                ho9 ho9Var = new ho9();
                ho9Var.a = Math.min(100, 50);
                ho9Var.d = ((iba) v4Var.c(iba.class)).c();
                ho9Var.b = ((iba) v4Var.c(iba.class)).a();
                ho9Var.c = aVar;
                return new me3(ho9Var);
            case 16:
                return new jaa(v4Var.d(f5a.class));
            case LangUtils.HASH_SEED /* 17 */:
                return (h64) v4Var.c(jaa.class);
            case 18:
                haa haaVar = new haa(v4Var.d(qe5.class));
                haaVar.e = new r61(v4Var);
                return haaVar;
            case 19:
                return new eua((Context) v4Var.c(Context.class), (acf) v4Var.c(acf.class));
            case 20:
                return new rta((Application) v4Var.c(Application.class));
            case 21:
                return new rff((Context) v4Var.c(Context.class), v4Var.d(ad.class), (q33) v4Var.c(q33.class), (pk) v4Var.c(pk.class), (zi5) v4Var.c(zi5.class), (ief) v4Var.c(ief.class), (kke) v4Var.c(kke.class), v4Var.d(r79.class), v4Var.d(iy2.class));
            case 22:
                return new y4b((Application) v4Var.c(Application.class), (o45) v4Var.c(o45.class), (n65) v4Var.c(n65.class), v4Var.d(q33.class), (n4b) v4Var.c(n4b.class));
            case 23:
                return new jrd((Application) v4Var.c(Application.class), (o45) v4Var.c(o45.class), (n65) v4Var.c(n65.class), v4Var.d(q33.class), (n4b) v4Var.c(n4b.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new n65((Context) v4Var.c(Context.class), v4Var.d(gw0.class));
            case 25:
                kk5 kk5Var = (kk5) ((zi5) v4Var.c(zi5.class));
                kk5Var.getClass();
                return new spd(kk5.g(kk5Var.b(), "videoCache"), new se7(104857600L), null, true);
            case 26:
                return new ief();
            case 27:
                return new n4b((y7d) v4Var.c(y7d.class));
            case 28:
                return (hyc) v4Var.c(t33.class);
            default:
                return (q33) v4Var.c(t33.class);
        }
    }
}
