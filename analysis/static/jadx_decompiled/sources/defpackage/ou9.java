package defpackage;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ou9 extends pu9 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final kua g;
    public CharSequence h;
    public Boolean i;

    public ou9(kua kuaVar) {
        if (TextUtils.isEmpty(kuaVar.a)) {
            throw new IllegalArgumentException("User's name must not be empty.");
        }
        this.g = kuaVar;
    }

    @Override // defpackage.pu9
    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        kua kuaVar = this.g;
        bundle.putCharSequence("android.selfDisplayName", kuaVar.a);
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", kuaVar.a);
        IconCompat iconCompat = kuaVar.b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle2.putInt("type", iconCompat.a);
            bundle2.putInt("int1", iconCompat.e);
            bundle2.putInt("int2", iconCompat.f);
            bundle2.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", kuaVar.c);
        bundle3.putString("key", kuaVar.d);
        bundle3.putBoolean("isBot", kuaVar.e);
        bundle3.putBoolean("isImportant", kuaVar.f);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", nu9.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", nu9.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // defpackage.pu9
    public final void b(m5d m5dVar) {
        bu9 bu9Var = (bu9) this.b;
        boolean zBooleanValue = false;
        if (bu9Var == null || bu9Var.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.h != null) {
            zBooleanValue = true;
        }
        this.i = Boolean.valueOf(zBooleanValue);
        kua kuaVar = this.g;
        kuaVar.getClass();
        Notification.MessagingStyle messagingStyleA = ku9.a(jua.b(kuaVar));
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            nu9 nu9Var = (nu9) it.next();
            kua kuaVar2 = nu9Var.c;
            Notification.MessagingStyle.Message messageB = mu9.b(nu9Var.a, nu9Var.b, kuaVar2 != null ? jua.b(kuaVar2) : null);
            String str = nu9Var.e;
            if (str != null) {
                lu9.b(messageB, str, nu9Var.f);
            }
            iu9.a(messagingStyleA, messageB);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            nu9 nu9Var2 = (nu9) it2.next();
            kua kuaVar3 = nu9Var2.c;
            Notification.MessagingStyle.Message messageB2 = mu9.b(nu9Var2.a, nu9Var2.b, kuaVar3 == null ? null : jua.b(kuaVar3));
            String str2 = nu9Var2.e;
            if (str2 != null) {
                lu9.b(messageB2, str2, nu9Var2.f);
            }
            ju9.a(messagingStyleA, messageB2);
        }
        this.i.getClass();
        iu9.c(messagingStyleA, this.h);
        ku9.b(messagingStyleA, this.i.booleanValue());
        messagingStyleA.setBuilder((Notification.Builder) m5dVar.c);
    }

    @Override // defpackage.pu9
    public final String e() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
