package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;

/* loaded from: classes.dex */
public abstract class u16 {
    public static final t16 a = t16.a;

    public static t16 a(a aVar) {
        while (aVar != null) {
            if (aVar.o0()) {
                aVar.f0();
            }
            aVar = aVar.I0;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            violation.a.getClass();
        }
    }

    public static final void c(a aVar, String str) {
        b(new FragmentReuseViolation(aVar, "Attempting to reuse fragment " + aVar + " with previous ID " + str));
        a(aVar).getClass();
    }
}
