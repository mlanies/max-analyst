package defpackage;

import java.lang.ref.WeakReference;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* loaded from: classes2.dex */
public final class r46 implements zu6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ WeakReference o;

    public /* synthetic */ r46(long j, String str, WeakReference weakReference, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.o = weakReference;
    }

    @Override // defpackage.zu6
    public final void A(String str) {
        switch (this.a) {
            case 0:
                ((y8a) vl.b()).r().c(new fn4(this.b, 0L, "", str, null));
                break;
            default:
                ((y8a) vl.b()).r().c(new fn4(this.b, 0L, "", str, null));
                break;
        }
    }

    @Override // defpackage.zu6
    public final void k() {
        switch (this.a) {
            case 0:
                ((y8a) vl.b()).r().c(new hn4(this.c, null, this.b, 0L));
                break;
            default:
                ((y8a) vl.b()).r().c(new hn4(this.c, null, this.b, 0L));
                break;
        }
    }

    @Override // defpackage.zu6
    public final void w() {
        switch (this.a) {
            case 0:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.o.get();
                if (frgContactAvatar != null && frgContactAvatar.g1() != null) {
                    frgContactAvatar.q1();
                    break;
                }
                break;
            default:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) this.o.get();
                if (frgProfilePhoto != null && frgProfilePhoto.g1() != null) {
                    frgProfilePhoto.q1();
                    break;
                }
                break;
        }
    }
}
