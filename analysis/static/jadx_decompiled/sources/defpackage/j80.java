package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class j80 extends b0 {
    public final String a;
    public final String b;

    public j80(String str, String str2) {
        this.a = str2;
        this.b = str;
    }

    @Override // defpackage.fl
    public final kl getScope() {
        return kl.b;
    }

    @Override // defpackage.fl
    public final Uri getUri() {
        return sl.a("auth.anonymLogin");
    }

    @Override // defpackage.b0
    public final void populateParams(el elVar) {
        elVar.b("referrer", null);
        String str = this.a;
        elVar.b("deviceId", str);
        elVar.a(new yp0("verification_supported", true));
        elVar.b("verification_token", null);
        elVar.b("verification_supported_v", "1");
        elVar.b("client", "test");
        elVar.a(new yp0("gen_token", true));
        if (str == null) {
            str = "test";
        }
        String str2 = this.b;
        elVar.b("session_data", str2 != null ? k7d.j("{\"auth_token\": \"", str2, "\", \"version\": 3, \"device_id\": \"", str, "\", \"client_version\": 1}") : zr6.i("{\"version\": 2, \"device_id\": \"", str, "\", \"client_version\": 1}"));
    }
}
