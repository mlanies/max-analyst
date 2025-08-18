package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class cdb implements k64 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Enum c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cdb(long j, reb rebVar, qeb qebVar) {
        this.b = j;
        this.c = rebVar;
        this.o = qebVar;
    }

    @Override // defpackage.k64
    public final Object a() {
        ActivityWrapperWidget activityWrapperWidget;
        switch (this.a) {
            case 0:
                hdb hdbVar = (hdb) this.c;
                int iOrdinal = hdbVar.ordinal();
                gdb gdbVar = (gdb) this.o;
                long j = this.b;
                if (iOrdinal == 0) {
                    se5 se5Var = (se5) ((qe5) gdbVar.b.getValue());
                    se5Var.getClass();
                    if (se5Var.n(PmsKey.f9avatarsscreenenabled, false)) {
                        return new ProfileAvatarsScreen(j, hdbVar);
                    }
                    String strB = nec.a(ActProfilePhoto.class).b();
                    if (strB == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    activityWrapperWidget = new ActivityWrapperWidget(strB, new jh2(j, 3));
                } else {
                    if (iOrdinal == 1) {
                        return e5f.a;
                    }
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    se5 se5Var2 = (se5) ((qe5) gdbVar.b.getValue());
                    se5Var2.getClass();
                    if (se5Var2.n(PmsKey.f9avatarsscreenenabled, false)) {
                        return new ProfileAvatarsScreen(j, hdbVar);
                    }
                    String strB2 = nec.a(ActContactAvatars.class).b();
                    if (strB2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    activityWrapperWidget = new ActivityWrapperWidget(strB2, new jh2(j, 4));
                }
                return activityWrapperWidget;
            default:
                return new ProfileChangeLinkScreen(this.b, (reb) this.c, (qeb) this.o);
        }
    }

    public /* synthetic */ cdb(hdb hdbVar, gdb gdbVar, long j) {
        this.c = hdbVar;
        this.o = gdbVar;
        this.b = j;
    }
}
