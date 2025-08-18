package defpackage;

import java.util.Collections;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* loaded from: classes2.dex */
public final /* synthetic */ class a56 implements qj3, lag {
    public final /* synthetic */ FrgProfilePhoto a;

    @Override // defpackage.qj3
    public void accept(Object obj) {
        FrgProfilePhoto frgProfilePhoto = this.a;
        frgProfilePhoto.getClass();
        cu8 cu8Var = ((es8) obj).a;
        frgProfilePhoto.F1 = cu8Var;
        String str = cu8Var.f().f;
        frgProfilePhoto.F1.f().getClass();
        frgProfilePhoto.E1 = new e6(Collections.singletonList(str), frgProfilePhoto.E1.c);
        frgProfilePhoto.H1 = true;
        frgProfilePhoto.s1();
    }

    @Override // defpackage.lag
    public void d(Throwable th) {
        FrgProfilePhoto frgProfilePhoto = this.a;
        frgProfilePhoto.C1.setVisibility(4);
        frgProfilePhoto.D1.setVisibility(0);
        frgProfilePhoto.D1.setZoomEnabled(false);
        a14.N(1, frgProfilePhoto.b0(), frgProfilePhoto.h0(jpc.G));
    }
}
