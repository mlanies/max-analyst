package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class hfg extends fc9 {
    public final /* synthetic */ goc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfg(goc gocVar, Looper looper) {
        super(looper, 4, false);
        this.b = gocVar;
        Looper.getMainLooper();
    }

    @Override // defpackage.fc9, android.os.Handler
    public final void handleMessage(Message message) {
        goc gocVar = this.b;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new ggg());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof sgg) {
                        gocVar.g = (sgg) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        gocVar.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = goc.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        gocVar.b(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (gocVar.a) {
                        int i = 0;
                        while (true) {
                            try {
                                qpd qpdVar = gocVar.a;
                                if (i < qpdVar.c) {
                                    gocVar.b((String) qpdVar.f(i), intent2.getExtras());
                                    i++;
                                }
                            } finally {
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                gocVar.b(str, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }
}
