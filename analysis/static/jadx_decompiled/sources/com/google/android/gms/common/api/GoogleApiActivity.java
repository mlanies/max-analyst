package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.ee6;
import defpackage.fc9;
import defpackage.fp3;
import defpackage.ie6;
import defpackage.ph3;
import defpackage.zr6;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                ie6 ie6VarF = ie6.f(this);
                if (i2 == -1) {
                    fc9 fc9Var = ie6VarF.x0;
                    fc9Var.sendMessage(fc9Var.obtainMessage(3));
                } else if (i2 == 0) {
                    ie6VarF.g(new ph3(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                fp3.n(num);
                ee6.d.c(this, num.intValue(), this);
                this.a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.a = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    ie6.f(this).g(new ph3(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strI = zr6.i("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strI.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.a = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
