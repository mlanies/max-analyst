package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class gu9 extends pu9 {
    public final int e;
    public final kua f;
    public final PendingIntent g;
    public final PendingIntent h;
    public final PendingIntent i;

    public gu9(int i, kua kuaVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (TextUtils.isEmpty(kuaVar.a)) {
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
        this.e = i;
        this.f = kuaVar;
        this.g = pendingIntent3;
        this.h = pendingIntent2;
        this.i = pendingIntent;
    }

    @Override // defpackage.pu9
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", false);
        kua kuaVar = this.f;
        if (kuaVar != null) {
            bundle.putParcelable("android.callPerson", eu9.b(jua.b(kuaVar)));
        }
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
    }

    @Override // defpackage.pu9
    public final void b(m5d m5dVar) throws Resources.NotFoundException {
        Notification.CallStyle callStyleA;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.e;
        kua kuaVar = this.f;
        Notification.Builder builder = (Notification.Builder) m5dVar.c;
        String string = null;
        if (i < 31) {
            builder.setContentTitle(kuaVar != null ? kuaVar.a : null);
            Bundle bundle = ((bu9) this.b).w;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : ((bu9) this.b).w.getCharSequence("android.text");
            if (charSequence == null) {
                if (i2 == 1) {
                    string = ((bu9) this.b).a.getResources().getString(r0c.call_notification_incoming_text);
                } else if (i2 == 2) {
                    string = ((bu9) this.b).a.getResources().getString(r0c.call_notification_ongoing_text);
                } else if (i2 == 3) {
                    string = ((bu9) this.b).a.getResources().getString(r0c.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            if (kuaVar != null) {
                IconCompat iconCompat = kuaVar.b;
                if (iconCompat != null) {
                    du9.c(builder, cs6.d(iconCompat, ((bu9) this.b).a));
                }
                eu9.a(builder, jua.b(kuaVar));
            }
            cu9.b(builder, "call");
            return;
        }
        PendingIntent pendingIntent = this.g;
        if (i2 != 1) {
            PendingIntent pendingIntent2 = this.i;
            if (i2 == 2) {
                kuaVar.getClass();
                callStyleA = fu9.b(jua.b(kuaVar), pendingIntent2);
            } else if (i2 != 3) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    String.valueOf(i2);
                }
                callStyleA = null;
            } else {
                kuaVar.getClass();
                callStyleA = fu9.c(jua.b(kuaVar), pendingIntent2, pendingIntent);
            }
        } else {
            kuaVar.getClass();
            callStyleA = fu9.a(jua.b(kuaVar), this.h, pendingIntent);
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            fu9.i(callStyleA, null);
            fu9.g(callStyleA, false);
        }
    }

    @Override // defpackage.pu9
    public final String e() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final nt9 p(int i, int i2, int i3, PendingIntent pendingIntent) {
        Integer numValueOf = Integer.valueOf(lt3.a(((bu9) this.b).a, i3));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((bu9) this.b).a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(numValueOf.intValue()), 0, spannableStringBuilder.length(), 18);
        nt9 nt9VarA = new mt9(IconCompat.c(((bu9) this.b).a, i), spannableStringBuilder, pendingIntent, new Bundle()).a();
        nt9VarA.a.putBoolean("key_action_priority", true);
        return nt9VarA;
    }
}
