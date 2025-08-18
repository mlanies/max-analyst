package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class qu9 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Action.Builder d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static nt9 e(ArrayList<Parcelable> arrayList, int i) {
        vfc[] vfcVarArr;
        int i2;
        Notification.Action action = (Notification.Action) arrayList.get(i);
        RemoteInput[] remoteInputArrG = ot9.g(action);
        if (remoteInputArrG == null) {
            vfcVarArr = null;
        } else {
            vfc[] vfcVarArr2 = new vfc[remoteInputArrG.length];
            for (int i3 = 0; i3 < remoteInputArrG.length; i3++) {
                RemoteInput remoteInput = remoteInputArrG[i3];
                vfcVarArr2[i3] = new vfc(ot9.h(remoteInput), ot9.f(remoteInput), ot9.b(remoteInput), ot9.a(remoteInput), tt9.c(remoteInput), ot9.d(remoteInput), null);
            }
            vfcVarArr = vfcVarArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z = ot9.c(action).getBoolean("android.support.allowGeneratedReplies") || rt9.a(action);
        boolean z2 = ot9.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int iA = st9.a(action);
        boolean zE = tt9.e(action);
        boolean zA = i4 >= 31 ? ut9.a(action) : false;
        if (qt9.a(action) == null && (i2 = action.icon) != 0) {
            return new nt9(i2 != 0 ? IconCompat.d(null, "", i2) : null, action.title, action.actionIntent, ot9.c(action), vfcVarArr, null, z, iA, z2, zE, zA);
        }
        if (qt9.a(action) != null) {
            Icon iconA = qt9.a(action);
            PorterDuff.Mode mode = IconCompat.k;
            if (es6.c(iconA) != 2 || es6.a(iconA) != 0) {
                iconCompatA = cs6.a(iconA);
            }
        }
        return new nt9(iconCompatA, action.title, action.actionIntent, ot9.c(action), vfcVarArr, null, z, iA, z2, zE, zA);
    }
}
