package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.jcf;
import defpackage.kcf;
import defpackage.lcf;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(jcf jcfVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        lcf lcfVarH = remoteActionCompat.a;
        if (jcfVar.e(1)) {
            lcfVarH = jcfVar.h();
        }
        remoteActionCompat.a = (IconCompat) lcfVarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (jcfVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kcf) jcfVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (jcfVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kcf) jcfVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) jcfVar.g(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        if (jcfVar.e(5)) {
            z = ((kcf) jcfVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (jcfVar.e(6)) {
            z2 = ((kcf) jcfVar).e.readInt() != 0;
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, jcf jcfVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        jcfVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        jcfVar.i(1);
        jcfVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        jcfVar.i(2);
        Parcel parcel = ((kcf) jcfVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        jcfVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        jcfVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        jcfVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        jcfVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
