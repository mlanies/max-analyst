package one.me.sdk.vendor.push;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.ad;
import defpackage.b99;
import defpackage.bcf;
import defpackage.f5a;
import defpackage.hm9;
import defpackage.hyc;
import defpackage.j47;
import defpackage.k4a;
import defpackage.pk;
import defpackage.q33;
import defpackage.us;
import defpackage.wfc;
import defpackage.yke;
import defpackage.zke;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/sdk/vendor/push/FcmMessagingService;", "", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "google_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FcmMessagingService extends FirebaseMessagingService {
    public final String s0 = "FCM";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c() {
        hm9.n(this.s0, "onDeletedMessages");
        zke zkeVar = (zke) ((b99) bcf.a.getAccessor().c(b99.class));
        hm9.n(zkeVar.i, "onDeletedMessages");
        zkeVar.a().a().f(false, true);
        ((ad) zkeVar.c.getValue()).f("FCM_ON_DELETED_MESSAGES");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(wfc wfcVar) throws NumberFormatException {
        long jLongValue;
        hm9.n(this.s0, "onMessageReceived");
        b99 b99Var = (b99) bcf.a.getAccessor().c(b99.class);
        us usVar = wfcVar.b;
        Bundle bundle = wfcVar.a;
        if (usVar == null) {
            us usVar2 = new us(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        usVar2.put(str, str2);
                    }
                }
            }
            wfcVar.b = usVar2;
        }
        us usVar3 = wfcVar.b;
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            jLongValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof String) {
            try {
                jLongValue = Long.parseLong((String) obj2);
            } catch (NumberFormatException unused) {
                Objects.toString(obj2);
            }
        } else {
            jLongValue = 0;
        }
        zke zkeVar = (zke) b99Var;
        j47.T(zkeVar.h, null, null, new yke(usVar3, zkeVar, jLongValue, null), 3);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String str) {
        hm9.n(this.s0, "onNewToken");
        zke zkeVar = (zke) ((b99) bcf.a.getAccessor().c(b99.class));
        ((hyc) ((q33) zkeVar.d.getValue())).m("user.fcmToken", str);
        if (str.length() <= 0 || !((f5a) zkeVar.e.getValue()).d()) {
            return;
        }
        ((k4a) ((pk) zkeVar.f.getValue())).s();
    }
}
