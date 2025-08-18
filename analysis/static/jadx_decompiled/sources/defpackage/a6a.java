package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.NativeLibraryLoader;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.WebmConfig;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class a6a extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ a6a(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        int i = 1;
        switch (this.b) {
            case 0:
                return new hda((Context) v4Var.c(Context.class), v4Var.d(gj.class), v4Var.d(kke.class), v4Var.d(cz4.class), v4Var.d(ds3.class), v4Var.d(y7d.class));
            case 1:
                return new rba((Context) v4Var.c(Context.class));
            case 2:
                return new cea(v4Var.d(bea.class), v4Var.d(vr7.class), v4Var.d(and.class), v4Var.d(o44.class));
            case 3:
                Context context = (Context) v4Var.c(Context.class);
                ((x6a) v4Var.c(x6a.class)).getClass();
                return new kk5(context);
            case 4:
                return new ada((Context) v4Var.c(Context.class), (o45) v4Var.c(o45.class), (kk5) v4Var.c(kk5.class), (y7d) v4Var.c(y7d.class), (f6a) v4Var.c(f6a.class), (uuc) v4Var.c(uuc.class), (kke) v4Var.c(kke.class));
            case 5:
                return (af8) v4Var.c(ada.class);
            case 6:
                return (cj0) v4Var.c(ada.class);
            case 7:
                return new c6a(v4Var);
            case 8:
                return new f6a(v4Var);
            case 9:
                ue5.a.getClass();
                return ob6.o;
            case 10:
                return new mg5();
            case 11:
                u2a u2aVar = (u2a) v4Var.c(u2a.class);
                ri4 ri4Var = (ri4) v4Var.c(ri4.class);
                y7d y7dVar = (y7d) v4Var.c(y7d.class);
                t2a t2aVarA = u2aVar.a();
                t2aVarA.c.clear();
                qyc qycVar = (qyc) y7dVar;
                qycVar.getClass();
                if (v44.a((int) qycVar.q(PmsKey.f27debugmode, 0)) != v44.DISABLED) {
                    t2aVarA.d.add(new ur0(i, "k5c"));
                } else {
                    ri4Var.e();
                }
                return new k5c(new u2a(t2aVarA));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new hq6(new qd(new khe(new ot2(v4Var, 8)), (w0f) v4Var.c(w0f.class)));
            case 13:
                return new ame(new khe(new ot2(v4Var, 9)));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new oke(v4Var.d(fme.class), v4Var.d(ame.class), v4Var.d(m7b.class), v4Var.d(zi5.class), v4Var.d(hle.class), v4Var.d(o45.class), v4Var.d(gh3.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((xe6) ((u8e) v4Var.c(u8e.class))).a();
                khe kheVarD = v4Var.d(oke.class);
                khe kheVarD2 = v4Var.d(vx4.class);
                v4Var.d(v7g.class);
                return new ay4(kheVarD, kheVarD2);
            case 16:
                return new wx4(v4Var.d(cz4.class), v4Var.d(ji.class));
            case LangUtils.HASH_SEED /* 17 */:
                return new cz4((Context) v4Var.c(Context.class), v4Var.d(kke.class));
            case 18:
                return new g6a(v4Var);
            case 19:
                return (lx4) v4Var.c(cz4.class);
            case 20:
                return lz7.q((Context) v4Var.c(Context.class));
            case 21:
                return new RLottie.Config((Context) v4Var.c(Context.class), true, NativeLibraryLoader.INSTANCE.getDefault(), 0.0f, new ob6(14), 8, null);
            case 22:
                return new WebmConfig.Config(null, new kj6(14), 1, null);
            case 23:
                return new jm9((Context) v4Var.c(Context.class), new khe(new ot2(v4Var, 10)), new aea(v4Var.d(u2a.class)), new gaa(v4Var), Runtime.getRuntime().availableProcessors(), new w4d(v4Var), new ot2(v4Var, 12));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int i2 = jpc.a0;
                int i3 = jpc.r;
                return new ex4();
            case 25:
                return new iu6((p7b) v4Var.c(p7b.class), v4Var.d(p82.class), v4Var.d(el3.class), v4Var.d(iba.class));
            case 26:
                return new vl((Application) v4Var.c(Application.class), v4Var.d(p7b.class), new khe(bv3.t0), (x6a) v4Var.c(x6a.class));
            case 27:
                return new ee3(new bg4(v4Var, v4Var.d(t6b.class), v4Var.d(el3.class), v4Var.d(p82.class), v4Var.d(tme.class)));
            case 28:
                return new cba(v4Var.d(uca.class), v4Var.d(xie.class), (kke) v4Var.c(kke.class));
            default:
                return x6a.a;
        }
    }
}
