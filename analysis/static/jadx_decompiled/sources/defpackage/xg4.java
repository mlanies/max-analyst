package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes.dex */
public final /* synthetic */ class xg4 implements bh4, grd {
    public final /* synthetic */ long X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;

    public /* synthetic */ xg4(Object obj, Object obj2, long j, long j2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = j;
        this.X = j2;
        this.Y = obj3;
    }

    @Override // defpackage.bh4
    public ScheduledFuture b(bkg bkgVar) {
        switch (this.a) {
            case 0:
                ah4 ah4Var = (ah4) this.b;
                ah4Var.getClass();
                return ah4Var.b.scheduleAtFixedRate(new yg4(ah4Var, (Runnable) this.c, bkgVar, 0), this.o, this.X, (TimeUnit) this.Y);
            default:
                ah4 ah4Var2 = (ah4) this.b;
                ah4Var2.getClass();
                return ah4Var2.b.scheduleWithFixedDelay(new yg4(ah4Var2, (Runnable) this.c, bkgVar, 2), this.o, this.X, (TimeUnit) this.Y);
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        Object a37Var;
        dlf dlfVar = (dlf) this.b;
        dlfVar.getClass();
        l20 l20Var = (l20) this.c;
        boolean zI = l20Var.i();
        boolean zP = s5c.P(l20Var);
        String strB = dlfVar.b(l20Var);
        boolean zT = oag.t(strB);
        Context context = dlfVar.b;
        if (!zT) {
            a37Var = new uq7(context, strB);
        } else if (zI || zP) {
            k20 k20Var = l20Var.d;
            if (zI && oag.t(k20Var.h)) {
                hm9.n("VideoRipper", "buildFetcher: video from ok");
                a37Var = new d47(dlfVar.j, dlfVar.i, dlfVar.e, dlfVar.k, dlfVar.h, k20Var.a, this.o, this.X, k20Var.m);
                dlfVar = dlfVar;
            } else if (zP) {
                hm9.n("VideoRipper", "buildFetcher: video file");
                dlfVar = dlfVar;
                a37Var = new hk5(dlfVar.h, dlfVar.f, dlfVar.i, l20Var.j.a);
            } else {
                dlfVar = dlfVar;
                String str = k20Var.h;
                if (x9g.b(str)) {
                    hm9.n("VideoRipper", "buildFetcher: youtube video");
                    a37Var = new x9g(context, str);
                } else {
                    String strB2 = ypf.b(str);
                    if (oag.t(strB2)) {
                        String strB3 = a37.b(str);
                        if (oag.t(strB3)) {
                            hm9.k0("VideoRipper", null, "buildFetcher: unknown type! null", Arrays.copyOf(new Object[0], 0));
                            a37Var = null;
                        } else {
                            hm9.n("VideoRipper", "buildFetcher: instagram");
                            a37Var = new a37(strB3);
                        }
                    } else {
                        hm9.n("VideoRipper", "buildFetcher: vimeo");
                        a37Var = new ypf(strB2);
                    }
                }
            }
        } else {
            a37Var = null;
        }
        if (a37Var != null) {
            if (nqdVar.h()) {
                return;
            }
            nqdVar.a(a37Var);
            return;
        }
        if (l20Var.x == z10.b) {
            if (nqdVar.h()) {
                return;
            }
            nqdVar.onError(new FetcherException(9, "video is processing"));
        } else {
            ad adVar = (ad) dlfVar.c.get();
            if (adVar != null) {
                adVar.g("ACTION_VIDEO_FETCH_UNSUPPORTED", ((k20) this.Y).h);
            }
            if (nqdVar.h()) {
                return;
            }
            nqdVar.onError(new FetcherException(3, "Unsupported video hosting"));
        }
    }
}
