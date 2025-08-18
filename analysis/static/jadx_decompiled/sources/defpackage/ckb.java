package defpackage;

import android.app.Activity;

/* loaded from: classes2.dex */
public final class ckb extends u2 {
    public static final ckb c = new ckb(8);

    public static c64 b2(long j, long j2) {
        return new c64(zr6.k(au1.k(j, ":profile/edit/admin_permission?chat_id=", "&contact_id="), j2, "&permissions_type=change_admin"));
    }

    public final void Z1(long j) {
        P1().b(":profile/add-members?chat_id=" + j, null);
    }

    public final void a2(long j) {
        P1().b(ey8.i(j, ":chats?id=", "&type=local"), null);
    }

    public final void c2(long j) {
        P1().b(":profile/invite?id=" + j, null);
    }

    public final void d2(long j, String str) {
        P1().b(":profile/members?id=" + j + "&type=" + str, null);
    }

    public final void e2(long j) {
        f64 f64VarP1 = P1();
        y7g y7gVar = new y7g(13);
        y7gVar.b = ":profile";
        y7gVar.D(Long.valueOf(j), "id");
        y7gVar.D("contact", "type");
        f64VarP1.c(y7gVar.r(), null);
    }

    public final void f2() {
        Activity activityD;
        if (P1().d() || (activityD = ((haa) P1().a()).f().C().d()) == null) {
            return;
        }
        activityD.finish();
    }
}
