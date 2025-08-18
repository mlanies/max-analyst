package defpackage;

import android.view.View;
import java.util.List;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final class y5 extends mof {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ y5(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    private final void d(int i) {
    }

    private final void e(int i, float f, int i2) {
    }

    @Override // defpackage.mof
    public void a(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.mof
    public void b(int i, float f, int i2) {
        int i3 = this.a;
    }

    @Override // defpackage.mof
    public final void c(int i) {
        boolean zB = false;
        ActLocalMedias actLocalMedias = this.b;
        switch (this.a) {
            case 0:
                if (actLocalMedias.Z0 != null) {
                    up7 up7Var = (up7) actLocalMedias.V0.get(actLocalMedias.W0);
                    if (up7Var != null) {
                        FrgLocalMedia frgLocalMediaF = actLocalMedias.Z0.F(up7Var.b);
                        if (frgLocalMediaF instanceof FrgLocalVideo) {
                            FrgLocalVideo frgLocalVideo = (FrgLocalVideo) frgLocalMediaF;
                            View view = (View) frgLocalVideo.J1.c;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            frgLocalVideo.w1();
                        }
                    }
                    up7 up7Var2 = (up7) actLocalMedias.V0.get(i);
                    if (up7Var2 != null) {
                        FrgLocalMedia frgLocalMediaF2 = actLocalMedias.Z0.F(up7Var2.b);
                        if (frgLocalMediaF2 instanceof FrgLocalVideo) {
                            ((FrgLocalVideo) frgLocalMediaF2).v1();
                        }
                    }
                }
                actLocalMedias.W0 = i;
                actLocalMedias.u0(i);
                String str = null;
                if (actLocalMedias.V0.size() - i < 6) {
                    xp7 xp7VarM0 = actLocalMedias.m0();
                    String str2 = actLocalMedias.X0;
                    if (str2 == null) {
                        xp7VarM0.getClass();
                    } else {
                        b86 b86Var = (b86) xp7VarM0.g.get(str2);
                        if (b86Var != null) {
                            zB = ((fz6) xp7VarM0.c).b(b86Var);
                        }
                    }
                    if (zB) {
                        xp7 xp7VarM02 = actLocalMedias.m0();
                        j47.T(xp7VarM02.e, ((w9a) xp7VarM02.d).a().plus(xp7VarM02.b), null, new wp7(xp7VarM02, actLocalMedias.X0, null), 2);
                    }
                }
                FrgLocalMedia frgLocalMediaK0 = actLocalMedias.k0();
                if (frgLocalMediaK0 != null) {
                    if (frgLocalMediaK0 instanceof FrgLocalPhoto) {
                        str = "LOCAL_PHOTO";
                    } else if (frgLocalMediaK0 instanceof FrgLocalVideo) {
                        str = "LOCAL_VIDEO";
                    } else if (frgLocalMediaK0 instanceof FrgLocalGif) {
                        str = "LOCAL_GIF";
                    }
                    if (!oag.t(str)) {
                        hm9.n("ru.ok.messages.media.mediabar.ActLocalMedias", "sendFragmentStats: " + str);
                        ((y8a) ((ed3) actLocalMedias.K0.b)).b().f(str);
                    }
                }
                actLocalMedias.i1.Z1((up7) actLocalMedias.V0.get(actLocalMedias.W0));
                break;
            default:
                int i2 = ActLocalMedias.s1;
                List listC = actLocalMedias.m0().f.c();
                int iG = actLocalMedias.m0().f.g((up7) actLocalMedias.V0.get(i)) - 1;
                if (iG == -1) {
                    for (int i3 = 0; i3 < listC.size(); i3++) {
                        ((r4d) listC.get(i3)).e = false;
                    }
                    actLocalMedias.t0();
                    break;
                } else {
                    int i4 = 0;
                    while (i4 < listC.size()) {
                        ((r4d) listC.get(i4)).e = iG == i4;
                        i4++;
                    }
                    actLocalMedias.t0();
                    actLocalMedias.f1.x(i);
                    break;
                }
        }
    }
}
