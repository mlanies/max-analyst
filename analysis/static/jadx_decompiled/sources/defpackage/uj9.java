package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class uj9 implements l66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj9 b;

    public /* synthetic */ uj9(zj9 zj9Var, int i) {
        this.a = i;
        this.b = zj9Var;
    }

    @Override // defpackage.l66
    public final Object apply(Object obj) {
        oq7 oq7Var = (oq7) obj;
        switch (this.a) {
            case 0:
                awa awaVar = this.b.u0;
                oq7Var.m = (awaVar == null || awaVar.o == null) ? false : true;
                break;
            case 1:
                zj9 zj9Var = this.b;
                boolean z = zj9Var.B0;
                oq7Var.e = z;
                oq7Var.g = false;
                oq7Var.h = false;
                oq7Var.a = z;
                FrgLocalMedia frgLocalMediaK0 = ((ActLocalMedias) zj9Var.c).k0();
                oq7Var.f = frgLocalMediaK0 != null ? frgLocalMediaK0 instanceof FrgLocalVideo : false;
                break;
            case 2:
                boolean z2 = this.b.B0;
                oq7Var.g = z2;
                oq7Var.h = z2;
                oq7Var.e = false;
                break;
            case 3:
                zj9 zj9Var2 = this.b;
                up7 up7Var = zj9Var2.X;
                p4d p4dVar = zj9Var2.w0;
                int iG = p4dVar.g(up7Var);
                oq7Var.j = iG > 0 || p4dVar.c().size() < 100;
                oq7Var.k = iG;
                break;
            default:
                awa awaVar2 = this.b.u0;
                oq7Var.l = (awaVar2 == null || awaVar2.b == null) ? false : true;
                break;
        }
        return oq7Var;
    }
}
