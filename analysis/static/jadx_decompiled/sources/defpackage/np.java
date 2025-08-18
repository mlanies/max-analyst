package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class np extends ty3 implements oca {
    public static final np a = new np();
    public static je7 b;
    public static final String[] c;
    public static final khe d;
    public static final khe e;

    static {
        iy2.m.getClass();
        c = new String[]{"Prefs", "FilePrefs", hy2.b, "chats-list-job-executor"};
        d = new khe(new m(7));
        e = new khe(new m(8));
    }

    @Override // defpackage.ty3
    public final void a(String str, Throwable th) {
        je7 je7Var;
        z7d z7dVar;
        khe kheVar = e;
        if (str != null && str.length() != 0) {
            if (((pye) kheVar.getValue()) != null) {
                pye.b(null, th, str);
            }
        } else if (((th instanceof Error) || !((je7Var = b) == null || (z7dVar = (z7d) je7Var.getValue()) == null || !z7dVar.n(PmsKey.f124tracernonfatalcrashedenabled, false))) && ((pye) kheVar.getValue()) != null) {
            pye.b(null, th, null);
        }
    }

    @Override // defpackage.ty3
    public final void b(String str, String str2) {
        if (((kye) d.getValue()) != null) {
            kye kyeVar = kye.a;
            Map mapSingletonMap = Collections.singletonMap(str, str2);
            if (kye.b) {
                return;
            }
            try {
                kbd kbdVar = kye.e;
                if (kbdVar == null) {
                    kbdVar = null;
                }
                kbdVar.f(mapSingletonMap);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.ty3
    public final void c(String str) {
        if (((kye) d.getValue()) != null) {
            try {
                kbd kbdVar = kye.e;
                if (kbdVar == null) {
                    kbdVar = null;
                }
                kbdVar.getClass();
                kbdVar.f(Collections.singletonMap("userId", str));
            } catch (Exception unused) {
            }
        }
    }
}
