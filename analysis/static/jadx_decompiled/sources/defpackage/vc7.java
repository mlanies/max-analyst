package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class vc7 {
    public static final int a = tu0.G(100 * fk4.d().getDisplayMetrics().density);
    public static final ki9 b = new ki9(6);
    public static int c;
    public static SharedPreferences d;
    public static final q0e e;
    public static final q0e f;

    static {
        q0e q0eVarA = r0e.a(Boolean.FALSE);
        e = q0eVarA;
        f = q0eVarA;
    }

    public static int a(Context context) {
        ki9 ki9Var = b;
        if (ki9Var.e == 0) {
            SharedPreferences sharedPreferences = d;
            if (sharedPreferences == null) {
                sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
            }
            if (d == null) {
                d = sharedPreferences;
            }
            int iMax = Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
            ki9Var.d(sharedPreferences.getInt("pref_keyboard_height_portrait", iMax), "pref_keyboard_height_portrait");
            ki9Var.d(sharedPreferences.getInt("pref_keyboard_height_portrait", iMax), "pref_keyboard_height_landscape");
        }
        int iB = ki9Var.b(1 == context.getResources().getConfiguration().orientation ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape");
        return iB >= 0 ? ki9Var.c[iB] : Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
    }

    public static boolean b(int i) {
        return i > a;
    }
}
