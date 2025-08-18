package defpackage;

import androidx.fragment.app.a;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* loaded from: classes2.dex */
public final class i5 implements gof {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ i5(r5 r5Var, int i) {
        this.a = i;
        this.b = r5Var;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i, float f) {
    }

    private final void d(int i, float f) {
    }

    @Override // defpackage.gof
    public final void k(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.gof
    public final void m(int i) {
        switch (this.a) {
            case 0:
                ActAttachesView actAttachesView = (ActAttachesView) this.b;
                s20 s20Var = actAttachesView.W0;
                if (s20Var != null) {
                    if (s20Var.j.indexOf(actAttachesView.g1) != i) {
                        FrgAttachView frgAttachViewK = actAttachesView.W0.k(actAttachesView.g1);
                        if (frgAttachViewK instanceof FrgAttachVideo) {
                            ((FrgAttachVideo) frgAttachViewK).G1();
                        }
                        s20 s20Var2 = actAttachesView.W0;
                        a aVar = (a) s20Var2.g.get(s20Var2.h(i));
                        if (aVar instanceof FrgAttachVideo) {
                            ((FrgAttachVideo) aVar).F1();
                        }
                        mpa mpaVarL = actAttachesView.W0.l(i);
                        if (mpaVarL != null) {
                            actAttachesView.g1 = ((l20) mpaVarL.a).r;
                            actAttachesView.e1 = false;
                            actAttachesView.r0();
                            actAttachesView.s0();
                            FrgAttachView frgAttachViewK2 = actAttachesView.W0.k(actAttachesView.g1);
                            String str = frgAttachViewK2 instanceof FrgAttachPhoto ? "ATTACH_PHOTO" : frgAttachViewK2 instanceof FrgAttachVideo ? "ATTACH_VIDEO" : frgAttachViewK2 instanceof FrgAttachUnknown ? "ATTACH_UNKNOWN" : null;
                            if (!oag.t(str)) {
                                hm9.n("ru.ok.messages.media.attaches.ActAttachesView", "sendFragmentStats: " + str);
                                ((y8a) vl.b()).b().f(str);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((ActContactAvatars) this.b).m(i);
                break;
        }
    }

    @Override // defpackage.gof
    public final void n(int i, float f) {
        int i2 = this.a;
    }
}
