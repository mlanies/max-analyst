package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import ru.ok.android.externcalls.BuildConfig;

/* loaded from: classes2.dex */
public final class jye extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jye(Context context, int i) {
        super(0);
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                String strQ = c37.q();
                Context context = this.b;
                if (strQ.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(strQ.replace(':', '-'));
                }
                File file = new File(context.getCacheDir(), str);
                m6d.y(file);
                return lk5.J(file, "settings.data");
            default:
                Context applicationContext = this.b.getApplicationContext();
                uye uyeVar = new uye();
                uyeVar.b = new cqd("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
                wye wyeVar = new wye(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new l7b(uyeVar));
                wyeVar.b("calls-sdk-version", "125.1.0.48.3");
                return wyeVar;
        }
    }
}
