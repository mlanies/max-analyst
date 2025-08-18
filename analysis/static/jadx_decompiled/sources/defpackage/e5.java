package defpackage;

import android.graphics.Typeface;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.FileAttachView;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.audio.AudioRecordView;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class e5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.f6
    public final void run() {
        mpa mpaVarL;
        es8 es8Var;
        q10 q10VarF;
        int i = 0;
        switch (this.a) {
            case 0:
                ActAttachesView actAttachesView = (ActAttachesView) this.b;
                s20 s20Var = actAttachesView.W0;
                if (s20Var == null || (mpaVarL = s20Var.l(actAttachesView.f1.getCurrentItem())) == null) {
                    return;
                }
                l20 l20Var = (l20) mpaVarL.a;
                actAttachesView.m1.s((es8) mpaVarL.b, l20Var.f() ? l20Var.b.s0 : l20Var.i() ? l20Var.d.a : l20Var.c() ? l20Var.j.a : 0L);
                return;
            case 1:
                int i2 = AudioRecordView.O0;
                ((AudioRecordView) this.b).getClass();
                return;
            case 2:
                kk5 kk5Var = (kk5) ((dq0) this.b).a;
                kk5Var.getClass();
                File[] fileArrListFiles = kk5.g(kk5Var.b(), "botCommands").listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    hm9.n("dq0", "deleteBotCommands: directory is empty");
                    return;
                }
                int length = fileArrListFiles.length;
                while (i < length) {
                    fileArrListFiles[i].delete();
                    i++;
                }
                return;
            case 3:
                cx0 cx0Var = (cx0) this.b;
                synchronized (cx0Var) {
                    cx0Var.j = null;
                }
                return;
            case 4:
                hp3 hp3Var = (hp3) this.b;
                gp3 gp3Var = hp3Var.J0.Z;
                if (gp3Var != null) {
                    e08 e08Var = hp3Var.I0;
                    Iterator it = ((Set) ((pk9) gp3Var).a).iterator();
                    while (it.hasNext()) {
                        el9 el9Var = ((mj9) it.next()).o;
                        if (el9Var != null) {
                            el9Var.n(new gj0(e08Var, i));
                        }
                    }
                    return;
                }
                return;
            case 5:
                ((rr3) this.b).b();
                return;
            case 6:
                ((Runnable) this.b).run();
                return;
            case 7:
                Typeface typeface = FileAttachView.X0;
                ((FileAttachView) this.b).getClass();
                throw null;
            case 8:
                n46 n46VarU1 = ((FrgAttachUnknown) this.b).r1();
                if (n46VarU1 != null) {
                    ((ActAttachesView) n46VarU1).e();
                    return;
                }
                return;
            case 9:
                b56 b56VarR1 = ((FrgLocalVideo) this.b).r1();
                if (b56VarR1 != null) {
                    b56VarR1.e();
                    return;
                }
                return;
            case 10:
                ((jn7) this.b).getClass();
                return;
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((jy8) this.b).d.set(false);
                return;
            case 13:
                sj9 sj9Var = (sj9) this.b;
                sj9Var.getClass();
                hm9.k("sj9", "Empty locations");
                xk9 xk9Var = (xk9) ((kk9) sj9Var.b);
                xk9Var.A(false);
                xk9Var.B(Collections.emptyList());
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((zj9) this.b).C0 = null;
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                hm9.m("a4e", "storeStickerSetsFromServer: success: %s", (Collection) this.b);
                return;
            case 16:
                ede edeVar = (ede) this.b;
                e52 e52VarC = edeVar.c.C(edeVar.n.a);
                edeVar.n = e52VarC;
                if (e52VarC == null || (es8Var = e52VarC.c) == null) {
                    return;
                }
                cu8 cu8Var = es8Var.a;
                if (cu8Var.x() && System.currentTimeMillis() - cu8Var.o <= 60000 && (q10VarF = cu8Var.f()) != null) {
                    p10 p10Var = p10.c;
                    p10 p10Var2 = q10VarF.a;
                    if (p10Var2 == p10Var || p10Var2 == p10.o || p10Var2 == p10.b) {
                        edeVar.d();
                        return;
                    }
                    return;
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ds9 ds9Var = (ds9) ((s7d) ((wle) this.b).i.getValue()).j.getValue();
                ds9Var.getClass();
                bc7 bc7Var = ds9.b[0];
                ((cn7) ds9Var.a.get()).getClass();
                return;
            case 18:
                ((tme) this.b).b(true);
                return;
            case 19:
                ((ai3) this.b).getClass();
                return;
            case 20:
                hm9.m("c7f", "putUploadInRepository: finished for upload=%s", (v6f) this.b);
                return;
            case 21:
                hm9.m("wef", "removeFromRepository: success, conversionData = %s", (lef) this.b);
                return;
            case 22:
                hm9.m("wef", "putConversionInRepository: success, videoConversion = %s", (kef) this.b);
                return;
            default:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = (VideoPlayerSeekBarPreview) this.b;
                cqc.b(videoPlayerSeekBarPreview.u0);
                videoPlayerSeekBarPreview.c.a(false);
                return;
        }
        while (true) {
            yx7 yx7Var = (yx7) this.b;
            if (i >= yx7Var.n.size()) {
                px7 px7Var = yx7Var.i;
                if (px7Var != null) {
                    px7Var.c(yx7Var.r, yx7Var.n);
                    return;
                }
                return;
            }
            kzc kzcVar = (kzc) yx7Var.n.get(i);
            if (kzcVar.a == 1) {
                e52 e52VarC2 = yx7Var.a.C(kzcVar.o.a);
                if (e52VarC2 == null || !e52VarC2.h0()) {
                    yx7Var.n.remove(i);
                } else {
                    yx7Var.n.set(i, new kzc(1, null, kzcVar.c, e52VarC2, null, null, 0L, null));
                }
            }
            i++;
        }
    }
}
