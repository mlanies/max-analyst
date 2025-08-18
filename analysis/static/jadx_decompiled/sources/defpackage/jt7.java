package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class jt7 extends dle {
    public jt7(String str, boolean z, long j, long j2, long j3, String str2, long j4, long j5, long j6) {
        long j7;
        super(sla.v0);
        p(ApiProtocol.KEY_TOKEN, str);
        d("interactive", z);
        if (j > 0) {
            i(j, "chatsSync");
            j7 = 0;
        } else {
            j7 = 0;
        }
        if (j2 > j7) {
            i(j2, "contactsSync");
        }
        if (j3 != j7) {
            i(j3, "presenceSync");
        }
        if (str2 != null && str2.length() != 0) {
            p("configHash", str2);
        }
        if (j4 > 0) {
            i(j4, "callsSync");
        }
        if (j5 > 0) {
            i(j5, "lastLogin");
        }
        if (j6 > 0) {
            i(j6, "draftsSync");
        }
    }

    @Override // defpackage.dle
    public final ele P() {
        return sp3.o;
    }

    @Override // defpackage.dle
    public final boolean V() {
        return false;
    }
}
