package defpackage;

import android.content.Context;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.Collections;
import java.util.regex.Pattern;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes2.dex */
public abstract class zqe {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("#(?i)([\\p{L}0-9_]+)");
    }

    public static String a(zua zuaVar, String str, String str2, String str3) {
        qva qvaVarT;
        if (oag.t(str2)) {
            str2 = str3;
        }
        String str4 = "RU";
        if (!oag.t(str2)) {
            String upperCase = str2.toUpperCase();
            if (Collections.unmodifiableSet(zuaVar.f).contains(upperCase)) {
                str4 = upperCase;
            }
        }
        try {
            qvaVarT = zuaVar.t(str4, !str.startsWith("+") ? "+".concat(str) : str);
        } catch (NumberParseException unused) {
            qvaVarT = null;
        }
        return qvaVarT == null ? str : zuaVar.d(qvaVarT, 2);
    }

    public static String b(Context context, Throwable th) {
        int i;
        if (th instanceof FetcherException) {
            switch (au1.s(((FetcherException) th).a)) {
                case 5:
                    i = jpc.n3;
                    break;
                case 6:
                    i = jpc.u3;
                    break;
                case 7:
                    i = jpc.s3;
                    break;
                case 8:
                    i = jpc.r3;
                    break;
                case 9:
                    i = jpc.q3;
                    break;
                case 10:
                    i = jpc.j3;
                    break;
                default:
                    i = jpc.G;
                    break;
            }
        } else {
            i = jpc.j3;
        }
        return context.getString(i);
    }
}
