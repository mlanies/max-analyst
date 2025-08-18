package defpackage;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public abstract class vr4 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        String diagnosticInfo = ((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo();
        int i = maf.a;
        int i2 = 0;
        if (diagnosticInfo != null && (length = (strArrSplit = diagnosticInfo.split("_", -1)).length) >= 2) {
            String str = strArrSplit[length - 1];
            boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
            try {
                str.getClass();
                int i3 = Integer.parseInt(str);
                if (z) {
                    i3 = -i3;
                }
                i2 = i3;
            } catch (NumberFormatException unused) {
            }
        }
        return maf.r(i2);
    }
}
