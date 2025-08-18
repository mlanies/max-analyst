package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ol5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public ol5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = v9e.a;
        fp3.p("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static ol5 a(Context context) {
        b9b b9bVar = new b9b(context, 7);
        String strN = b9bVar.n("google_app_id");
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        return new ol5(strN, b9bVar.n("google_api_key"), b9bVar.n("firebase_database_url"), b9bVar.n("ga_trackingId"), b9bVar.n("gcm_defaultSenderId"), b9bVar.n("google_storage_bucket"), b9bVar.n("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ol5)) {
            return false;
        }
        ol5 ol5Var = (ol5) obj;
        return s36.l(this.b, ol5Var.b) && s36.l(this.a, ol5Var.a) && s36.l(this.c, ol5Var.c) && s36.l(this.d, ol5Var.d) && s36.l(this.e, ol5Var.e) && s36.l(this.f, ol5Var.f) && s36.l(this.g, ol5Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        qz7 qz7Var = new qz7(this);
        qz7Var.h(this.b, "applicationId");
        qz7Var.h(this.a, "apiKey");
        qz7Var.h(this.c, "databaseUrl");
        qz7Var.h(this.e, "gcmSenderId");
        qz7Var.h(this.f, "storageBucket");
        qz7Var.h(this.g, "projectId");
        return qz7Var.toString();
    }
}
