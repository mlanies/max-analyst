package defpackage;

import androidx.fragment.app.b;
import androidx.viewpager.widget.ViewPager;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class l46 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ l46(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    @Override // defpackage.f6
    public final void run() {
        ViewPager viewPager;
        mpa mpaVarL;
        l20 l20Var;
        switch (this.a) {
            case 0:
                FrgAttachVideo frgAttachVideo = this.b;
                if (frgAttachVideo.o1) {
                    frgAttachVideo.L1();
                    b bVarB0 = frgAttachVideo.b0();
                    if (bVarB0 instanceof im) {
                        bVarB0.invalidateOptionsMenu();
                    }
                    n46 n46VarR1 = frgAttachVideo.r1();
                    if (n46VarR1 != null) {
                        String str = frgAttachVideo.D1.r;
                        ActAttachesView actAttachesView = (ActAttachesView) n46VarR1;
                        s20 s20Var = actAttachesView.W0;
                        boolean zD = false;
                        if (s20Var != null && (viewPager = actAttachesView.f1) != null && (mpaVarL = s20Var.l(viewPager.getCurrentItem())) != null && (l20Var = (l20) mpaVarL.a) != null) {
                            zD = oag.d(l20Var.r, str);
                        }
                        if (zD && frgAttachVideo.N1 == null) {
                            frgAttachVideo.F1();
                            break;
                        }
                    }
                    frgAttachVideo.J1();
                    break;
                }
                break;
            case 1:
                n46 n46VarR12 = this.b.r1();
                if (n46VarR12 != null) {
                    ((ActAttachesView) n46VarR12).e();
                    break;
                }
                break;
            default:
                FrgAttachVideo frgAttachVideo2 = this.b;
                if (frgAttachVideo2.D1.d.a != 0) {
                    frgAttachVideo2.J1();
                    break;
                } else {
                    au8 au8VarN = frgAttachVideo2.q1.n();
                    es8 es8Var = frgAttachVideo2.C1;
                    String str2 = frgAttachVideo2.D1.r;
                    jy8 jy8Var = (jy8) frgAttachVideo2.q1.getAccessor().c(jy8.class);
                    au8VarN.getClass();
                    cqc.a(new vt8(au8VarN, es8Var, str2, jy8Var), au8VarN.h, null, new hj8(12), null);
                    break;
                }
        }
    }
}
