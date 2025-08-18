package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class sxe {
    public static WeakReference c;
    public o23 a;
    public final Executor b;

    public sxe(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized rxe a() {
        String str;
        rxe rxeVar;
        o23 o23Var = this.a;
        synchronized (((ArrayDeque) o23Var.o)) {
            str = (String) ((ArrayDeque) o23Var.o).peek();
        }
        Pattern pattern = rxe.d;
        rxeVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                rxeVar = new rxe(strArrSplit[0], strArrSplit[1]);
            }
        }
        return rxeVar;
    }
}
