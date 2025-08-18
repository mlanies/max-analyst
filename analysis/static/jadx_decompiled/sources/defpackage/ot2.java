package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class ot2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ ot2(v4 v4Var, int i) {
        this.a = i;
        this.b = v4Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        v4 v4Var = this.b;
        switch (this.a) {
            case 0:
                return new tya(v4Var.d(q33.class), v4Var.d(w7b.class), v4Var.d(u7b.class));
            case 1:
                return Long.valueOf(((hyc) ((q33) v4Var.c(q33.class))).t());
            case 2:
                return (tmc) v4Var.c(tmc.class);
            case 3:
                return ((jle) ((hle) v4Var.c(hle.class))).a();
            case 4:
                return new cf7(v4Var);
            case 5:
                return ((jle) ((hle) v4Var.c(hle.class))).a();
            case 6:
                return ((jle) ((hle) v4Var.c(hle.class))).a();
            case 7:
                mw0 mw0Var = new mw0();
                mw0Var.a = (gw0) v4Var.c(spd.class);
                mw0Var.d = new h94((Context) v4Var.c(Context.class), (q24) v4Var.c(jb4.class));
                mw0Var.c = true;
                mw0Var.e = 2;
                return mw0Var;
            case 8:
                return ((k5c) v4Var.c(k5c.class)).a;
            case 9:
                return ((hq6) v4Var.c(hq6.class)).a;
            case 10:
                return ((iba) v4Var.c(iba.class)).c();
            case 11:
                iba ibaVar = (iba) v4Var.c(iba.class);
                bc7[] bc7VarArr = iba.p;
                return ibaVar.h(ibaVar.i(ibaVar.b().a(5, "rlottie"), "rlottie"), "rlottie");
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return Boolean.valueOf(((vi4) v4Var.c(vi4.class)).compareTo(vi4.X) >= 0);
            case 13:
                qyc qycVar = (qyc) ((y7d) v4Var.c(y7d.class));
                Integer num = (Integer) ((ml0) qycVar.i.getValue()).A();
                return v44.a(num != null ? num.intValue() : (int) qycVar.q(PmsKey.f27debugmode, 0));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new z45(((w9a) ((kke) v4Var.c(kke.class))).d().f(1, "file-logging", 1, 5));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                iba ibaVar2 = (iba) v4Var.c(iba.class);
                ibaVar2.getClass();
                bc7 bc7Var = iba.p[4];
                return ibaVar2.e(ibaVar2.j);
            case 16:
                hle hleVar = (hle) v4Var.c(hle.class);
                hleVar.getClass();
                return ((jle) hleVar).a();
            case LangUtils.HASH_SEED /* 17 */:
                return ((jle) ((hle) v4Var.c(hle.class))).b();
            case 18:
                return (ScheduledExecutorService) ((iba) v4Var.c(iba.class)).l.getValue();
            case 19:
                return new uxc(v4Var);
            case 20:
                return ((jle) ((hle) v4Var.c(hle.class))).a();
            case 21:
                return ((hyc) ((q33) v4Var.c(q33.class))).v();
            case 22:
                ((ri4) v4Var.c(ri4.class)).e();
                return j4a.a;
            case 23:
                return ((jle) ((hle) v4Var.c(hle.class))).b();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return Long.valueOf(((hyc) ((q33) v4Var.c(q33.class))).t());
            case 25:
                return ((iba) v4Var.c(iba.class)).c();
            case 26:
                return new zxc(v4Var);
            case 27:
                return ((OneMeRoomDatabase) ((pfa) v4Var.c(pfa.class)).m()).X();
            case 28:
                return Long.valueOf(((hyc) ((q33) v4Var.c(q33.class))).t());
            default:
                return ((jle) ((hle) v4Var.c(hle.class))).a();
        }
    }
}
