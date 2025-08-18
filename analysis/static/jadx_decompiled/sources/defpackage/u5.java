package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ u5(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    @Override // java.lang.Runnable
    public final void run() {
        up7 up7Var;
        FrgLocalVideo frgLocalVideo;
        bk9 bk9Var;
        ActLocalMedias actLocalMedias = this.b;
        switch (this.a) {
            case 0:
                if (actLocalMedias.k1 != null) {
                    ((y8a) ((ed3) actLocalMedias.K0.b)).k().l(actLocalMedias.k1);
                }
                if (actLocalMedias.l1 != null) {
                    ((y8a) ((ed3) actLocalMedias.K0.b)).k().l(actLocalMedias.l1);
                }
                if (actLocalMedias.Z0 != null) {
                    ArrayList arrayList = actLocalMedias.V0;
                    if (arrayList.size() != 0 && (up7Var = (up7) arrayList.get(actLocalMedias.W0)) != null) {
                        FrgLocalMedia frgLocalMediaF = actLocalMedias.Z0.F(up7Var.b);
                        if ((frgLocalMediaF instanceof FrgLocalVideo) && (bk9Var = (frgLocalVideo = (FrgLocalVideo) frgLocalMediaF).K1) != null) {
                            bq7 bq7Var = (bq7) frgLocalVideo.I1;
                            bq7Var.g = bk9Var;
                            if (bq7Var.f != null) {
                                int iJ = bq7Var.j();
                                int iH = bq7Var.h();
                                int i = bq7Var.i();
                                ve8 ve8Var = bq7Var.e;
                                if (ve8Var != null) {
                                    ve8Var.P(iJ, iH, i);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                actLocalMedias.startPostponedEnterTransition();
                break;
            case 2:
                int i2 = ActLocalMedias.s1;
                actLocalMedias.v0(false);
                break;
            case 3:
                int i3 = ActLocalMedias.s1;
                actLocalMedias.getWindow().getDecorView().invalidate();
                break;
            case 4:
                int i4 = ActLocalMedias.s1;
                actLocalMedias.b0(actLocalMedias);
                break;
            case 5:
                MediaBarPreviewLayout mediaBarPreviewLayout = actLocalMedias.f1;
                WeakHashMap weakHashMap = zmf.a;
                mmf.c(mediaBarPreviewLayout);
                break;
            default:
                View view = actLocalMedias.e1;
                WeakHashMap weakHashMap2 = zmf.a;
                mmf.c(view);
                break;
        }
    }
}
