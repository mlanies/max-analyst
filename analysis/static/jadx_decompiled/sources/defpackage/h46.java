package defpackage;

import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* loaded from: classes2.dex */
public final /* synthetic */ class h46 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;

    public /* synthetic */ h46(FrgAttachPhoto frgAttachPhoto, int i) {
        this.a = i;
        this.b = frgAttachPhoto;
    }

    @Override // defpackage.f6
    public final void run() {
        switch (this.a) {
            case 0:
                FrgAttachPhoto frgAttachPhoto = this.b;
                frgAttachPhoto.J1.r(frgAttachPhoto.D1, frgAttachPhoto.C1);
                b bVarB0 = frgAttachPhoto.b0();
                if (bVarB0 instanceof im) {
                    bVarB0.invalidateOptionsMenu();
                    break;
                }
                break;
            default:
                n46 n46VarR1 = this.b.r1();
                if (n46VarR1 != null) {
                    ((ActAttachesView) n46VarR1).e();
                    break;
                }
                break;
        }
    }
}
