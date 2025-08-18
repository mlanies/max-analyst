package defpackage;

import java.io.File;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* loaded from: classes2.dex */
public final /* synthetic */ class g46 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;
    public final /* synthetic */ int c;

    public /* synthetic */ g46(FrgAttachPhoto frgAttachPhoto, int i, int i2) {
        this.a = i2;
        this.b = frgAttachPhoto;
        this.c = i;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                File file = (File) obj;
                FrgAttachPhoto frgAttachPhoto = this.b;
                frgAttachPhoto.M1 = null;
                frgAttachPhoto.j1();
                int i = this.c;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            v3c.A(frgAttachPhoto.d0(), frgAttachPhoto.C1, frgAttachPhoto.D1, frgAttachPhoto.q1.n(), ((y8a) ((ed3) frgAttachPhoto.p1.b)).h());
                            break;
                        }
                    } else {
                        hm9.d0(frgAttachPhoto.b0(), file, ((y8a) ((ed3) frgAttachPhoto.p1.b)).h());
                        break;
                    }
                } else {
                    new mzd(((y8a) ((ed3) frgAttachPhoto.p1.b)).h(), ((y8a) ((ed3) frgAttachPhoto.p1.b)).f(), ((y8a) ((ed3) frgAttachPhoto.p1.b)).n().b).a(frgAttachPhoto, file.getAbsolutePath());
                    break;
                }
                break;
            default:
                FrgAttachPhoto frgAttachPhoto2 = this.b;
                frgAttachPhoto2.M1 = null;
                frgAttachPhoto2.j1();
                int i2 = this.c;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            a14.K(frgAttachPhoto2.d0(), jpc.t);
                            break;
                        }
                    } else {
                        a14.K(frgAttachPhoto2.d0(), jpc.W2);
                        break;
                    }
                } else {
                    a14.K(frgAttachPhoto2.d0(), jpc.P2);
                    break;
                }
                break;
        }
    }
}
