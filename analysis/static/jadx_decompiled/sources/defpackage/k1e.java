package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class k1e extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ k1e(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new it8(v4Var.d(ad.class), v4Var.d(q33.class));
            case 1:
                return new an9((kke) v4Var.c(kke.class), (zp) v4Var.c(zp.class), (w1e) v4Var.c(w1e.class), v4Var.d(ad.class), v4Var.d(q33.class), v4Var.d(y7d.class), v4Var.d(ita.class));
            case 2:
                return new w1e();
            case 3:
                return (tg1) v4Var.c(w1e.class);
            case 4:
                return new ax7(v4Var.d(q33.class), v4Var.d(ita.class), (kke) v4Var.c(kke.class));
            case 5:
                return new ita((ax7) v4Var.c(ax7.class), v4Var.d(ad.class), v4Var.d(q33.class));
            case 6:
                return new aua(v4Var.d(ad.class), v4Var.d(q33.class), v4Var.d(an9.class), (kke) v4Var.c(kke.class));
            case 7:
                return new kh0(v4Var.d(q33.class), v4Var.d(ad.class), v4Var.d(an9.class));
            case 8:
                return new bt1(v4Var.d(q33.class), v4Var.d(ad.class), v4Var.d(an9.class));
            case 9:
                return new vsf(v4Var.d(ad.class), v4Var.d(q33.class));
            case 10:
                return new wc7(v4Var.d(o2e.class), v4Var.d(md5.class), v4Var.d(sc5.class), v4Var.d(b6e.class));
            case 11:
                return new vr7();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new sp3();
            case 13:
                return new iye();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                khe kheVarD = v4Var.d(ad.class);
                khe kheVarD2 = v4Var.d(o45.class);
                khe kheVarD3 = v4Var.d(gh3.class);
                khe kheVarD4 = v4Var.d(ri4.class);
                return new w0f(kheVarD, kheVarD3, kheVarD4, kheVarD2, v4Var.d(zi5.class), v4Var.d(af8.class), new khe(new qt2(1, kheVarD4)));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new c7f((y8f) v4Var.c(y8f.class), (fme) v4Var.c(fme.class), (ime) v4Var.c(ime.class), (w0f) v4Var.c(w0f.class), (q33) v4Var.c(q33.class), (pk) v4Var.c(pk.class), (ztc) ((jle) ((hle) v4Var.c(hle.class))).g.getValue());
            case 16:
                khe kheVar = new khe(new fyc(v4Var, 14));
                w0f w0fVar = (w0f) v4Var.c(w0f.class);
                return new x0f(v4Var, (kke) v4Var.c(kke.class), kheVar, v4Var.d(u2a.class), v4Var.d(ct0.class), w0fVar);
            case LangUtils.HASH_SEED /* 17 */:
                return new cge(v4Var.d(pk.class), v4Var.d(q33.class), v4Var.d(hbd.class), v4Var.d(y8f.class), v4Var.d(x0f.class), (w0f) v4Var.c(w0f.class));
            case 18:
                return new ige(v4Var.d(kke.class), v4Var.d(q2e.class), v4Var.d(kw3.class), v4Var.d(cge.class));
            case 19:
                return new ek5(v4Var.d(u2a.class), (w0f) v4Var.c(w0f.class));
            case 20:
                return new gq6(new qd(v4Var.d(u2a.class), (w0f) v4Var.c(w0f.class)));
            case 21:
                return new dfe(new sja(v4Var.d(u2a.class), (w0f) v4Var.c(w0f.class)));
            case 22:
                return new n0f(new hk4());
            case 23:
                return new jvc((Context) v4Var.c(Context.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new zbf(v4Var);
            case 25:
                khe kheVarD5 = v4Var.d(u8e.class);
                khe kheVarD6 = v4Var.d(q33.class);
                khe kheVarD7 = v4Var.d(x6a.class);
                p67 p67Var = (p67) v4Var.c(p67.class);
                khe kheVarD8 = v4Var.d(SystemServicesManager$PushTokenGeneratedListener.class);
                khe kheVarD9 = v4Var.d(ty3.class);
                ox3 ox3Var = (ox3) v4Var.c(ox3.class);
                khe kheVarD10 = v4Var.d(vt7.class);
                v4Var.d(y7d.class);
                return new xie(kheVarD5, kheVarD6, kheVarD7, p67Var, kheVarD8, kheVarD9, ox3Var, kheVarD10, v4Var.d(qe5.class));
            case 26:
                Context context = (Context) v4Var.c(Context.class);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                return new acf(((Boolean) ccf.a.getValue()).booleanValue(), new p9g(context, 0), notificationManager);
            case 27:
                return new lqf((Application) v4Var.c(Application.class), (jvc) v4Var.c(jvc.class), v4Var.d(mqf.class), v4Var.d(ad.class), v4Var.d(ike.class), ((w9a) ((kke) v4Var.c(kke.class))).b().limitedParallelism(1, "visibility-controller"), v4Var.d(eua.class));
            case 28:
                return (zp) v4Var.c(lqf.class);
            default:
                return (ri4) v4Var.c(ti4.class);
        }
    }
}
