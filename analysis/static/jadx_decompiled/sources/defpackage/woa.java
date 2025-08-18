package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class woa {
    public static final String a = a14.O("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            a14 a14VarU = a14.u();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            a14VarU.n(str, sb.toString());
        } catch (Exception e) {
            a14 a14VarU2 = a14.u();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            a14VarU2.o(str, sb2.toString(), e);
        }
    }
}
